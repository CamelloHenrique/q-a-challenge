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
  @PreencherPerfil
  Scenario: Preencher perfil
    Given O usuário esteja na página "https://beta.coodesh.com/onboarding/developer/profile"
    When ele informar que a carreira desejada é a de QA/Testes
    And Possue a habilidade "cucumber"
    And Seu whatsapp é "31989650256"
    And Rezide na cidade de "Mariana"
    And Tem preferencia por trabalho "hibrido"
    And clicar em Próximo
    Then Deverá ser redirecionado para a página "https://beta.coodesh.com/onboarding/developer/personal"
  @PreencherPesoal
  Scenario: Preencher informações pessoais
    Given O usuário esteja na página "https://beta.coodesh.com/onboarding/developer/personal"
    When Ele clicar em próximo
    And Informar interese em "Saúde"
    And Que se identifica como "Pessoa Branca"
    And Tem identidade de gênero "Homem"
    And Tem orientação sexual "Heterosexual"
    And Clicar em Próximo
    Then Deverá ser redireicionado para a página "https://beta.coodesh.com/onboarding/developer/scorecard-intro"
  @PreencherScorecard
  Scenario: Preencher Scorecard
    Given O usuário esteja na página "https://beta.coodesh.com/onboarding/developer/scorecard-intro"
    When Ele clicar em "Responder Agora"
    And informar seu grau de conhecimento em cada habilidade como na tabela abaixo
    | Metodologias ágeis / Scrum   | BÁSICO     |
    | Análise e Modelagem de dados | BÁSICO     |
    | Estrutura de Dados           | BÁSICO     |
    | UML                          | BÁSICO     |
    | GIT                          | BÁSICO     |
    | Comunicação Técnica          | PRATICANTE |
    | Gestão de Tempo              | PRATICANTE |
    | Lógica                       | PRATICANTE |
    | Testes exploratórios         | PRATICANTE |
    And Clicar em Próximo
    And informar seu grau de conhecimento em cada habilidade como na tabela abaixo
    | Caso de uso                  | PRATICANTE |
    | Behaviour Driven Development | PRATICANTE |
    | Test Driven Development      | AVANÇADO   |
    | Unit Tests                   | AVANÇADO   |
    | Test Coverage                | AVANÇADO   |
    | Automação de Testes          | AVANÇADO   |
    | Planejamento de Testes       | PRATICANTE |
    | Análise de requisitos        | PRATICANTE |
    And clicar em Enviar
    Then Deverá ser redireicionado para a página "https://beta.coodesh.com/onboarding/developer/curriculum"
  @ValidarCurriculum
  Scenario: Validar Curriculum
    Given O usuário acessar a página "https://beta.coodesh.com/onboarding/developer/curriculum"
    When A página for carregada
    Then Deve ser apresentado o email do