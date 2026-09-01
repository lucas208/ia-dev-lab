## Prompt inicial

Como usuário, quero verificar se uma palavra ou frase é um palíndromo e analisar um texto, para obter informações sobre seu conteúdo de forma simples.
Para a verificação de palíndromos, quero que diferenças entre letras maiúsculas e minúsculas e caracteres que não sejam letras sejam desconsiderados.
Para a análise de texto, quero obter a quantidade de palavras, caracteres e vogais presentes no texto informado, inclusive quando houver múltiplos espaços ou uma entrada vazia.

## Requisitos

### Verificação de palíndromos

- RF01: O sistema deve permitir verificar se uma palavra ou frase é um palíndromo.
- RF02: A verificação deve ignorar diferenças entre letras maiúsculas e minúsculas.
- RF03: A verificação deve desconsiderar caracteres que não sejam letras.
- RF04: O sistema deve tratar uma entrada nula ou vazia sem gerar erro.

### Análise de texto

- RF05: O sistema deve informar a quantidade de palavras presentes no texto.
- RF06: O sistema deve informar a quantidade de caracteres do texto.
- RF07: O sistema deve informar a quantidade de vogais presentes no texto.
- RF08: A contagem de palavras deve considerar múltiplos espaços entre as palavras como um único separador.
- RF09: A análise de um texto vazio deve retornar zero palavras, zero caracteres e zero vogais.

## Critérios de aceite

### CA01 — Palavra palíndroma

**Given** uma palavra contendo letras maiúsculas e minúsculas  
**When** o usuário solicitar a verificação  
**Then** o sistema deve informar que a palavra é um palíndromo quando as letras forem iguais desconsiderando a capitalização.

### CA02 — Frase palíndroma

**Given** a frase "A base do teto desaba"  
**When** o usuário solicitar a verificação  
**Then** o sistema deve informar que a frase é um palíndromo, desconsiderando espaços, maiúsculas e caracteres que não sejam letras.

### CA03 — Análise de texto

**Given** o texto "Java é simples"  
**When** o usuário solicitar a análise  
**Then** o sistema deve informar a quantidade de palavras, caracteres e vogais presentes no texto.

### CA04 — Entrada vazia (caso de borda)

**Given** uma entrada vazia  
**When** o usuário solicitar a análise do texto  
**Then** o sistema deve retornar zero palavras, zero caracteres e zero vogais sem gerar erro.


## Plano proposto: 

1. Revisar as classes atuais de palíndromo e escolher uma única classe de produção a evoluir, preservando os exemplos didáticos fora do escopo. 
2. Definir e registrar o contrato dos casos ambíguos: - null em palíndromo retorna false, mantendo o comportamento atual. - entrada vazia deve não lançar exceção; definir explicitamente se é ou não palíndromo. - texto null na análise deve ter um comportamento seguro, preferencialmente equivalente a texto vazio. - caracteres devem ser contados conforme recebidos, incluindo espaços e pontuação. - vogais devem incluir maiúsculas, minúsculas e formas acentuadas necessárias ao português. 
3. Criar uma classe simples para concentrar a análise textual e um objeto de resultado com os três valores: palavras, caracteres e vogais. 
4. Evoluir o método de palíndromo para percorrer a entrada pelas extremidades, ignorar caracteres não alfabéticos e comparar letras sem diferenciar capitalização. 
5. Garantir que a implementação de palíndromo trate null, string vazia, palavras, frases, espaços e pontuação sem erro. 
6. Implementar a contagem de caracteres usando o tamanho da entrada original. 
7. Implementar a contagem de palavras ignorando espaços excedentes e retornando zero para entrada vazia ou somente espaços. 
8. Implementar a contagem de vogais percorrendo o texto sem alterar sua contagem de caracteres. 
9. Criar testes automatizados, sem bibliotecas externas, para palíndromos: - palavra com capitalização variada (Ana); - frase do CA02 (A base do teto desaba); - frase com pontuação; - palavra não palíndroma; - entradas nula e vazia; - entrada composta apenas por caracteres não alfabéticos, conforme contrato definido. 
10. Criar testes para análise textual: - Java é simples, validando 3 palavras, 13 caracteres e 5 vogais; - múltiplos espaços entre palavras; - texto com pontuação, para confirmar a regra de caracteres; - entrada vazia e somente espaços; - entrada nula, conforme contrato definido. 
11. Compilar todas as classes de produção e testes com javac, executar os testes e corrigir eventuais falhas. 
12. Executar manualmente os exemplos principais pelo console e conferir que as mensagens usam somente caracteres ASCII, conforme as convenções do projeto. 
13. Atualizar o README apenas se a forma de executar as novas funcionalidades ou os testes precisar ser documentada.


