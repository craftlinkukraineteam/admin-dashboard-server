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
    Endpoints:
  - POST /auth/register
  - POST /auth/login
  - GET /auth/profile

### Запуск
Запуск мікросервісу в JetBrains IntelliJ Idea через консоль командою: mvn spring-boot:run

### Налаштування бази даних
У файлі `application.properties` вказано усі необхідні параметри підключення:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
