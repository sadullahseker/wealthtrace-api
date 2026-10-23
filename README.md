# WealthTrace API 🚀

A secure, scalable, and modern **Spring Boot 3 RESTful API** designed for personal finance and asset management. It allows users to manage portfolios, track net worth, and categorize various asset classes efficiently.

---

## 🛠️ Tech Stack

- **Framework:** Java 17, Spring Boot 3.2
- **Database:** PostgreSQL
- **Data Access:** Spring Data JPA (Hibernate)
- **Security:** Spring Security
- **Containerization:** Docker & Docker Compose
- **Build Tool:** Maven

---

## 🔑 Key Features

- **Asset Management:** Full CRUD operations for creating, reading, updating, and deleting financial assets.
- **RESTful Architecture:** Clean, intuitive, and resource-oriented API endpoints (`/api/v1/assets`).
- **Data Persistence:** Relational database integration powered by PostgreSQL.
- **Containerized Setup:** Fully configured `docker-compose` setup for effortless local database deployment.

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven
- Docker Desktop

### Quick Start

```bash
git clone [https://github.com/YOUR_USERNAME/wealthtrace-api.git](https://github.com/YOUR_USERNAME/wealthtrace-api.git)
cd wealthtrace-api
docker-compose up -d
./mvnw spring-boot:run
