# CLI for github 
#### version 0.0.1

### Description
Project implements a GitHub CLI to get information from the GitHub repository.

The data is printed to console and saved as a report localy.

### Todos
 - Write more tests

 
### Setup
Java 8 is required.

The program should be ran from CLI as jar.

For packaging the code to a jar use maven with the following command:
```sh
mvn clean package

```

### Instructions

*download GithubCli-0.0.1-SNAPSHOT.jar

*run downloads command:

```sh
java -jar <jarName>.jar --downloads -r <owner>/<repo> [-o <outputFilePath>]

e.g: java -jar GithubCli-0.0.1-SNAPSHOT.jar --downloads -r whitesource/log4j-detect-distribution -o c:\tmp\downloads.txt

```

*run stats command:

```sh
java -jar <jarName>.jar --stats -r <owner>/<repo> [-o <outputFilePath>]

e.g: java -jar GithubCli-0.0.1-SNAPSHOT.jar --stats -r whitesource/log4j-detect-distribution -o c:\tmp\stats.txt

```
