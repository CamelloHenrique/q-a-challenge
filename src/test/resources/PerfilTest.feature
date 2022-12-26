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
    And ele informar que a carreira desejada é a de QA/Testes
    And Possue a habilidade "cucumber"
    And Seu whatsapp é "31989650256"
    And Reside na cidade de "Mariana"
    And Tem preferencia por trabalho "hibrido"
    And clicar em Próximo
    And Informar interese em "Saúde"
    And Sua Raça
    And Sua identidade de gênero
    And Sua orientação sexual
    And Clicar em Próximo
    And Clicar em Responder Agora
    And informar seu grau de conhecimento em cada habilidade como na tabela abaixo e em seguida clicar em próximo
      | Habilidade                   | Nível      |
      | Metodologias ágeis / Scrum   | BÁSICO     |
      | Análise e Modelagem de dados | BÁSICO     |
      | Estrutura de Dados           | BÁSICO     |
      | UML                          | BÁSICO     |
      | GIT                          | BÁSICO     |
      | Comunicação Técnica          | PRATICANTE |
      | Gestão de Tempo              | PRATICANTE |
      | Lógica                       | PRATICANTE |
      | Testes exploratórios         | PRATICANTE |
      | Caso de uso                  | PRATICANTE |
    And informar seu grau de conhecimento em cada habilidade como na tabela abaixo e em seguida clicar em Enviar
      | Habilidade                   | Nível      |
      | Behaviour Driven Development | PRATICANTE |
      | Test Driven Development      | AVANÇADO   |
      | Unit Tests                   | AVANÇADO   |
      | Test Coverage                | AVANÇADO   |
      | Automação de Testes          | AVANÇADO   |
      | Planejamento de Testes       | PRATICANTE |
      | Análise de requisitos        | PRATICANTE |
      | Cucumber                     | PRATICANTE |
    Then O usuário deverá ser redireicionado para a página "https://beta.coodesh.com/onboarding/developer/curriculum"
    And Deverá ser apresentado os dados, abaixo listados, referentes ao usuário logado
      | Nome completo  |
      | Cidade         |
      | Carreiras      |
      | Email          |
      | Whatsapp       |
      | Causas sociais |
    And as habilidades abaixo listada com seu nivel de conhecimento
      | Habilidade                   | Nível      |
      | Metodologias Ágeis / Scrum   | BÁSICO     |
      | Análise e Modelagem de dados | BÁSICO     |
      | Estrutura de Dados           | BÁSICO     |
      | UML                          | BÁSICO     |
      | GIT                          | BÁSICO     |
      | Comunicação Técnica          | PRATICANTE |
      | Gestão de Tempo              | PRATICANTE |
      | Lógica                       | PRATICANTE |
      | Testes exploratórios         | PRATICANTE |
      | Caso de uso                  | PRATICANTE |
      | Behaviour Driven Development | PRATICANTE |
      | Test Driven Development      | AVANÇADO   |
      | Unit Tests                   | AVANÇADO   |
      | Test Coverage                | AVANÇADO   |
      | Automação de Testes          | AVANÇADO   |
      | Planejamento de Testes       | PRATICANTE |
      | Análise de requisitos        | PRATICANTE |
      | Cucumber                     | PRATICANTE |
          |



  #@ValidarCurriculum
  #Scenario: Validar Curriculum
  #  Given O usuário acessar a página "https://beta.coodesh.com/onboarding/developer/curriculum"
  #  When A página for carregada
  #  Then Deve ser apresentado o email do