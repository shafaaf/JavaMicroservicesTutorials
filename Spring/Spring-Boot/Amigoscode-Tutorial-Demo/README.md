## Spring Boot Tutorial Course 2022

Tutorial from:

https://www.youtube.com/watch?v=9SGDpanrc8U&ab_channel=Amigoscode

Concepts:
Spring initializr site, My conf:
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.13&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,data-jpa,postgresql

Target folder
@Transactional annotation
DB properties in application.properties


See Table Of Contents, imp diagram on tutorial link
api layer -> service layer -> data access layer -> db 

Imp: 1:29:40 shows packaging and running application
Maven tab has many life cycle methods like clean, test, install etc
When installing it creates jar file into a target folder. Can run it using:
java -jar target/demo-0.0.1-SNAPSHOT.jar

Get all students:
http://localhost:8080/api/v1/student

Can also check db contents by connecting to db on intellij and then running SELECT * query

Example requests on Intellij on Endpoints tab:

###
POST http://localhost:8080/api/v1/student
Content-Type: application/json

{
"name" : "Bilal",
"email": "bilal.hussain@hotmail.com",
"dob1": "1992-12-22"
}


###
DELETE http://localhost:8080/api/v1/student/1


###
PUT http://localhost:8080/api/v1/student/2?name=sam&email=seder@mail.com
Content-Type: application/json
