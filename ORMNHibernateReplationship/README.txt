1. Create Project Spring Web and Thymeleaf with Sprint Boot
2. add dependency in pom.xml file
        <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-data-jpa</artifactId>
          </dependency>

          <dependency>
              <groupId>com.h2database</groupId>
              <artifactId>h2</artifactId>
              <scope>runtime</scope>
          </dependency>
3. create data.sql in resources folder.

4. add statements below in application.properties
  spring.h2.console.enabled=true
  spring.h2.console.path=/h2-console
  spring.jpa.show-sql=true
  ==============================
  for purpose To view H2 console
  enable it: spring.h2.console.enabled=true
  access URL: http://localhost:8080/h2-console
  Driver Class: org.h2.Driver
  JDBC URL:  jdbc:h2:mem:testdb (take a look in console at "Database available at ..." )
  User Name: 	sa
  no Password

5.

