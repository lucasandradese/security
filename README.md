# 🔐 API de Autenticação e Autorização

---

##  Sobre o Projeto

API REST desenvolvida com **Java + Spring Boot** focada em **segurança, autenticação e autorização**, utilizando **Spring Security** integrado ao **Auth0**.

O projeto também aplica:

* Validações com **Bean Validation**
* Versionamento de banco com **Flyway**
* Ambiente isolado com **Docker**
* Persistência com **PostgreSQL**

---

##  Tecnologias

* Java 21+
* Spring Boot
* Spring Security
* Auth0 (JWT / OAuth2)
* Jakarta Validation
* PostgreSQL
* Flyway
* Docker / Docker Compose
* JPA / Hibernate

---

##  Arquitetura em camadas

```
Controller → Service → Repository → Database
```

### Boas práticas:

* Uso de DTOs
* Tratamento global de exceções
* Separação de responsabilidades

---

## 🔐 Segurança

* Autenticação via **Auth0**
* Autorização baseada em **roles/permissões**
* Uso de **JWT**

---

##  Modelagem de Dados

Relacionamento principal:

> **User ↔ Permission (N:N)**

<img width="796" height="351" alt="image" src="https://github.com/user-attachments/assets/df084f9b-b858-4c7a-bac1-f371f9a0b290" />


---

## 🗄️ Banco de Dados

* PostgreSQL
* Versionamento com Flyway

📁 Migrations:

```
src/main/resources/db/migration
```

---

## 🐳 Docker

Suba o banco com:

```bash
docker-compose up -d
```

---

## ⚙️ Configuração

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/security_db
    username: postgres
    password: postgres

auth0:
  domain: seu-domain.auth0.com
  audience: sua-api
```

---

## ▶️ Como executar

```bash
# Clonar o repositório
git clone https://github.com/lucasandradese/security.git

# Entrar na pasta
cd security

# Subir o banco
docker-compose up -d

# Rodar aplicação
./mvnw spring-boot:run
```

---

## 🧪 Validações

```java
@NotBlank
@Email
private String email;

@Size(min = 6)
private String password;
```

---

## 🔒 Controle de Acesso

```java
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/users")
public List<UserDTO> findAll() {
    return service.findAll();
}
```

---

## 📌 Endpoints (exemplo)

| Método | Endpoint     | Descrição         |
| ------ | ------------ | ----------------- |
| POST   | /register    | Criar usuário     |
| POST   | /login       | Realizar login    |


---

## Autor

**Lucas Andrade**


