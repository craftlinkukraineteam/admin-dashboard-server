# Administration Panel Logic Service

Невеликий мікросервіс, який відповідатиме за логіку панелі адміністрування, створений на Spring Boot.  
Сервіс працює з базою даних PostgreSQL з можливістю підключення як локально, так і віддалено з допомогою Docker Compose; використовує JWT (JSON Web Token) для аутентифікації.

### Стек технологій, що використовується
- Java 17+;
- Maven;
- Spring Boot;
- Spring Data JPA;
- JWT (JSON Web Token);
- Hibernate;
- PostgreSQL (локально або через Docker Compose);
- Swagger / OpenAPI:

### API Endpoints:
```properties
  POST /auth/register
  POST /auth/login
  GET /auth/profile
```

### Структура проєкту
├── backend/
├── auth-service/
│   ├──── controller/
│   │   └── AuthController.java  # /login, /register
│   ├──── service/
│   │   └── AuthService.java
│   ├──── model/
│   │   └── User.java
│   ├──── repository/
│   │   └── UserRepository.java
│   └── Application.java
├───── admin-service/
│   ├───  controller/
│   │   └── AdminController.java
│   ├───  service/
│   │   └── AdminService.java
│   └── Application.java


### Запуск
Запуск мікросервісу в JetBrains IntelliJ Idea через консоль командою:
```properties
mvn spring-boot:run
```

### Налаштування бази даних
У файлі `application.properties` вказано усі необхідні параметри підключення:
```properties
spring.application.name=server
server.port=8081
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=admin
spring.datasource.password=admin
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.sql.init.mode=always
```
