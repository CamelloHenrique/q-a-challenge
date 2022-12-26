Feature: Buscar por vagas de emprego
  @Vagas
  Scenario: Busca por um nome de empresa
    Given O usuário acesse a página "https://beta.coodesh.com/vagas"
    When Ele buscar por "Big Bang Theory"
    Then Deverá ser apresentado as vagas abaixo
    | Frontend Vue.js Sr  |
    | Fullstack Developer |
    | DevOps              |