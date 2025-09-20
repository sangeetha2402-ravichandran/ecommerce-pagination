# E-Commerce Backend with Spring Boot & MongoDB

![E-Commerce Banner](images/ecommerce-banner.jpg)

A robust and scalable backend for an e-commerce application built with Spring Boot and MongoDB. This project includes features like pagination, sorting, validation, exception handling, and unit testing.

---

## Table of Contents
- [Features](#features)
- [Project Structure](#project-structure)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Exception Handling](#exception-handling)
- [Testing](#testing)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- Models for Product, Category, User, and Order
- RESTful APIs for all entities
- Pagination and sorting support
- DTO-based validation with Hibernate Validator
- Global exception handling with `@ControllerAdvice`
- Unit tests for service layer using Mockito and JUnit 5
- MongoDB integration for NoSQL storage

![Features Overview](images/features-overview.png)

---

## Project Structure

ecommerce-backend/
├── src/main/java/com/example/ecommerce
│ ├── EcommerceBackendApplication.java
│ ├── model/
│ ├── repository/
│ ├── service/
│ ├── controller/
│ └── exception/
├── src/main/resources/
│ └── application.properties
└── src/test/java/com/example/ecommerce/service/

text

---

## Technologies

- Java 17+
- Spring Boot 3.x
- Spring Data MongoDB
- MongoDB NoSQL Database
- Maven for build management
- JUnit 5 & Mockito for testing
- Swagger/OpenAPI (optional for API docs)

![Technology Stack](images/technology-stack.png)

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- MongoDB running locally or remote access
- Maven 3.x installed
- IDE of your choice (IntelliJ IDEA, Eclipse, VSCode)

### Running the Application

1. Clone the repository

git clone https://github.com/sangeetha2402-ravichandran/ecommerce-backend.git
cd ecommerce-backend

text

2. Configure MongoDB connection in `src/main/resources/application.properties`

spring.data.mongodb.uri=mongodb://localhost:27017/ecommerce-db

text

3. Build and run the application

mvn clean install
mvn spring-boot:run

text

Application will be running at: `http://localhost:8080`

---

## API Endpoints

Here is a sample of exposed REST APIs:

| Resource  | Endpoint                  | HTTP Method | Description               |
|-----------|---------------------------|-------------|---------------------------|
| Products  | `/api/products`            | GET         | Get all products          |
| Products  | `/api/products/paged`      | GET         | Get products with pagination and sorting |
| Products  | `/api/products/{id}`       | GET         | Get product by ID         |
| Products  | `/api/products`            | POST        | Create new product        |
| Products  | `/api/products/{id}`       | DELETE      | Delete product by ID      |

Similar endpoints exist for **Category**, **User**, and **Order** entities.

---

## Exception Handling

This project uses a global exception handler to return standardized JSON error responses.

Example error response:

{
"timestamp": "2025-09-21T10:46:00",
"error": "Product not found with id 123"
}

text

---

## Testing

Unit tests cover service layer logic using Mockito mocks.

To run tests:

mvn test

text

![Test Coverage](images/test-coverage.png)

---

## Screenshots

### Product List API Response

![Product List API](images/api-product-list.png)

### Pagination Example

![Pagination](images/api-pagination.png)

---

## Contributing

Contributions are welcome! Please fork the repository and create a pull request.

---

## License

This project is licensed under the MIT License.

---
