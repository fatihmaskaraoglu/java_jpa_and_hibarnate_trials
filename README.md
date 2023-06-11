# java_jpa_and_hibarnate_trials

I practiced jdbc, jpa and spring data jpa. If you have a question in the repo, you can dm.

This is a repo where i did some simple experiments. You can take it and examine it for database operations. It helps you get started. You can check my java_trials repo for more complex studies.

URLs:
http://localhost:8080/h2-console/login.do

Login infos:

![image](https://github.com/fatihmaskaraoglu/java_jpa_and_hibarnate_trials/assets/8976615/acf35393-bbd4-4b12-aad5-b5b0a343cbaa)




application.properties:

-logging.level.org.springframework=info<br />
-management.endpoints.web.exposure.include=*<br />
-spring.h2.console.enabled=true<br />
-spring.datasource.url=jdbc:h2:mem:testdb<br />
-spring.jpa.defer-datasource-initialization=true<br />

