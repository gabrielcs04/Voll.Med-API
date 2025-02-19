# API Voll.med

API REST da aplicação Voll.med, desenvolvida com Spring Boot.

## Sobre o projeto

Voll.med é uma clínica médica fictícia que precisa de um aplicativo para gestão de consultas. O aplicativo deve possuir funcionalidades que permitam o cadastro de médicos e de pacientes, e também o agendamento e cancelamento de consultas.

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
- **Banco de dados configurado**

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
| Método | Endpoint   | Descrição                                             |
|--------|------------|-------------------------------------------------------|
| POST   | `/login`   | Gera um token JWT a partir das credenciais fornecidas |

### Endpoints Protegidos
Os seguintes endpoints requerem um token JWT válido para serem acessados:

| Método | Endpoint          | Descrição                                 |
|--------|-------------------|-------------------------------------------|
| POST   | `/medicos`        | Cadastra um novo médico                   |
| GET    | `/medicos`        | Lista todos os médicos                    |
| GET    | `/medicos/{id}`   | Obtém detalhes de um médico específico    |
| PUT    | `/medicos/{id}`   | Atualiza informações de um médico         |
| DELETE | `/medicos/{id}`   | Remove um médico                          |
| POST   | `/pacientes`      | Cadastra um novo paciente                 |
| GET    | `/pacientes`      | Lista todos os pacientes                  |
| GET    | `/pacientes/{id}` | Obtém detalhes de um paciente específico  |
| PUT    | `/pacientes/{id}` | Atualiza informações de um paciente       |
| DELETE | `/pacientes/{id}` | Remove um paciente                        |

Para acessar esses endpoints, é necessário incluir o token JWT no cabeçalho da requisição:
```sh
Authorization: Bearer SEU_TOKEN_AQUI
```
