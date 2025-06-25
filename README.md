# 📚 Challenge ForumHub - API REST (Programa ONE - Alura + Oracle)

Este projeto faz parte do **Challenge Backend do Programa Oracle Next Education (ONE)** em parceria com a **Alura**. Trata-se de uma **API RESTful** desenvolvida em **Java com Spring Boot**, que simula um sistema de dúvidas de alunos através de tópicos, com autenticação via token e operações completas de CRUD.

## 🚀 Funcionalidades

- ✅ Criação de novos tópicos (dúvidas de alunos)
- ✅ Listagem paginada de tópicos
- ✅ Detalhamento de um tópico específico
- ✅ Atualização de dados de um tópico
- ✅ Exclusão de tópicos
- ✅ Autenticação via token JWT para acesso às rotas protegidas

## 🔒 Autenticação

A autenticação é feita com **JWT (JSON Web Token)**. O login é realizado via endpoint `/login`, e um token é retornado. Esse token deve ser incluído no header `Authorization` como:

Todas as rotas (exceto `/login`) requerem autenticação.

## 📂 Endpoints principais

| Método | Rota               | Descrição                        |
|--------|--------------------|----------------------------------|
| GET    | `/topicos`         | Lista tópicos (paginado)         |
| GET    | `/topicos/{id}`    | Detalha um tópico                |
| POST   | `/topicos`         | Cadastra um novo tópico          |
| PUT    | `/topicos`         | Atualiza dados de um tópico      |
| DELETE | `/topicos/{id}`    | Exclui um tópico                 |

## 🧪 Testes
Todos os testes foram realizados via Postman, com autenticação configurada e simulação de todas as operações da API.

## 🛠️ Tecnologias utilizadas
- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Hibernate / JPA
- MySQL
- Postman (testes)
- Maven

## 👨‍💻 Autor
Desenvolvido por **Matheus Schalch** como parte do programa de formação em backend do Programa ONE (Oracle Next Education).

- [LinkedIn](www.linkedin.com/in/matheus-schalch-79aab6189)
- [GitHub](https://github.com/MSchalch)
