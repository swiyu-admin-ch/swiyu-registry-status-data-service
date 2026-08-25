# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 1.3.5

### Changed

- Updated dependencies

## 1.3.4

### Added

- Return HTTP 501 (Not Implemented) for requests to /api/v1/statuslist containing any query parameter, as no query
  parameter is supported (Token Status List specification)

## 1.3.3

### Changed

- Upgrade jeap-spring-boot-parent -> 37.5.0

## 1.3.2

### Changed

- Migrate to Spring Boot 4 (jeap-spring-boot-parent 33.11.0 -> 36.1.1)
- Bump logback override to 1.5.38 (definitive fix for CVE-2026-13006)
- Override tomcat.version to 11.0.23 to resolve CVE-2026-55955 (parent's default 11.0.22 was still affected); remove
  now-obsolete Snyk ignore

## 1.3.1

### Changed

- Update maven from 3.9.12 to 3.9.16
- Update org.apache.maven.plugins:maven-surefire-plugin from 3.5.5 to 3.5.6
- Update ch.qos.logback:logback-core from 1.5.36 to 1.5.37
- Update ch.qos.logback:logback-classic from 1.5.36 to 1.5.37
- Update com.tngtech.archunit:archunit-junit5 from 1.4.1 to 1.4.2
- Update com.diffplug.spotless:spotless-maven-plugin from 3.2.1 to 3.8.0

## 1.3.0

### Added

- Add support for local e2e tests

## 1.2.6

### Changed

- Update README.md file

## 1.2.5

### Fixed

- Override logback to 1.5.36 to resolve CVE-2026-13006 (expression injection in logback-core)

## 1.2.4

### Fixed

- Updated jeap-spring-boot-parent to 33.11.0 to resolve all HIGH and CRITICAL findings

## 1.2.3

### Fixed

- Updated jeap-spring-boot-parent to 33.2.0 to resolve tomcat CVEs

## 1.2.2

### Fixed

- Update jeap-spring-boot-parent to 31.4.0 to resolve CVE CVE-2026-22732

## 1.2.1

### Fix

- Increase jeap-spring-boot-parent version to 30.19.0 to resolve CVE GHSA-72hv-8253-57qq

## 1.2.0

### Changed

- updated java version to 25 and jeap-spring-boot-parent to 30.16.0

## 1.1.16

### Changed

- updated jeap-spring-boot-parent to 30.15.0
- enabled support for detailed health metrics

## 1.1.15

### Changed

- aligned maven wrapper config and removed unneeded jacoco config in pom.xml

## 1.1.14

### Changed

- Update postgres from 15.14 to 15.15
- Update com.diffplug.spotless:spotless-maven-plugin from 3.0.0 to 3.1.0
- Update org.jacoco:jacoco-maven-plugin from 0.8.13 to 0.8.14
- Update ch.admin.bit.jeap:jeap-spring-boot-parent from 27.2.0 to 28.3.0

## 1.1.13

### Changed

- Update maven from 3.9.10 to 3.9.11
- Update maven-wrapper from 3.3.2 to 3.3.4
- Update maven-wrapper from 3.3.2 to 3.3.4
- Update maven-wrapper from 3.3.2 to 3.3.4
- Update postgres from 15.13 to 15.14
- Update org.apache.maven.plugins:maven-surefire-plugin from 3.5.2 to 3.5.4
- Update org.apache.maven.plugins:maven-compiler-plugin from 3.14.0 to 3.14.1
- Update com.diffplug.spotless:spotless-maven-plugin from 2.45.0 to 3.0.0
- Update ch.admin.bit.jeap:jeap-spring-boot-parent from 26.68.0 to 27.2.0

## 1.1.12

### Other

- Added tests confirming that endpoints only expose datastore entries with status ACTIVE

## 1.1.11

### Changed

- Update maven from 3.9.9 to 3.9.10
- Update com.diffplug.spotless:spotless-maven-plugin from 2.44.4 to 2.45.0
- Update ch.admin.bit.jeap:jeap-spring-boot-parent from 26.50.1 to 26.68.0

## 1.1.10

### Other

- Downgrade maven-surefire-plugin due to archunit incompatibility

## 1.1.9

### Other

- Update Interface Summaries

## 1.1.8

### Changed

- Update org.apache.maven.plugins:maven-surefire-plugin from 3.5.2 to 3.5.3
- Update ch.admin.bit.jeap:jeap-spring-boot-parent from 26.50.0 to 26.50.1

## 1.1.7

### Changed

- Downgrade maven-sunfire-plugin due to archunit incompatibility

## 1.1.6

### Changed

- Update maven from 3.9.6 to 3.9.9
- Update postgres from 15.8 to 15.13
- Update org.apache.maven.plugins:maven-compiler-plugin from 3.12.1 to 3.14.0
- Update com.tngtech.archunit:archunit-junit5 from 1.4.0 to 1.4.1
- Update org.jacoco:jacoco-maven-plugin from 0.8.9 to 0.8.13
- Update ch.admin.bit.jeap:jeap-spring-boot-parent from 26.48.0 to 26.50.0

## 1.1.5

### Other

- Added spotless plugin

## 1.1.4

### Changed

- dependency updates (jeap)

## 1.1.3

### Fixed

- fixed api description of /api/v1/statuslist

## 1.1.2

### Changed

- internal improvements for local development

## 1.1.1

### Changed

- jeapyfied service according to checklist

## 1.1.0

### Added

- Extending prometheus export with metrics for build

## 1.0.0

- Initial Release 
