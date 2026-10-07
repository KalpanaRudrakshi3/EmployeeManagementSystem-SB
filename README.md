# Employee Management System

A Full Stack Employee Management System developed using **Spring Boot REST API, React.js, and MySQL**.

## 📌 Project Overview

This project is designed to manage employee information using CRUD operations.

The backend is developed using Spring Boot and provides RESTful APIs. The frontend is developed using React.js and communicates with the backend through HTTP requests.

## 🚀 Technologies Used

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* REST API
* Maven

### Frontend

* React.js
* JavaScript
* HTML
* CSS
* Axios / Fetch API

### Database

* MySQL

### Tools

* IntelliJ IDEA / Eclipse
* VS Code
* MySQL Workbench
* Postman
* Git & GitHub

## 🏗️ Project Architecture

```text
React.js Frontend
       |
       | REST API / HTTP
       ↓
Spring Boot Controller
       |
       ↓
Service Layer
       |
       ↓
Repository Layer
       |
       ↓
MySQL Database
```

## 🔥 Features

* Create Employee
* Read Employee
* Read All Employees
* Update Employee
* Delete Employee
* React frontend integration
* REST API based communication
* MySQL database integration
* Cross-Origin request support

## 🔗 REST API Endpoints

### 1. Hello API

```http
GET /employee/hello
```

Returns a simple response to verify that the backend is running.

### 2. Get Employee By ID

```http
GET /employee/getEmployee/{eid}
```

Example:

```http
GET /employee/getEmployee/1
```

Returns employee details based on employee ID.

### 3. Get All Employees

```http
GET /employee/getemp
```

Returns the list of all employees.

### 4. Create Employee

```http
POST /employee/createmp
```

Request body:

```json
{
  "name": "Rahul",
  "sal": 35000,
  "city": "Hyderabad",
  "dept": "IT"
}
```

### 5. Update Employee

```http
PUT /employee/updateEmployee/{eid}
```

Example:

```http
PUT /employee/updateEmployee/1
```

Request body:

```json
{
  "name": "Rahul Kumar",
  "sal": 40000,
  "city": "Hyderabad",
  "dept": "Development"
}
```

### 6. Delete Employee

```http
DELETE /employee/deleteEmployee/{eid}
```

Example:

```http
DELETE /employee/deleteEmployee/1
```

Deletes the employee with the specified ID.

## 🔄 CRUD Operations

| Operation | HTTP Method | Endpoint                         |
| --------- | ----------- | -------------------------------- |
| Create    | POST        | `/employee/createmp`             |
| Read One  | GET         | `/employee/getEmployee/{eid}`    |
| Read All  | GET         | `/employee/getemp`               |
| Update    | PUT         | `/employee/updateEmployee/{eid}` |
| Delete    | DELETE      | `/employee/deleteEmployee/{eid}` |

## 🌐 React Integration

The React frontend communicates with the Spring Boot backend using REST APIs.

Example backend URL:

```text
http://localhost:2323
```

Example API:

```text
http://localhost:2323/employee/getemp
```

The React application sends HTTP requests to these APIs and displays the employee data.

## 🔐 CORS Configuration

The backend allows requests from the React development server:

```java
@CrossOrigin("http://localhost:3000")
```

This allows the React application running on port `3000` to communicate with the Spring Boot backend.

## ▶️ How to Run the Project

### Backend

1. Clone the repository.

```bash
git clone <your-github-repository-url>
```

2. Open the backend project in IntelliJ IDEA or Eclipse.

3. Configure MySQL database in `application.properties`.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Start the Spring Boot application.

Backend will run on:

```text
http://localhost:2323
```

### Frontend

Navigate to the React project:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start React:

```bash
npm start
```

Frontend will run on:

```text
http://localhost:3000
```

## 🧪 Testing

REST APIs can be tested using:

* Postman
* Browser
* React frontend

Example:

```text
GET http://localhost:2323/employee/getemp
```

## 📂 Backend Structure

```text
src
 └── main
     └── java
         └── com.vcube.employemanagement2
             ├── controller
             │   └── EmployeeController.java
             ├── service
             │   └── EmployeService.java
             ├── repository
             │   └── EmployeeRepository.java
             └── model
                 └── Employee.java
```

## 📂 Frontend Structure

```text
src
 ├── components
 ├── pages
 ├── services
 ├── App.js
 └── index.js
```

## 🎯 Learning Outcomes

Through this project, I gained practical knowledge of:

* Spring Boot
* REST API development
* CRUD operations
* HTTP methods
* Spring Data JPA
* MySQL integration
* React.js
* Frontend-backend integration
* JSON data exchange
* CORS
* Postman API testing
* Git and GitHub
Full Stack Developer | Java | Spring Boot | React.js | MySQL
