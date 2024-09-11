# jenkins-plugin

## Introduction
Leverages Armada Agent in Declarative Pipeline to run armadactl commands on Armada Node Agent.

## Requirements
- Java 21
- Maven 3.9.9

## Getting started
TODO Tell users how to configure your plugin here, include screenshots, pipeline examples and 
configuration-as-code examples.

## Development
### Build & Run
- mvn hpi:run 

All actions and results from Jenkins run are saved to `work` dir. In order to have clean slate, remove it before re-running.

### Usage
- Create Armada Node Agent in Jenkins
```
Manage Jenkins > Nodes > New Node
    Name: armada-node
    Type: Armada
        Name: armada-node
        Description: Armada Agent Node
        # of executors: 1
        Remote FS root: <absolute-path-to-work-dir> (i.e. /home/ubuntu/work)
        Labels: armada
        armadactl absolute path: /bin/ls
```
- Open page for the created node > Manage Jenkins > Nodes > armada-node and follow instructions to download `agent.jar` and run Agent Node.
- Create a Pipeline job using defaults for everything except Pipeline section
  - Use Pipeline script for definition and provided Jenkinsfile.example in the root of this repo as a script
- Run the job
  - Build Now
  
## Debug
- `export MAVEN_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005,suspend=n"`
- Create IntelliJ IDEA Remote Debug configuration for `JDK9 or later` with port `5005`.