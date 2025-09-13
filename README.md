🚗 VroomVault Backend

VroomVault is a Spring Boot–based backend system for managing a vehicle rental and booking platform.
It provides a set of RESTful APIs to handle users, owners, vehicles, bookings, payments, reviews, and administrative operations.

📌 Features

Authentication & Authorization

Register, login, and manage user sessions with JWT authentication.

User Management

Profile update, password change, and secure access.

Owner Management

Manage vehicle owners, upload documents, and update profiles.

Vehicle Management

Add, update, and delete vehicles, along with fetching vehicle details.

Booking System

Create, cancel, and manage bookings with availability checks.

Review System

Add and manage reviews with ratings for vehicles.

Payment Integration

Order creation and verification for secure transactions.

Admin Panel

Manage users, vehicles, roles, and view platform statistics.

⚙️ Tech Stack

Backend: Spring Boot 3.x (Java 17+)

Database: MySQL / PostgreSQL (configurable)

Security: Spring Security with JWT

Build Tool: Maven

API Documentation: Swagger / OpenAPI (available at /swagger-ui.html or /v3/api-docs)

📂 API Endpoints
🔑 Authentication
Method	Endpoint	Description

POST	/auth/register	Register a new user

POST	/auth/login	Login and generate JWT token

👤 User Controller
Method	Endpoint	Description

PUT	/user/update-profile	Update user profile

PUT	/user/change-password	Change password

GET	/user/profile	Get logged-in user profile


🧑‍💼 Owner Controller

Method	Endpoint	Description

PUT	/owner/update-profile	Update owner profile

PUT	/owner/change-password	Change password

POST	/owner/upload-docs	Upload documents

GET	/owner/profile	Get owner profile

🚙 Vehicle Controller

Method	Endpoint	Description

POST	/vehicle/add	Add a vehicle

PUT	/vehicle/update-status/{vehicleId}	Update vehicle status

PUT	/vehicle/owner/{vehicleId}	Assign owner to vehicle

DELETE	/vehicle/owner/{vehicleId}	Remove owner from vehicle

GET	/vehicle/owner/{ownerId}	Get vehicles by owner

GET	/vehicle/my-vehicles	Get current user's vehicles

GET	/vehicle/details/{id}	Get vehicle details

GET	/vehicle/all	Get all vehicles

📅 Booking Controller

Method	Endpoint	Description

POST	/booking/create	Create a booking

POST	/booking/create-after-payment	Create booking after payment

PUT	/booking/cancel/{bookingId}	Cancel a booking

GET	/booking/user/{userId}	Get bookings for a user

GET	/booking/owner/{ownerId}	Get bookings for an owner

GET	/booking/my-detailed-bookings-by-user/{userId}	Get detailed bookings by user

GET	/booking/check-availability	Check vehicle availability

DELETE	/booking/delete/{bookingId}	Delete booking

⭐ Review Controller

Method	Endpoint	Description

POST	/review/add	Add a review

GET	/review/vehicle/{vehicleId}	Get reviews for a vehicle

GET	/review/vehicle/{vehicleId}/average-rating	Get average rating of a vehicle

GET	/review/user/{userId}	Get reviews by user

DELETE	/review/delete/{reviewId}	Delete review


💳 Payment Controller

Method	Endpoint	Description

POST	/payment/create-order	Create a payment order

POST	/payment/verify	Verify payment

GET	/payment/{paymentId}	Get payment details

🛠️ Admin Controller

Method	Endpoint	Description

GET	/admin/vehicles	Get all vehicles

POST	/admin/vehicles	Add vehicle as admin

PUT	/admin/vehicles/{id}/status	Update vehicle status

DELETE	/admin/vehicles/{id}	Delete a vehicle

GET	/admin/users	Get all users

PUT	/admin/users/{id}/role	Update user role

DELETE	/admin/users/{id}	Delete user

GET	/admin/stats	Get platform statistics

🚀 Getting Started
Prerequisites

Java 17+

Maven 3.x

MySQL or PostgreSQL

Run Locally
# Clone repository
git clone https://github.com/your-username/vroomvault-backend.git
cd vroomvault-backend

# Configure database in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/vroomvault
spring.datasource.username=root
spring.datasource.password=yourpassword

# Build & run
mvn clean install
mvn spring-boot:run


Application will be available at:

👉 http://localhost:8080

Swagger UI: 👉 http://localhost:8080/swagger-ui.html

📊 Database Schema (High-Level)

User (id, name, email, password, role, profileInfo)

Owner (id, userId, documents, profileInfo)

Vehicle (id, ownerId, status, details)

Booking (id, userId, vehicleId, bookingStatus, dates)

Review (id, userId, vehicleId, rating, comment)

Payment (id, bookingId, paymentStatus, transactionId)

🛡️ Security

JWT-based authentication and authorization

Role-based access control (User, Owner, Admin)

Encrypted password storage using BCrypt
