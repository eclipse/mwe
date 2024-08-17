#!/bin/bash
# Use this script to set MWE and MWE2 version of this project.
# The script has a parameter 'release' which can be used to set a
# final build version for milestone/release builds.
# By default 'release' is valued to 'N' for nightly builds,
# which then changes the versions to a snapshot version.
# For milestone/release builds OSGi artifacts not changed in their
# specified versions.

xargs_sed_inplace() {
  if [[ "$OSTYPE" == "darwin"* ]]; then
    xargs sed -i '' "$@"
  else
    xargs sed -i "$@" 
  fi
}

sed_inplace() {
  if [[ "$OSTYPE" == "darwin"* ]]; then
    sed -i '' "$@"
  else
    sed -i "$@" 
  fi
}

# args parsing inspired by https://gist.github.com/jehiah/855086
while [ "$1" != "" ]; do
  PARAM=`echo $1 | awk -F= '{print $1}'`
  VALUE=`echo $1 | awk -F= '{print $2}'`
  case $PARAM in
    -h | --help)
      echo "Set project version"
      echo ""
      echo -e "\t-h --help"
      echo -e "\t--release=<TYPE> (valid values: N,Beta,M0,M1,M2,M3,M4,M5,RC1,RC2,GA)"
      echo ""
      exit
      ;;
    --release)
      RELEASE_QUALIFIER=($VALUE)
      ;;
  esac
  shift
done

# Set default to 'N'
RELEASE_QUALIFIER=${RELEASE_QUALIFIER:-N}
# TODO Check RELEASE_QUALIFIER for valid values

# Read current version from pom.xml files with grep & sed
# Make a proposal to increment the version to the next minor release using awk
# Ask user to enter the new version with proposed default

MWE2_FROM=$(grep -m 1 "<version>" plugins/pom.xml |sed -e "s?.*<version>\(.*\)</version>.*?\1?")
# Version without -SNAPSHOT
MWE2_FROM_QUALIFIER=$(echo $MWE2_FROM |awk -F"-" '{print $2}')
MWE2_FROM_BASE=$(echo $MWE2_FROM | sed -e "s?-SNAPSHOT??")



# Read MWE version from org.eclipse.emf.mwe.core/pom.xml
# MWE version is the 2nd occurance of <version> tag => grep first 2 matches and tail for 2nd
MWE_FROM=$(grep -m 2 "<version>" plugins/org.eclipse.emf.mwe.core/pom.xml |tail -n1 |sed -e "s?.*<version>\(.*\)</version>.*?\1?")
MWE_FROM_QUALIFIER=$(echo $MWE_FROM |awk -F"-" '{print $2}')
MWE_FROM_BASE=$(echo $MWE_FROM | sed -e "s?-SNAPSHOT??")



if [ "$RELEASE_QUALIFIER" == "N" ]; then
  MWE2_TO_PROPOSAL=$(echo $MWE2_FROM_BASE | awk '{split($0,arr,"."); print arr[1] "." ++arr[2] ".0";}')
  MWE_TO_PROPOSAL=$(echo $MWE_FROM_BASE | awk '{split($0,arr,"."); print arr[1] "." ++arr[2] ".0";}')

  read -p "Current MWE2 version is $MWE2_FROM_BASE. New value ($MWE2_TO_PROPOSAL): " MWE2_TO
  read -p "Current MWE version is $MWE_FROM_BASE. New value ($MWE_TO_PROPOSAL): " MWE_TO

  MWE2_TO=${MWE2_TO:-$MWE2_TO_PROPOSAL}
  MWE_TO=${MWE_TO:-$MWE_TO_PROPOSAL}
elif [ "$RELEASE_QUALIFIER" == "GA" ]; then
  MWE2_TO=$MWE2_FROM_BASE
  MWE_TO=$MWE_FROM_BASE
elif [ "$RELEASE_QUALIFIER" == "Beta" ]; then
  TS=$(date "+%Y%m%d%H%M")
  MWE2_TO=$MWE2_FROM_BASE.Beta$TS
  MWE_TO=$MWE_FROM_BASE.Beta$TS
else
  MWE2_TO=$(echo "$MWE2_FROM_BASE.$RELEASE_QUALIFIER")
  MWE_TO=$(echo "$MWE_FROM_BASE.$RELEASE_QUALIFIER")
fi



echo "Applying version changes:"
echo "  MWE2: $MWE2_FROM_BASE => $MWE2_TO"
echo "  MWE:  $MWE_FROM_BASE => $MWE_TO"


# MODIFY FILES
if [ "$RELEASE_QUALIFIER" == "N" ]; then
  # set new SNAPSHOT version
  find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${MWE2_FROM_BASE}.qualifier/${MWE2_TO}.qualifier/g"
  find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${MWE_FROM_BASE}.qualifier/${MWE_TO}.qualifier/g"
  find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/;bundle-version=\"${MWE2_FROM_BASE}\"/;bundle-version=\"${MWE2_TO}\"/g"
  find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/;bundle-version=\"${MWE_FROM_BASE}\"/;bundle-version=\"${MWE_TO}\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM_BASE}.qualifier\"/version=\"${MWE2_TO}.qualifier\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM_BASE}.qualifier\"/version=\"${MWE_TO}.qualifier\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM_BASE}\" match=\"compatible\"/version=\"${MWE2_TO}\" match=\"compatible\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM_BASE}\" match=\"compatible\"/version=\"${MWE_TO}\" match=\"compatible\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM_BASE}\" match=\"greaterOrEqual\"/version=\"${MWE2_TO}\" match=\"greaterOrEqual\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM_BASE}\" match=\"greaterOrEqual\"/version=\"${MWE_TO}\" match=\"greaterOrEqual\"/g"

  find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${MWE2_FROM}/${MWE2_TO}-SNAPSHOT/g"
  find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${MWE_FROM}/${MWE_TO}-SNAPSHOT/g"
else
  if [ "$RELEASE_QUALIFIER" == "GA" ]; then
    sed_inplace -e "s?<BUILD_TYPE>.*</BUILD_TYPE>?<BUILD_TYPE>R</BUILD_TYPE>?" maven/org.eclipse.emf.mwe2.parent/pom.xml
  else
    sed_inplace -e "s?<BUILD_TYPE>.*</BUILD_TYPE>?<BUILD_TYPE>S</BUILD_TYPE>?" maven/org.eclipse.emf.mwe2.parent/pom.xml
  fi

  find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${MWE2_FROM}/${MWE2_TO}/g"
  find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${MWE_FROM}/${MWE_TO}/g"
  
  QUALIFIER=$(date +v%Y%m%d-%H%M)
  find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${MWE2_FROM_BASE}.qualifier/${MWE2_FROM_BASE}.${QUALIFIER}/g"
  find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${MWE_FROM_BASE}.qualifier/${MWE_FROM_BASE}.${QUALIFIER}/g"

  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM_BASE}.qualifier\"/version=\"${MWE2_FROM_BASE}.${QUALIFIER}\"/g"
  find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM_BASE}.qualifier\"/version=\"${MWE_FROM_BASE}.${QUALIFIER}\"/g"

fi


exit

