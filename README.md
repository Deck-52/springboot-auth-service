# Spring Boot JWT Authentication Service

A backend authentication and authorization API built using Spring Boot, Spring Security, JWT, PostgreSQL, and BCrypt password hashing.

This project demonstrates a production-style authentication flow with:

* User Registration
* Login Authentication
* JWT Token Generation
* Protected APIs
* Role-Based Access Control (RBAC)
* PostgreSQL Integration
* Spring Security Filters

---

# Tech Stack

* Java 17+
* Spring Boot
* Spring Security
* PostgreSQL
* JWT (JSON Web Token)
* BCrypt Password Encoder
* Maven
* Postman
* Git & GitHub

---

# Features

## Authentication

* Register new users
* Login using email/password
* BCrypt password hashing
* JWT token generation

## Authorization

* Protected APIs using JWT
* Role-based access control
* USER role
* ADMIN role

## Database

* PostgreSQL integration
* JPA/Hibernate ORM
* User persistence

---

# Project Structure

```text
src/main/java/com/auth/authservice
│
├── controller
│   └── UserController
│
├── dto
│   └── LoginRequest
│
├── entity
│   └── User
│
├── enums
│   └── Role
│
├── repository
│   └── UserRepository
│
├── security
│   ├── JwtService
│   └── JwtFilter
│
├── service
│   └── UserService
│
└── config
    └── SecurityConfig
```

---

# API Endpoints

## Register User

### POST

```http
/auth/register
```

### Request Body

```json
{
  "name": "Bharath",
  "email": "bharath@test.com",
  "password": "12345"
}
```

---

## Login User

### POST

```http
/auth/login
```

### Request Body

```json
{
  "email": "bharath@test.com",
  "password": "12345"
}
```

### Response

```text
JWT Token
```

---

## Protected Profile API

### GET

```http
/auth/profile
```

### Header

```text
Authorization: Bearer YOUR_JWT_TOKEN
```

---

## Admin Endpoint

### GET

```http
/auth/admin
```

### Header

```text
Authorization: Bearer YOUR_JWT_TOKEN
```

---

# Database Setup

Create PostgreSQL database:

```sql
CREATE DATABASE authdb;
```

Update:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/authdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Run Project

## Clone Repository

```bash
git clone YOUR_REPO_URL
```

## Move Into Project

```bash
cd authservice
```

## Run Application

Windows:

```bash
.\mvnw.cmd spring-boot:run
```

---

# Security Flow

```text
Register
→ Hash Password
→ Save User
→ Login
→ Generate JWT
→ Send JWT In Header
→ Validate JWT
→ Access Protected APIs
```

---

# Learning Outcomes

By building this project, you learn:

* Spring Boot backend development
* REST APIs
* Authentication and Authorization
* JWT-based security
* Spring Security filters
* BCrypt hashing
* Database integration
* Role-based access control
* Backend architecture design

---

# Future Improvements

* Refresh Tokens
* Email Verification
* Forgot Password Flow
* Docker Containerization
* Swagger API Documentation
* Redis Session Blacklisting
* OAuth2 Login

---

#
