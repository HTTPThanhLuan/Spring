1. create project (in IntelliJ)
   Spring Initializr > Next > Web> Spring Web> Templagte Engines > Thymeleaf
2. Add  dependency in pom.xml
              <dependency>
                   <groupId>org.springframework.boot</groupId>
                   <artifactId>spring-boot-starter-security</artifactId>
               </dependency>

3. Configure H2 and Use Jdbc

4. Look at in SpringSecurityConfig
    protected void configure(HttpSecurity http)  method and public void configure(WebSecurity web)
