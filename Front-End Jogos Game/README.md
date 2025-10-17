<img
  src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=28&duration=3000&pause=1000&color=007BFF&vCenter=true&width=800&lines=%F0%9F%8E%AE%20Loja%20de%20Games%20%E2%80%94%20Projeto%20Full%20Stack"
  alt="🎮 Loja de Games — Projeto Full Stack"
/>

## 📘 Descrição
A Loja de Games NaBêra é um projeto full stack que tem como objetivo simular uma loja virtual de jogos eletrônicos. 
O sistema permite cadastrar e visualizar produtos (jogos), além de gerenciar categorias.

O projeto está dividido em duas partes:
- Front-End: HTML, CSS e JavaScript puro (sem frameworks), focado em responsividade e design moderno.
- Back-End: Java com Spring Boot, utilizando uma arquitetura RESTful para comunicação com o front-end.

---

## 🖥️ Front-End
### Estrutura
O front-end é composto principalmente por um arquivo index.html e um CSS modular que garante a responsividade da aplicação. 
Ele se comunica com o servidor através de fetch API e consome endpoints REST do back-end.

### Funcionalidades atuais
- Exibição dos produtos cadastrados.
- Filtro por categoria e busca por nome/descrição.
- Formulário para cadastrar novos produtos.
- Inserção local de produtos (modo demo) quando o back-end está indisponível.

### Tecnologias utilizadas
- HTML5 e CSS3 — Estrutura e estilo responsivo.
- JavaScript (ES6) — Manipulação de DOM e consumo da API.
- Fetch API — Comunicação com o back-end via REST.
- Intl API — Formatação de preços em Real (BRL).

---

## ⚙️ Back-End
### Tecnologias e Frameworks
- Java 17+
- Spring Boot 3+
- Spring Web — Criação de controladores REST.
- Spring Data JPA — Persistência de dados.
- H2 / MySQL — Banco de dados (dependendo do ambiente).
- Jakarta Validation — Validação de entidades.

### Estrutura básica
src/
├── main/java/com/generation/
│   ├── controller/ProdutoController.java
│   ├── controller/CategoriaController.java
│   ├── model/Produto.java
│   ├── model/Categoria.java
│   ├── repository/ProdutoRepository.java
│   ├── repository/CategoriaRepository.java
│   └── LojaDeGamesApplication.java
└── resources/
    ├── application.properties
    └── data.sql (opcional)

### Endpoints principais
Produtos:
GET  /produtos — Lista todos os produtos
POST /produtos — Cadastra um novo produto
GET  /produtos/{id} — Busca produto por ID
PUT  /produtos/{id} — Atualiza produto existente
DELETE /produtos/{id} — Remove produto

Categorias:
GET  /categorias — Lista todas as categorias
POST /categorias — Cadastra uma nova categoria
PUT  /categorias/{id} — Atualiza categoria
DELETE /categorias/{id} — Remove categoria

---

## 🚀 Como rodar o projeto
### Back-End (Spring Boot)
1. Clone o repositório:
   git clone https://github.com/seuusuario/loja-de-games.git
2. Acesse a pasta do projeto:
   cd loja-de-games/backend
3. Execute o projeto Spring Boot:
   mvn spring-boot:run
4. O servidor iniciará em http://localhost:8080

### Front-End
1. Acesse a pasta do front-end:
   cd loja-de-games/frontend
2. Abra o arquivo index.html em seu navegador (duplo clique ou via extensão Live Server).

---

## 🎥 Demonstração da Aplicação

Assista ao vídeo de demonstração da **Loja de Games — Projeto Full Stack** clicando no link abaixo:

[▶️ **Ver demonstração completa no Link**](https://ik.imagekit.io/vvkjumzbj/Loja%20de%20Games%20-%20Google%20Chrome%202025-10-17%2017-31-44.mp4?updatedAt=1760734037193)



---

## 🔧 Pontos a serem trabalhados (próximos passos)
✅ Produtos
- Implementar os métodos PUT e DELETE no back-end e integrá-los ao front.
- Adicionar botão "Editar" e "Excluir" nos cards de produto.
- Criar modais de confirmação e edição inline.

✅ Categorias
- Implementar CRUD completo (criação, edição e remoção de categorias).
- Permitir vincular categorias no front-end sem recarregar a página.

✅ Geral
- Tratar mensagens de erro do servidor e exibir notificações amigáveis.
- Implementar persistência com banco MySQL em produção.
- Adicionar paginação e ordenação no endpoint /produtos.
- Criar testes unitários e de integração (JUnit + MockMvc).

---

## 🧑‍💻 Autor
Rafaela Lemes — Desenvolvimento Full Stack - Academico

---

## 📄 Licença
Este projeto é de uso didático e livre para estudos e aprimoramentos.
