Feature: Home
  @Home
  Scenario: Home page é carregada corretaente
    Given O usuário acessa a página https://beta.coodesh.com/
    When A pagina for carregada
    Then A página carregada deve ter o título "Perfil grátis de desenvolvedor e acesso as vagas | Coodesh"
    And Deve ser apresentado o botão Ver vagas
    And Deve ser apresentado o botão Para Empresas
    And Deve ser apresentado o botão Blog
    And Deve ser apresentado o botão Login
    And Deve ser apresentado o botão Criar conta
