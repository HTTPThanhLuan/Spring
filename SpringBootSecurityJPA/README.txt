1. create project (in IntelliJ)
   Spring Initializr > Next > Web> Spring Web> Templagte Engines > Thymeleaf
2. Add  dependency in pom.xml
              <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-security</artifactId>
               </dependency>


3. Configure H2

   Create domain model and then you run app that will create schema database, login the h2-console. Take a look scheme of database after that
   you write data.sql in resources folder for inserting data.

4. Two ways to do authentication in jpa
   1) MyUserDetailService & MyUserDetail:  They're actually to teach you what UserDetailService &UserDetail used for by everything is hardcoded
   2) JPAUserDetailService & JPAUserDetail: connect DB to pull user info

5.
   1) username&password: user/123456
   2) username&password: admin/hello