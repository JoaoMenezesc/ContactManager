📌 Contact Manager - Spring Boot API





A simple RESTful API for managing contacts, built with Spring Boot and PostgreSQL. The application provides CRUD operations to create, read, update, and delete contacts.

🚀 Features

✅ Create, read, update, and delete contacts✅ RESTful API with structured endpoints✅ PostgreSQL database integration✅ Spring Data JPA for data persistence✅ Lombok to reduce boilerplate code✅ Docker support for easy deployment

🛠️ Technologies Used

🔹 Java 17🔹 Spring Boot 3.x🔹 Spring Data JPA🔹 PostgreSQL🔹 Docker🔹 Lombok

📦 Installation & Setup

1️⃣ Clone the Repository

git clone https://github.com/your-username/contact-manager.git
cd contact-manager

2️⃣ Configure the Database

Ensure PostgreSQL is running and update src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/contactsdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3️⃣ Run the Application

With Maven:

mvn spring-boot:run

With Docker:

docker-compose up -d

📡 API Endpoints

🔹 Contact Endpoints

Method

Endpoint

Description

GET

/contatos

Get all contacts

GET

/contatos/{id}

Get contact by ID

POST

/contatos

Create a new contact

PUT

/contatos/{id}

Update a contact

DELETE

/contatos/{id}

Delete a contact

🔹 Example Request (POST)

{
  "nome": "John Doe",
  "email": "john.doe@email.com",
  "telefone": "123456789"
}

📜 License

This project is licensed under the MIT License. See the LICENSE file for more details.

👨‍💻 Author

Your Name📧 Contact: your.email@example.com🔗 GitHub: your-username

