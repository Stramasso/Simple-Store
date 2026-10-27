# Simple Store

Loja virtual de perfumes feita com Spring Boot, desenvolvida na disciplina de Programação Web da Universidade São Judas Tadeu (2025).

![Java](https://img.shields.io/badge/Java_17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.5-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white)
![SQL Server](https://img.shields.io/badge/SQL_Server-CC2927?style=flat-square&logo=microsoftsqlserver&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white)

## O que o sistema faz

- **Autenticação** com Spring Security: login por formulário, senhas com BCrypt e logout com redirecionamento
- **Cadastro de usuários** pela tela `/cadastro` ou pela API REST (`POST /api/usuarios`)
- **Produtos**: listagem, cadastro, edição e exclusão, com preço, estoque e categoria
- **Categorias**: listagem e cadastro
- **Pedidos**: serviço que transforma o carrinho em pedido e lista os pedidos do usuário logado (as telas de pedido ainda estão em construção)
- **Seed inicial**: um usuário administrador é criado na primeira execução

## Arquitetura

O projeto segue a divisão em camadas do Spring:

```
simplestore/src/main/java/com/simplestore
├── controllers/    rotas web (Thymeleaf) e REST
├── services/       regras de negócio
├── repositories/   acesso a dados com Spring Data JPA
├── models/         entidades: Usuario, Role, Produto, Categoria, Pedido, ItemPedido
└── config/         segurança e carga inicial do banco
```

## Como rodar

Pré-requisitos: JDK 17 e um SQL Server acessível (local ou em container).

1. Clone o repositório e entre na pasta do projeto:

   ```bash
   git clone https://github.com/Stramasso/Simple-Store.git
   cd Simple-Store/simplestore
   ```

2. Crie o banco `simplestore` e defina as credenciais como variáveis de ambiente:

   ```bash
   # Linux/macOS
   export DB_USER=simplestore
   export DB_PASSWORD=sua_senha

   # Windows (PowerShell)
   $env:DB_USER="simplestore"
   $env:DB_PASSWORD="sua_senha"
   ```

   Se o banco não estiver em `localhost:1433`, defina também `DB_URL` com a URL JDBC completa.

3. Suba a aplicação:

   ```bash
   ./mvnw spring-boot:run      # Linux/macOS
   .\mvnw.cmd spring-boot:run  # Windows
   ```

4. Acesse http://localhost:8080/login.

## Próximos passos

- Telas de "meus pedidos" e detalhes do pedido
- Perfis com permissões diferentes para cliente e administrador
- Autenticação por token (JWT) para a API REST
- Testes de integração dos serviços
