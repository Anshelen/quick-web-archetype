Quick Web Maven Archetype
=========================================

Summary
-------
The project is a Maven archetype for Spring Boot web application using Thymeleaf
as a template engine.

Installation
------------

To install the archetype in your local repository execute following commands:

```sh
$ git clone https://github.com/Anshelen/quick-web-archetype.git
$ cd quick-web-archetype
$ mvn clean install
```

Create a project
----------------

```sh
$ mvn archetype:generate \
     -DarchetypeGroupId=dev.shelenkov \
     -DarchetypeArtifactId=quick-web-archetype \
     -DarchetypeVersion=1.0.0 \
     -DgroupId=com.company \
     -DartifactId=webapp \
     -Dversion=1.0.0-SNAPSHOT \
     -DinteractiveMode=false
```

Run the project
----------------

First of all you need to set up database connection data in
application.properties file. Then run:

```sh
$ mvn test spring-boot:run
```

Test on the browser
-------------------

```sh
http://localhost:8080/
```

Authentication
--------------

Two users are predefined:

| Login         | Password |
| :-----------: | :------: |
| user@mail.ru  | user     |
| admin@mail.ru | admin    |

Gratitude
---------

Thanks Şükrü Uzel and his [spring-boot-quickstart-archetype][project]
which was taken as starting point for this project.

[project]: https://github.com/suzel/spring-boot-quickstart-archetype
