How to setup:

http://localhost:8080/

http://localhost:8080/api/v1/student

Did till 1:15:37

Example request on Intellij on endpoints tab:
###
POST http://localhost:8080/api/v1/student
Content-Type: application/json

{
"name" : "Bilal",
"email": "bilal.hussain@hotmail.com",
"dob1": "1992-12-22"
}

Can also check db contents by connecting to db on intellij and then running SELECT * query
