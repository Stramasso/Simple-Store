# SimpleStore - Loja Virtual de Perfumes

Uma aplicação web desenvolvida com Spring Boot para gerenciamento e venda de perfumes online.

---

## 🚀 Funcionalidades

- **Autenticação de usuários** (login com senha criptografada via Spring Security)
- **Dashboard** com informações resumidas do sistema (futuro)
- **Cadastro, edição, listagem e exclusão de perfumes** (futuro)
- **Registro de pedidos e visualização de histórico** (futuro)
- **Controle de estoque** (futuro)
- **Acesso diferenciado por tipo de usuário** (cliente/admin – futuro)
- **Cadastro de usuários** via formulário web e API REST
- **Login e logout** com redirecionamento seguro
- **Páginas de login e cadastro** responsivas e intuitivas
- **Integração com banco de dados** (SQL Server)

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **Banco de Dados SQL Server** (ou MySQL/H2 para testes locais)
- **Maven**
- **HTML, CSS e Thymeleaf** (frontend)
- **Git e GitHub** (controle de versão)
- **Lombok** (opcional, para facilitar a criação de modelos)

## 🗄️ Banco de Dados

**Entidades principais:**
- **Usuario** (nome, email, senha criptografada)
- **Produto** (futuro)
- **Pedido** (futuro)
- **ItemPedido** (futuro)

---

## 📦 Como rodar o projeto

1. **Clone o repositório:**
git clone https://github.com/Stramasso/Simple-Store.git

2. **Acesse o diretório do projeto:**
cd Simple-Store


3. **Configure o banco de dados em `src/main/resources/application.properties`.**

4. **Rode a aplicação com o Spring Boot:**
.\mvnw.cmd spring-boot:run

5. **Acesse [http://localhost:8080/login](http://localhost:8080/login) no navegador.**

---

## 📚 Fluxo do Sistema

1. **Cadastre um usuário em `/cadastro` ou via API REST (`POST /api/usuarios`).**
2. **Faça login em `/login`.**
3. **Após o login, você será redirecionado para `/home` (futuro: dashboard).**

---

## 📌 Dicas e Observações

- **Todos os usuários devem ser cadastrados pelo sistema ou API para garantir senha criptografada.**
- **Nunca insira usuários manualmente no banco com senha em texto puro.**
- **O projeto segue boas práticas de desenvolvimento web e Java Spring, com foco em segurança e usabilidade[2].**

---

## 🤝 Como Contribuir

1. **Faça um fork do projeto.**
2. **Crie uma branch (`git checkout -b feature/nome`).**
3. **Faça commit das suas alterações.**
4. **Abra um Pull Request.**

---

Desenvolvido para fins acadêmicos na disciplina de Programação Web[1].

