# **Projeto Bootcamp API Users**
![ ](https://hermes.dio.me/tracks/c90e7979-b807-4941-895a-8d85564b142e.png)

Bem-vindo ao repositório do projeto API Users! 🎉 Estou empolgado em compartilhar com vocês esse projeto para o bootcamp “Coding the Future Claro Java Spring Boot” - https://web.dio.me/track/coding-the-future-claro-java-spring-boot . Este projeto foi desenvolvido com muito cuidado para servir como um recurso de aprendizado e um ponto de partida para explorarmos juntos boas práticas em desenvolvimento de software.

## **Como utilizar esse projeto?**

1. **Já tenho uma conta no GitHub**

- **Quero evoluir meu projeto a partir desse:** Nesse caso, dê um fork nesse projeto. Assim você poderá ampliar esse projeto no seu próprio GitHub, adicionando o seu próprio código, o que eu recomendo muito.
- **Quero apenas acompanhar esse projeto:** Caso deseje apenas acompanhar a evolução desse projeto para as próximas monitorias, dê um watch, assim será informado sobre as novas alterações desse projeto.

Considere dar uma “estrela“ ao projeto se você achar ele útil **😊**!

2. **Não tenho um conta no GitHub**

Primeiramente, recomendo que crie sua conta no GitHub e siga uma das opções do item 1. Caso opte por não criar a conta no GitHub, você pode:

- **Tenho o Git instalado em minha máquina:** clone este projeto com o comando:

“git clone <https://github.com/LevyVianna/bootcamp-apis-springboot.git”>

… e você poderá alterar esse código na sua IDE favorita.

- **Não tenho o Git instalado em minha máquina:** você pode fazer o dowload do projeto clicando no botão verde “Code“ e depois em “Download ZIP”.

## **Stack Utilizado no Projeto**

Este projeto foi desenvolvido utilizando uma stack moderna e eficiente para criar uma API robusta e fácil de manter. Aqui estão as principais tecnologias e dependências utilizadas:

- **Java 17**: A versão mais recente e estável do Java, garantindo performance e suporte a novas funcionalidades da linguagem.
- **Spring Boot 3.3.2**: Framework poderoso que facilita o desenvolvimento de aplicações Java, oferecendo uma configuração mínima e integração com diversas tecnologias.
- **Spring Data JPA**: Abstração do banco de dados, facilitando o acesso e a manipulação de dados com o uso de repositórios e a integração com o JPA (Java Persistence API).
- **H2 Database**: Banco de dados em memória, ideal para desenvolvimento e testes rápidos, sem a necessidade de configurar um banco de dados externo.
- **Spring Web**: Módulo do Spring Boot que facilita a criação de APIs RESTful, com suporte completo a padrões de mercado.
- **Springdoc OpenAPI (Swagger 3.0)**: Ferramenta para geração automática de documentação da API, permitindo que os desenvolvedores entendam e testem os endpoints de forma interativa.
- **Maven**: Ferramenta de build e gerenciamento de dependências, essencial para garantir que todas as bibliotecas e plugins estejam atualizados e configurados corretamente.

## **Dicas Úteis**

- **Leia o arquivo pom.xml**: É fundamental entender as dependências e versões utilizadas no seu projeto. O arquivo pom.xml gerencia essas dependências e configurações do Maven, sendo o coração da sua aplicação em termos de build e integração.
- **Verifique a versão do Java na sua IDE**: Caso esteja configurado em sua IDE uma versão anterior ao JDK 17, faça o download da JDK 17 (ou superior) em: <https://www.oracle.com/java/technologies/downloads/#jdk17-windows>

... instale-o e mude para a JDK 17(ou superior) na sua IDE.

Caso a JDK de sua IDE seja a 17 ou superior, o projeto deve compilar e rodar sem problemas.

## **Arquitetura e Padrões**

Neste projeto, implementamos uma API CRUD para gerenciamento de usuários. Para manter o código organizado e de fácil manutenção, seguimos os padrões:

- **Controller**: Responsável por lidar com as requisições HTTP. Aqui, definimos os endpoints da API e delegamos a lógica para as camadas adequadas.
- **Service**: Contém a lógica de negócio. O Service faz a ponte entre o Controller e o Repository, garantindo que todas as regras de negócio sejam aplicadas corretamente.
- **Repository**: Cuida da comunicação com o banco de dados. Utilizando o Spring Data JPA, essa camada facilita as operações de persistência de dados.

## **Objetivos do Projeto**

Os principais objetivos deste projeto, juntamente com a monitoria, são:

- **Fornecer uma base** para quem quer começar a trabalhar com APIs e microserviços em Java e Spring Boot.
- **Demonstrar a importância de seguir padrões de mercado**, como **REST** (incluindo o uso correto de códigos de status HTTP, verbos HTTP e nomenclatura de APIs), a **documentação com OpenAPI 3.0**, e a **correta utilização de logs**.

# **Documentação OpenAPI (Swagger):**
 - http://localhost:8080/swagger-ui/index.html#/

# ** - H2 DB:**
http://localhost:8080/h2-console/
JDBC URL: jdbc:h2:mem:testdb
User Name: as
password: password

Espero que este projeto possa servir como uma porta de entrada para sua jornada no desenvolvimento de APIs e microserviços!

## **Contato**

Se precisar de ajuda ou quiser trocar uma ideia, sinta-se à vontade para me contatar:

- [LinkedIn](https://www.linkedin.com/in/aws-cost-optimization-specialist/)
- [Instagram](https://www.instagram.com/levy.vianna/)