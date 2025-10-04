# How to reproduce

    $ git clone https://github.com/nicolasduminil/faces-issue.git
    $ cd faces-issue
    $ mvn package
    $ java -jar target/quarkus-app/quarkus-run.jar

Fire your preferred to browser at http://localhost:8080/index.xhtml. The following exception will be raised:

    java.lang.ClassCastException: class java.lang.String cannot be cast to class fr.simplex_software.workshop.MyEnum (java.lang.String is in module java.base of loader 'bootstrap'; fr.simplex_software.workshop.MyEnum is in unnamed module of loader io.quarkus.bootstrap.runner.RunnerClassLoader @3af49f1c)
