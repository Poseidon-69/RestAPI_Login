# Login and Signup Backend API with Security and JWT Tokens

This project is a backend implementation of a login and signup REST API with security and JWT tokens. It is built using Java, Spring Boot, and utilizes H2 database for data storage. The API endpoints provided below demonstrate the functionality of the application.

# Installation and Setup

```
# Prerequisites
- Java Development Kit (JDK) 8 or later
- Maven
- Postman (for testing the API)
```

1. Clone the Repository
2. Go the Project
3. Run the Application

```
./mvnw spring-boot:run

# User Signup

- Method: POST
- Path: `http://localhost:8081/app/signup`
- Description: Register a new user.
- Request Body: User data in the JSON format (e.g., name, email, password).

```

{
  "fullName": "Siddhant Welinkar",
  "password": "Siddhant@3043",
  "email": "smsid7@gmail.com"
}
```

- Response:

```
{
    "id": 1,
    "fullName": "Siddhant Welinkar",
    "password": "$2a$10$KVzpEHKFpXaijbjfj7RXLgqumnZKFy3bT8wdJUJcpZPGSG",
    "email": "smsid7@gmail.com",
    "role": "ROLE_USER"
}

```

# User Login

- Method: GET
- Path: `http://localhost:8081/signIn`
- Description: Authenticate a user and retrieve their details.
- Authentication: Basic Authentication (Username and Password)
    - Username: [smsid7@gmail.com@gmail.com](mailto:smsid7@gmail.com)
    - Password: SiddhantWelinkar@1000
- Response:

```
{
    "id": 1,
    "fullName": "Siddhant Welinkar",
    "password": "SiddhnatWelinkar@1000",
    "email": "Smsid7@gmail.com",
    "role": "ROLE_USER"
}

``
# Welcome Endpoint (Requires Authentication)

- Method: GET
- Path: `http://localhost:8081/logged-in/user`
- Description: A protected endpoint that requires authentication to access.
- Authentication: Bearer Token
- Request Header:
    - Authorization: Bearer <token>
- Response: A welcome message string.
- Example:
    - Bearer Token: eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJTaGltYmh1fdjbewicfBPNRva2VuIiwidXNlcm5hbWUiOiJza0BnbWFpbC5jb20iLCJyb2xlIjoiUk9MRV9VU0VSIiwiaWF0IjoxNjg1Njc3MqpuhYGKJzg3LCJleHAiOjE2ODU3MDczODd9.VwM2IGD1fABjEcnNoMb4uIyBnYe3_BmZGx33dElaD-E
    - Response: Hello : Siddhant Welinkar

# Tech Stack

- Java
- Spring Boot
- JWT Token
- Lombok
- H2 Database
- Spring Security
- Maven

# Validation Rules

The following validation rules are applied to the user entity:

- Full Name:
    - Minimum length: 3 characters
    - Maximum length: 20 characters
- Password:
    - At least 8 characters
    - Contains at least one digit
    - Contains at least one lowercase letter
    - Contains at least one uppercase letter
    - Contains at least one special character
- Email:
    - Valid email format

# Development

The project can be imported and run using an IDE like VScode.

# Test API

You can use Postman to test the API endpoints.

# H2 Database Configuration

The project uses the H2 in-memory database by default.

The application is configured to use the H2 database. The configuration can be found in the `application.properties` file:

```
# Server Port Configuration
server.port=8081

# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

 
