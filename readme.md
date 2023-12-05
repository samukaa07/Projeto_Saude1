Projeto Saude

O Projeto Saude é uma aplicação desenvolvida em Java com o framework Spring Boot para gerenciamento de beneficiários e seus documentos associados.

-Funcionalidades Principais-

Cadastrar Beneficiário:
Endpoint: POST /beneficiarios'
Adiciona um novo beneficiário ao sistema.

Listar Beneficiários:
Endpoint: GET /beneficiarios
Recupera a lista de todos os beneficiários cadastrados.
Listar Documentos de um Beneficiário:

Endpoint: GET /beneficiarios/{id}/documentos
Obtém a lista de documentos associados a um beneficiário específico.
Atualizar Beneficiário:

Endpoint: PUT /beneficiarios/{id}
Atualiza os detalhes de um beneficiário existente.
Remover Beneficiário:

Endpoint: DELETE /beneficiarios/{id}
Remove um beneficiário com base no ID fornecido.

Tecnologias Utilizadas
*Java
*Spring Boot
*Swagger (para documentação da API)
*H2

Configuração e Execução

Configuração do Ambiente:
Certifique-se de ter o Java e o Maven instalados em seu ambiente de desenvolvimento.

Clone do Repositório:
git clone https://seu-repositorio.com/beneficiario.git

Build do Projeto:
cd beneficiario
mvn clean install

Execução da Aplicação:
java -jar target/beneficiario-1.0.0.jar

Documentação da API:
Após iniciar a aplicação, a documentação Swagger pode ser acessada em http://localhost:8080/swagger-ui