## Plano revisado após análise:

O plano gerado pelo agente foi mantido em sua estrutura geral, pois apresentou uma sequência adequada de implementação, testes e validação. 
Foram ajustadas principalmente as decisões de contrato dos casos de borda, como entradas null e vazias, para evitar ambiguidades durante a implementação. 
Também foi removida a exigência de uma estrutura específica para o resultado da análise textual, permitindo que a solução técnica fosse definida durante a implementação.

1. Revisar as classes atuais de palíndromo e escolher uma única classe de produção a evoluir, preservando os exemplos didáticos existentes fora do escopo.

2. Definir os contratos dos casos de borda:
    - `null` no palíndromo retorna `false`.
    - entrada vazia no palíndromo retorna `true`.
    - texto `null` na análise deve ser tratado como texto vazio.
    - caracteres devem ser contados conforme recebidos, incluindo espaços e pontuação.
    - vogais devem considerar maiúsculas, minúsculas e formas acentuadas.

3. Implementar a funcionalidade de análise textual, retornando as quantidades de palavras, caracteres e vogais.

4. Evoluir a funcionalidade de palíndromo para ignorar caracteres que não sejam letras e comparar letras sem diferenciar maiúsculas e minúsculas.

5. Garantir que a funcionalidade de palíndromo trate `null`, string vazia, palavras, frases, espaços e pontuação sem erro.

6. Implementar a contagem de caracteres utilizando a entrada original.

7. Implementar a contagem de palavras ignorando espaços excedentes e retornando zero para entrada vazia, somente espaços ou `null`.

8. Implementar a contagem de vogais, incluindo letras acentuadas.

9. Criar testes automatizados, sem bibliotecas externas, para palíndromos:
    - palavra com capitalização variada (`Ana`);
    - frase do CA02 (`A base do teto desaba`);
    - frase com pontuação;
    - palavra não palíndroma;
    - entradas `null` e vazia;
    - entrada composta apenas por caracteres não alfabéticos.

10. Criar testes para análise textual:
    - `Java é simples`, validando 3 palavras, 13 caracteres e 5 vogais;
    - múltiplos espaços entre palavras;
    - texto com pontuação;
    - entrada vazia e somente espaços;
    - entrada `null`.

11. Compilar todas as classes de produção e testes com `javac`, executar os testes e corrigir eventuais falhas.

12. Executar manualmente os exemplos principais pelo console e verificar que as mensagens utilizam somente caracteres ASCII, conforme as convenções do projeto.

13. Atualizar o README apenas se a forma de executar as novas funcionalidades ou os testes precisar ser documentada.


## Ferramenta/abordagem utilizada

Foi utilizada a abordagem de especificação manual em Markdown, com apoio do Codex integrado ao IntelliJ IDEA para análise do escopo e geração do plano de tarefas.

A escolha pelo Markdown foi feita por ser uma abordagem simples, adequada ao tamanho do projeto e permitida pela atividade, evitando a necessidade de configurar ferramentas adicionais como OpenSpec ou SpecKit. 
O Codex foi utilizado como agente para analisar os requisitos, propor o plano de implementação e apoiar a execução das tarefas, enquanto as decisões sobre regras e casos de borda foram revisadas manualmente.