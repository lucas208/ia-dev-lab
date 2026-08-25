# Comparação de Prompts

## Funcionalidade

A funcionalidade escolhida foi a verificação de palavras palíndromas em Java.

## Prompt fraco

> Crie em `src/` uma função em Java que receba uma palavra e verifique se ela é um palíndromo.

O resultado gerou a classe `Palindromo`, com a lógica de verificação básica. A implementação não incluiu uma forma direta de executar e validar a funcionalidade pelo terminal.

## Prompt eficaz

> Neste projeto Java simples, crie em `src/` uma classe chamada `PalindromoEficaz` com uma funcionalidade para verificar se uma palavra é um palíndromo. Siga o estilo simples do projeto. Por exemplo, `arara` deve retornar `true` e `Casa` deve retornar `false`. A verificação deve ignorar diferenças entre letras maiúsculas e minúsculas, não deve utilizar bibliotecas externas e o código deve ser simples e legível. Inclua um método `main` para permitir executar e validar a funcionalidade pelo terminal, demonstrando alguns exemplos, e explique brevemente o que foi implementado.

O resultado gerou uma implementação que considera letras maiúsculas e minúsculas e inclui um método `main` com exemplos para validação pelo terminal.

## Comparação

O prompt fraco gerou corretamente a lógica básica de verificação, mas não definiu critérios para casos específicos nem uma forma de validar a implementação. Já o prompt eficaz forneceu contexto, exemplos, restrições e uma forma de validação, resultando em uma implementação mais completa e adequada aos requisitos. A principal diferença observada foi que instruções mais específicas reduziram a necessidade de complementações posteriores e produziram um resultado diretamente testável.

## Modelos utilizados

O primeiro experimento foi realizado com o modelo GPT-5.6 Terra.

A comparação foi repetida com o modelo GPT-5.4 mini, de menor performance. Nesse caso, os resultados dos dois prompts foram semelhantes, pois o agente teve acesso aos arquivos já existentes no projeto e utilizou implementações anteriores como referência. Esse resultado também demonstrou que o contexto disponível para a ferramenta de IA pode influenciar significativamente a resposta gerada.