robotframework-archetype-annotationlibrary
==========================================

Robot Framework archetype for creating a AnnotationLibrary based testlibrary.

Note that an existing installation of *Oracle JDK 7* and *Apache Maven 3*
are required to use this archetype.

Usage
-----

```bash
$ mvn -B archetype:generate \
      -DarchetypeGroupId=com.github.markusbernhardt \
      -DarchetypeArtifactId=robotframework-archetype-annotationlibrary \
      -DarchetypeVersion=1.0.0 \
      -DgroupId=com.yourcompany.yourdepartment \
      -DartifactId=robotframework-yourlibraryname \
      -Dpackage=com.yourcompany.yourdepartment.robotframework.yourlibraryname \
      -DlibraryName=YourLibraryName

$ cd robotframework-yourlibraryname

$ mvn test

[INFO]
[INFO] --- robotframework-maven-plugin:1.2:run (test) @ robotframework-yourlibraryname ---
==============================================================================
Robotframework
==============================================================================
Robotframework.YourLibraryName
==============================================================================
Echo                                                                  | PASS |
------------------------------------------------------------------------------
Echo With Default                                                     | PASS |
------------------------------------------------------------------------------
Echo With Overridden Default                                          | PASS |
------------------------------------------------------------------------------
Robotframework.YourLibraryName                                        | PASS |
3 critical tests, 3 passed, 0 failed
3 tests total, 3 passed, 0 failed
==============================================================================
Robotframework                                                        | PASS |
3 critical tests, 3 passed, 0 failed
3 tests total, 3 passed, 0 failed
==============================================================================
Output:  /Users/markus/Downloads/tmp/robotframework-yourlibraryname/target/robotframework-reports/output.xml
XUnit:   /Users/markus/Downloads/tmp/robotframework-yourlibraryname/target/robotframework-reports/TEST-robotframework.xml
Log:     /Users/markus/Downloads/tmp/robotframework-yourlibraryname/target/robotframework-reports/log.html
Report:  /Users/markus/Downloads/tmp/robotframework-yourlibraryname/target/robotframework-reports/report.html
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```