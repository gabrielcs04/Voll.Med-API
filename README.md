# API Voll.med

API REST da aplicação Voll.med, desenvolvida com Spring Boot.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.4.1**
- **Maven**
- **Banco de Dados MySQL**
- **JWT (JSON Web Token) para autenticação e autorização**

## Configuração do Projeto

### Pré-requisitos
Certifique-se de ter instalado:
- **Java 17**
- **Maven**
- **Banco de Dados configurado**

### Instalação
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/api-vollmed.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd Voll.Med-API
   ```
3. Compile e instale as dependências:
   ```sh
   mvn clean install
   ```

### Executando o Projeto
Para rodar a API localmente, utilize o seguinte comando:
```sh
mvn spring-boot:run
```
A aplicação estará disponível em: `http://localhost:8080`

## Autenticação e Autorização
A API utiliza JWT para autenticação e proteção de endpoints. Para obter um token de acesso, é necessário realizar login na aplicação.

### Endpoint de Autenticação
| Método | Endpoint      | Descrição |
|--------|---------------|-----------|
| POST   | `/login` | Gera um token JWT a partir das credenciais fornecidas |

### Endpoints Protegidos
Os seguintes endpoints requerem um token JWT válido para serem acessados:

| Método | Endpoint        | Descrição |
|--------|-----------------|-----------|
| POST   | `/medicos`      | Cadastra um novo médico |
| GET    | `/medicos`      | Lista todos os médicos |
| GET    | `/medicos/{id}` | Obtém detalhes de um médico específico |
| PUT    | `/medicos/{id}` | Atualiza informações de um médico |
| DELETE | `/medicos/{id}` | Remove um médico |

Para acessar esses endpoints, é necessário incluir o token JWT no cabeçalho da requisição:
```sh
Authorization: Bearer SEU_TOKEN_AQUI
```
