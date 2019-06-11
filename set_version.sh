#!/bin/bash
xargs_sed_inplace() {
	if [[ "$OSTYPE" == "darwin"* ]]; then
		xargs sed -i '' "$@"
	else
		xargs sed -i "$@" 
	fi	
}

# Read current version from pom.xml files with grep & sed
# Make a proposal to increment the version to the next minor release using awk
# Ask user to enter the new version with proposed default

MWE2_FROM=$(grep -m 1 "<version>" plugins/pom.xml |sed -e "s?.*<version>\(.*\)-.*?\1?")
MWE2_TO_PROPOSAL=$(echo $MWE2_FROM | awk '{split($0,arr,"."); print arr[1] "." ++arr[2] ".0";}')
read -p "Current MWE2 version is $MWE2_FROM. New value ($MWE2_TO_PROPOSAL): " MWE2_TO
MWE2_TO=${MWE2_TO:-$MWE2_TO_PROPOSAL}

# Read MWE version from org.eclipse.emf.mwe.core/pom.xml
# MWE version is the 2nd occurance of <version> tag => grep first 2 matches and tail for 2nd
MWE_FROM=$(grep -m 2 "<version>" plugins/org.eclipse.emf.mwe.core/pom.xml |tail -n1 |sed -e "s?.*<version>\(.*\)-.*?\1?")
MWE_TO_PROPOSAL=$(echo $MWE_FROM | awk '{split($0,arr,"."); print arr[1] "." ++arr[2] ".0";}')
read -p "Current MWE version is $MWE_FROM. New value ($MWE_TO_PROPOSAL): " MWE_TO
MWE_TO=${MWE_TO:-$MWE_TO_PROPOSAL}

echo "Applying version changes:"
echo "  MWE2: $MWE2_FROM => $MWE2_TO"
echo "  MWE:  $MWE_FROM => $MWE_TO"

find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${MWE2_FROM}.qualifier/${MWE2_TO}.qualifier/g"
find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${MWE_FROM}.qualifier/${MWE_TO}.qualifier/g"
find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/;bundle-version=\"${MWE2_FROM}\"/;bundle-version=\"${MWE2_TO}\"/g"
find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/;bundle-version=\"${MWE_FROM}\"/;bundle-version=\"${MWE_TO}\"/g"
find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${MWE2_FROM}-SNAPSHOT/${MWE2_TO}-SNAPSHOT/g"
find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${MWE_FROM}-SNAPSHOT/${MWE_TO}-SNAPSHOT/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM}.qualifier\"/version=\"${MWE2_TO}.qualifier\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM}.qualifier\"/version=\"${MWE_TO}.qualifier\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM}\" match=\"compatible\"/version=\"${MWE2_TO}\" match=\"compatible\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM}\" match=\"compatible\"/version=\"${MWE_TO}\" match=\"compatible\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE2_FROM}\" match=\"greaterOrEqual\"/version=\"${MWE2_TO}\" match=\"greaterOrEqual\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${MWE_FROM}\" match=\"greaterOrEqual\"/version=\"${MWE_TO}\" match=\"greaterOrEqual\"/g"
