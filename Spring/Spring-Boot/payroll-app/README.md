Tutorial from: https://spring.io/guides/tutorials/rest/

Route:

http://localhost:8080/employees
http://localhost:8080/employees/99

Create an employee:
###
POST http://localhost:8080/employees
Content-Type: application/json

{
"name" : "Bilal",
"email": "bilal.hussain@hotmail.com",
"role": "gardener"
}
