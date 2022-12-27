# Q.A. Challenge 20211029

Trabalho desenvolvido por Henrique Cota Camello, almejando uma vaga como analista de teste na empresa Prime Results
### Antes de começar
 
Para executar a aplicação, basta clonar o repositório https://github.com/CamelloHenrique/q-a-challenge.git e importar o pom.xml como maven project.
## Apresentação

Para ter acesso à apresentação, acesse https://docs.google.com/presentation/d/1w28kBcDyafhGLs8js540gwhRjVXQiYI8pMXi4CaLSeA/edit?usp=sharing

## Escolha do Frawework

- Cucumber
- Selenium

Utilizei cucumber e selenium, pois eram as ferramentas que tenho mais conhecimento, pelo prazo de emtrega,
seria arriscado utilizar uma tecnologia nova. Cypress eu já vi tutoriais, mas ainda não
trabalhei com ele. Robot Framework tenho pouco conhecimento para opnar.

## Mãos à Obra

Em 5 dias de trabalho, eu tive apróximadamente 23h de dedicação.
- Inicialmente, estruturei o projeto para trabalhar com o padrão page objects.
- As classes referentes a cada página, foram criadas antes dos arquivos que descrevem os cenários. Isso quebra um pouco a prática do BDD, mas foi importante, pois durante a criação das features, o código foi revisado.

## Problemas e limitações
- Durante a criação do perfil, a inserção do interesse social, não tem constância na seleção. A implementação deveria permitir que o teste informasse qual item seria selecionado.
- Após o preenchimento do scorecard, quase sempre a aplicação é direcionada para o “Curriculum”, mas às vezes, é direcionado para uma página que agradece pelo preenchimento do scorecard. A solução para esse caso é verificar nos requisitos do sistema, qual seria a página correta que deveria ser exibida, e então reportar esse defeito na aplicação.

