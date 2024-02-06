# RentABike

RentABike is a Java 11-based project that allows users to rent bikes online. It provides functionality for user registration, authentication, bike booking, and administrative tasks such as adding bikes to the system.

## Features

- **User Registration**: Users can register for an account to access the system.
- **User Authentication**: Secure login functionality for registered users.
- **Bike Booking**: Users can browse available bikes and book them.
- **Admin Operations**: Administrators can add new bikes to the system.

## Technologies Used

- Java 11
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- H2 Database 
- Lombok

## Getting Started

To run the RentABike project locally, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/RentABike.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd RentABike
   ```

3. **Build the Project**:
   ```bash
   ./mvnw clean install
   ```

4. **Run the Application**:
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Access the Application**:
   Open your web browser and go to [http://localhost:8080](http://localhost:8080) to access the RentABike application.

## Configuration

- Database configuration can be found in `application.properties`.
- Security configuration (such as user roles and access control) can be found in `WebSecurityConfig.java`.

## Usage

- Use Postman or any HTTP client to interact with the API endpoints.
