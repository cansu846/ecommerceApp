# Ecommerce Project

This project is an Ecommerce backend application built using Spring Boot, focusing on key concepts such as Dependency Injection, JPA, Spring Security, and JWT authentication.

You can find example pictures of ecommerce app under the directory of "imageForApp"

## Table of Contents
- [Overview](#overview)
- [Topics Covered](#topics-covered)
- [Project Architecture](#project-architecture)
- [Security](#security)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [License](#license)

## Overview
This Ecommerce project implements various backend development principles and security measures using Spring Boot. It includes features like user authentication, product management, and secure data handling with JWT authentication and Spring Security.

### Key Features
- REST API implementation using Spring Boot and PostgreSQL.
- Secure password hashing with bcrypt.
- Authentication and Authorization using JWT (JSON Web Tokens).
- Data validation and transfer using DTO pattern.
- Managing multiple entities and their relationships.
  
## Topics Covered

1. **Dependency Injection (DI)**
   - Implemented Dependency Injection in Spring Boot to manage dependencies between classes and promote loose coupling.

2. **Type Annotations**
   - Used Java type annotations to enforce type safety and enhance code readability.

3. **JPA and Hibernate**
   - Used Java Persistence API (JPA) for ORM (Object-Relational Mapping) with Hibernate as its implementation to handle database operations.

4. **JPA Repository**
   - Leveraged Spring Data JPA repositories for efficient database interaction, supporting CRUD operations.

5. **JPA Relationships**
   - Managed relationships between entities such as `One-to-One`, `One-to-Many`, and `Many-to-Many` using JPA annotations.

6. **RestController Implementation**
   - Built RESTful APIs with Spring Boot’s `@RestController` to handle HTTP requests and send appropriate responses.

7. **PostgreSQL & JDBC**
   - Connected the application to a PostgreSQL database using JDBC for data persistence.

8. **Validations in Spring Boot**
   - Applied validation annotations like `@Valid`, `@NotNull`, `@Size` to ensure incoming data is correctly formatted before processing.

9. **Exception Handling**
   - Used `ResponseStatusException` to handle exceptions and provide meaningful error responses.

10. **DTO Pattern**
    - Implemented the Data Transfer Object (DTO) pattern for passing data between different layers of the application.

11. **Multiple Entities & Relationships**
    - The application manages 11 different entities, establishing and handling relationships between them in the model layer.

12. **Spring Security**
    - Integrated Spring Security for:
      - **Authentication**: Proving user identity through login credentials.
      - **Authorization**: Determining the permissions for authenticated users.
    
13. **Password Hashing with bcrypt**
    - Implemented password hashing using `bcrypt` to ensure secure storage of user passwords.

14. **JWT Authentication**
    - Implemented JWT for stateless authentication, managing tokens for user sessions with expiration time and validation.

## Project Architecture

This project follows a three-layered architecture:

1. **Presentation Layer (Controllers)**:
   - Handles incoming HTTP requests, passes them to the service layer, and returns the responses.

2. **Service Layer**:
   - Contains the business logic. Responsible for evaluating data, making decisions, and processing inputs.

3. **Data Access Layer (Repositories)**:
   - Communicates with the database to perform CRUD operations, manage transactions, and query data.

## Security

### Authentication & Authorization
The application uses Spring Security for user authentication and authorization:
- **Authentication**: Verifying the identity of users.
- **Authorization**: Managing what actions the authenticated user is allowed to perform.

### Password Hashing
User passwords are hashed using the `bcrypt` algorithm to enhance security. Salting is used to protect against dictionary and rainbow table attacks.

### JWT (JSON Web Token)
JWT is used to provide stateless authentication for the application. Features include:
- Token generation after user login.
- Expiration time handling to ensure token validity.
- Secure transmission of the token with each request for authorization.

### Security Components:
- **JwtUtils**: Utility class to generate, parse, and validate JWT tokens.
- **AuthTokenFilter**: Intercepts incoming HTTP requests and validates the JWT token.
- **AuthEntryPointJwt**: Handles unauthorized access and returns custom error responses.

## Technologies Used
- **Spring Boot**
- **PostgreSQL**
- **Hibernate (JPA Implementation)**
- **Spring Data JPA**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **bcrypt for password hashing**
- **JDBC**

## Getting Started

### Prerequisites
- Java 17+
- Maven
- PostgreSQL

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ecommerce-project.git
