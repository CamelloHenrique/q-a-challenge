Feature: Criação de conta e preenchimento de perfil de pessoa candidata
  @CriaçãoDeConta
  Scenario: Criação de conta
    Given O usuário acessa a página do coodesh
    And Clique no botão Login
    And Clique no botão Cadastre-se
    When O usuário preencher os campos abaixo
    | NOME COMPLETO  |
    | EMAIL          |
    | SENHA          |
    And Aceitar os termos e condições
    And Clicar em inscreva-se
    Then O usuário deverá ser redirecionado para a página "https://beta.coodesh.com/onboarding/developer/profile"
    And A página deve conter os campos abaixo
    | NOME COMPLETO       |
    | QA TESTES           |
    | SUAS HABILIDADES    |
    | EXPERIENCIA GERAL   |
    | MOMENTO PROFICIONAL |
    | WHATSAPP            |
    | CIDADE              |
    | REMOTA              |
    | PRESENCIAL          |
    | HIBRIDA             |