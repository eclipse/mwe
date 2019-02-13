#!/bin/bash
xargs_sed_inplace() {
	if [[ "$OSTYPE" == "darwin"* ]]; then
		xargs sed -i '' "$@"
	else
		xargs sed -i "$@" 
	fi	
}
mwe2_from=2.10.0
mwe2_to=2.10.1
mwe_from=1.4.0
mwe_to=1.4.1

find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${mwe2_from}.qualifier/${mwe2_to}.qualifier/g"
find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/${mwe_from}.qualifier/${mwe_to}.qualifier/g"
find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/;bundle-version=\"${mwe2_from}\"/;bundle-version=\"${mwe2_to}\"/g"
find . -type f -name "MANIFEST.MF" | xargs_sed_inplace -e "s/;bundle-version=\"${mwe_from}\"/;bundle-version=\"${mwe_to}\"/g"
find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${mwe2_from}-SNAPSHOT/${mwe2_to}-SNAPSHOT/g"
find . -type f -name "pom.xml" | xargs_sed_inplace -e "s/${mwe_from}-SNAPSHOT/${mwe_to}-SNAPSHOT/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${mwe2_from}.qualifier\"/version=\"${mwe2_to}.qualifier\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${mwe_from}.qualifier\"/version=\"${mwe_to}.qualifier\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${mwe2_from}\" match=\"compatible\"/version=\"${mwe2_to}\" match=\"compatible\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${mwe_from}\" match=\"compatible\"/version=\"${mwe_to}\" match=\"compatible\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${mwe2_from}\" match=\"greaterOrEqual\"/version=\"${mwe2_to}\" match=\"greaterOrEqual\"/g"
find . -type f -name "feature.xml" | xargs_sed_inplace -e "s/version=\"${mwe_from}\" match=\"greaterOrEqual\"/version=\"${mwe_to}\" match=\"greaterOrEqual\"/g"