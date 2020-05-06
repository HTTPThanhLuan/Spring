1. create project (in IntelliJ)
   Spring Initializr > Next > Web> Spring Web> Templagte Engines > Thymeleaf
2. Add  dependency in pom.xml
              <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-security</artifactId>
               </dependency>
3. Run the project.
   login by user: "user" pass: take a look in console.

    user can create user and pass your seft by add user and pass in application.properties.

    spring.security.user.name=user
    spring.security.user.password=password

4. Custom user name and pass
     SpringSecurityConfig in config folder.
