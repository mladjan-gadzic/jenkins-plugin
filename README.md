# jenkins-plugin

## Introduction

TODO Describe what your plugin does here

## Requirements
- Java 21
- Maven 3.9.9

## Getting started

TODO Tell users how to configure your plugin here, include screenshots, pipeline examples and 
configuration-as-code examples.

## Build & Run
- mvn hpi:run

All actions and results from Jenkins run are saved to `work` dir. In order to have clean slate, remove it before re-running.

## Debug
- `export MAVEN_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005,suspend=n"`
- Create IntelliJ IDEA Remote Debug configuration for `JDK9 or later` with port `5005`.