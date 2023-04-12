# Sobre o Projeto

O usuário pode cadastrar uma conta, realizar transação de depósito e saque da própria conta, visualizar extrato e o saldo.

# Tecnologias Ultilizadas

+ Angular
+ Angular Material
+ Bootstrap
+ TypeScript
+ Java 
+ Spring Boot
+ MySQL

# Executar o Backend

1. No arquivo src/resources/application.properties
    - Linha 1: Alterar o nome do banco de dados
    - Linha 2: Alterar o username
    - Linha 1: Alterar o passowd
    - Obs: Alterar as informações acima conforme as configuraçoes do seu banco de dados
2. Execute a API ultilizando o run do seu editor de texto.

# Rotas Ultilizadas

+ Criar conta:(POST) http://localhost:8080/api/cadastro
+ Acessar conta: (POST) http://localhost:8080/api/login
+ Depositar: (POST) http://localhost:8080/conta/depositar
+ Saque: (POST) http://localhost:8080/conta/saque
+ Saldo: (GET) http://localhost:8080/api/saldo/{cpf}
+ Extrato: (GET) http://localhost:8080/api/extrato/{cpf}

# Executar Frontend

1. Instalar dependências
    - npm install ou yarn install
2. Executar o projeto
    - npm start
