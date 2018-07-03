# JUnit Pioneer

<img src="docs/project-logo.jpg" align="right" width="150px"/>

[![Travis build status](https://api.travis-ci.org/junit-pioneer/junit-pioneer.svg?branch=master)](https://travis-ci.org/junit-pioneer/junit-pioneer)
[![AppVeyor build status](https://ci.appveyor.com/api/projects/status/ijrlfaa2fpnxwm3r?svg=true)](https://ci.appveyor.com/project/nicolaiparlog/junit-pioneer)

A melting pot for all kinds of extensions to
[JUnit 5](https://github.com/junit-team/junit5), particular to its Jupiter API.

Check out [junit-pioneer.org](http://junit-pioneer.org), particularly [the documentation section](http://junit-pioneer.org/docs).

## A Pioneer's Mission

JUnit Pioneer provides extensions for [JUnit 5](https://github.com/junit-team/junit5/) and its Jupiter API.
It does not limit itself to proven ideas with wide application but is purposely open to experiments.
It aims to spin off successful and cohesive portions into sibling projects or back into the JUnit 5 code base.

To enable easy exchange of code with JUnit 5, JUnit Pioneer copies most of its infrastructure, from code style to build tool and configuration to continuous integration.

## Getting on Board

There were no [releases](https://github.com/junit-pioneer/junit-pioneer/releases) to Maven Central, yet, but every successful build on `master` releases a snapshot [to Sonatype's snapshot repository](https://oss.sonatype.org/content/repositories/snapshots/org/junit-pioneer/junit-pioneer/).

Coordinates:

* group ID: `org.junit-pioneer`
* artifact ID: `junit-pioneer`
* version `0.1-SNAPSHOT`

For Maven:

```xml
<dependency>
	<groupId>org.junit-pioneer</groupId>
	<artifactId>junit-pioneer</artifactId>
	<version>0.1-SNAPSHOT</version>
</dependency>
```

For Gradle:

```
testCompile group: 'org.junit-pioneer', name: 'junit-pioneer', version: '0.1-SNAPSHOT'
```

## Contributing

We welcome contributions of all shapes and forms! 🌞

* If you have an idea for an extension, [open an issue](https://github.com/junit-pioneer/junit-pioneer/issues/new) and let's discuss.
* If you want to help but don't know how, have a look at [the existing issues](https://github.com/junit-pioneer/junit-pioneer/issues), particularly [unassigned ones](https://github.com/junit-pioneer/junit-pioneer/issues?q=is%3Aopen+is%3Aissue+no%3Aassignee) and those [marked as up for grabs](https://github.com/junit-pioneer/junit-pioneer/issues?q=is%3Aissue+is%3Aopen+label%3Aup-for-grabs).

Before contributing, please read the [contribution guide](CONTRIBUTING.md).

## Project Structure

### Dependencies

To not add to user's [JAR hell](https://blog.codefx.org/java/jar-hell/), JUnit Pioneer is not taking on any runtime dependencies besides JUnit 5.
Pioneer always depends on the lowest JUnit 5 version that supports its feature set, but that should not keep you from using 5's latest and greatest.

For our own infrastructure, we rely on the following compile and test dependencies:

* JSR-305 (for static analysis)
* AssertJ (assertions for our tests)
* Mockito (mocking for our tests)
* Log4J (to configure logging during test runs)
* Jimfs (as an in-memory file system for our test)

### Code Style

[There shall be no null - use `Optional` instead.](https://blog.codefx.org/techniques/intention-revealing-code-java-8-optional/):

* design code to avoid optionality wherever feasibly possible
* in all remaining cases, prefer `Optional` over `null`.
