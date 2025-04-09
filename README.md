# 📦 SimpleApi

API REST simples construída com **Spring Boot 3.4.4** e **Java 17**, com rotas básicas de CRUD para usuários.

---

## 🚀 Funcionalidades

- ✅ CRUD completo de usuários
- ✅ Camadas organizadas: controller, service, repository, model, dto, mapper
- ✅ Integração com PostgreSQL
- ✅ CORS configurado para consumo externo (ex: Flutter Web)
- ✅ Testado com Insomnia

---

## 🌐 Endpoints da API

| Método | Rota                    | Descrição                       |
|--------|-------------------------|----------------------------------|
| `GET`  | `/api/v1/users`         | Lista todos os usuários         |
| `GET`  | `/api/v1/users/{id}`    | Retorna usuário por ID          |
| `POST` | `/api/v1/users`         | Cria novo usuário               |
| `PUT`  | `/api/v1/users/{id}`    | Atualiza um usuário existente   |
| `DELETE`| `/api/v1/users/{id}`   | Remove usuário por ID           |

---

## 📥 Exemplo de Requisição `POST /api/v1/users`

### Corpo da requisição (JSON):

```json
{
  "username": "joao.silva",
  "email": "joao@email.com",
  "password": "123456",
  "role": "ROLE_USER"
}
```

### Resposta esperada:

```json
{
  "id": 1,
  "username": "joao.silva",
  "email": "joao@email.com",
  "role": "ROLE_USER"
}
```

---

## 🧩 Estrutura de Pastas

```
com.sudema.simpleapi/
├── config/
├── user/
│   ├── controller/
│   ├── dto/
│   │   ├── request/
│   │   └── response/
│   ├── mapper/
│   ├── model/
│   ├── repository/
│   └── service/
└── SimpleApiApplication.java
```

---

## 🔐 CORS Configurado

Permite requisições do domínio do frontend:

```java
.allowedOrigins("https://sudema-frontend.vercel.app") // Dominio fictício
.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
```

---

## 🐘 Banco de Dados

- **SGBD**: PostgreSQL
- **Porta**: `5434`
- **Nome do banco**: `simpleapi`
- **Credenciais**: definidas em `application.properties` (Poderia ser um .env)

---

## ⚙️ Tecnologias

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- PostgreSQL
- Lombok
- Insomnia (testes manuais)

---

## 🛠️ Como rodar o projeto localmente

### Pré-requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL rodando na porta `5434` com o banco `simpleapi` criado

### Passos:

```bash
# 1. Clone o repositório
git clone https://github.com/jluca-s/SimpleApiSudema.git

# 2. Acesse o projeto
cd SimpleApi

# 3. Configure o banco de dados
Verifique o arquivo src/main/resources/application.properties (Poderia ser um .env)

# 4. Rode a aplicação
./mvnw spring-boot:run
```

---

## 📄 Licença

Este projeto é de uso interno da Sudema, criado para fins de aprendizado e integração com o app Flutter.

---

## ✨ Autor

Desenvolvido por **[Joao Lucas Goncalves]**, estagiário backend na Sudema 🌱

```