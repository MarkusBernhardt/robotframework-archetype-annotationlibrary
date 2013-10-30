robotframework-archetype-annotationlibrary
==========================================

Robot Framework archetype for creating a AnnotationLibrary based testlibrary.

Using this archetype the only thing to create a working Robot Framework 
testsuite is a existing Apache Maven installation.

Usage
-----

```bash
$ mvn -B archetype:generate \
      -DarchetypeGroupId=com.github.markusbernhardt \
      -DarchetypeArtifactId=robotframework-archetype-annotationlibrary \
      -DarchetypeVersion=1.0.0 \
      -DgroupId=yourcompany.yourdepartment \
      -DartifactId=yourproject-yourtestsuite

$ cd yourproject-yourtestsuite

$ mvn test
```