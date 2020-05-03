This is configuration for Spring Boot JSP.

1.   adding dependency  in pom.xml
          <dependency>
               <groupId>org.apache.tomcat.embed</groupId>
               <artifactId>tomcat-embed-jasper</artifactId>
               <scope>provided</scope>
           </dependency>

2. <packaging>war</packaging>
   To make a standalone application
    a. Making war file.
     Maven \ <projectName> \ Lifecycle \ install
    b. Run file.
       Oppen command prompt: java -jar <filename.war>
    c. You will face with "Port xxxx was already in use". To kill port.
        netstat -ano | findstr :<port>  //find
        taskkill /PID <PORT_NUMBER> /F   //kill port
