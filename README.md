# Administration Panel (Server)

Невеликий мікросервіс, який відповідатиме за логіку панелі адміністрування, створений на Spring Boot. Сервіс працює з базою даних PostgreSQL з можливістю підключення як локально, так і віддалено за допомогою Docker Compose. Сервіс використовує JWT (JSON Web Token) для аутентифікації.

### Використовувані технології
- Java 17+;
- Maven;
- Spring Boot;
- Spring Data JPA;
- JWT (JSON Web Token);
- Hibernate;
- PostgreSQL (локально або через Docker Compose);
- Swagger / OpenAPI:

### Логіка роботи:
```properties
  POST /auth/register
  POST /auth/login
  GET /auth/profile
```

### Структура проєкту
```properties
├── server/
│   ├── .idea/
│   ├── .mvn/
│   └── src/
│       └── main/
│           ├── java/
│               └── admin/dashboard/server/
│                   ├── config/
│                       └── OpenApiConfig.java
│                   ├── controller/
│                       └── AuthController.java
│                   ├── model/
│                       └── User.java
│                   ├── repository/
│                       └── UserRepository.java
│                   ├── service/
│                       └── AuthService.java
│                   └── ServerApplication.java
│           └── resources/
│               ├── static/
│                   └── swagger.yaml
│               ├── templates/
│               └── application.properties
│       ├── test/
│           └── java/
│               └── admin.dashboard.server/
│                   └── ServerApplicationTests.java
│       ├── target/
│       ├── docker-compose.yml
│       ├── HELP.md
│       ├── mvnw
│       ├── mvnw.cmd
│       ├── pow.xml
│       └── .gitignore
│           └── .gitattributes
```

### Запуск
Запуск проєкту в JetBrains IntelliJ Idea через консоль командою:
```properties
mvn spring-boot:run
```

### Налаштування проєкту
У файлі `application.properties` вказані усі необхідні параметри підключення:
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
