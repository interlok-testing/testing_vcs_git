# Interlok version control with GIT

[![license](https://img.shields.io/github/license/interlok-testing/testing_vcs_git.svg)](https://github.com/interlok-testing/testing_vcs_git/blob/develop/LICENSE)
[![Actions Status](https://github.com/interlok-testing/testing_vcs_git/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/interlok-testing/testing_vcs_git/actions/workflows/gradle-build.yml)

Project tests;
 - interlok-vcs-git

## What it does

Often you'll want to keep your Interlok configurations versioned in a GIT repository.  Any changes to that configuration can then be pushed out to many instances very quickly.
In this test, we'll use the [interlok-config-example](https://github.com/adaptris/interlok-config-example) github project and upon Interlok's startup will pull the contents of that project into our configuration directory and then complete the start-up using the pulled configuration.

![vcs diagram](/vcs.png "vcs diagram")


## Getting started

Please note this project uses a licensed component; therefore you will need an Interlok license.
Once obtained create a file "src/main/interlok/config/license.properties" that contains your license key.

* `./gradlew clean build`

Once built you will need to delete the '.build/distribution/config/interlok-config-example' directory.  This directory only exists initially so that this project has a configuration to fulfil the requirements of the configuration checks when building the project.

* `(cd ./build/distribution && java -jar lib/interlok-boot.jar)`

