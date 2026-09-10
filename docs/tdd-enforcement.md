# Investigação de Enforcement de TDD — Superpowers

## Ferramenta escolhida

Superpowers.

## Objetivo

Investigar como uma ferramenta de workflow para agentes de IA pode conduzir e
reforçar a utilização de Test-Driven Development (TDD) durante a implementação
de funcionalidades.

## Funcionamento

O Superpowers é um framework composto por skills que orientam o agente durante
diferentes etapas do desenvolvimento. Entre essas skills existe a
`test-driven-development`, utilizada durante a implementação de novas
funcionalidades, correções e alterações de comportamento.

A skill de TDD estabelece como regra central:

> NO PRODUCTION CODE WITHOUT A FAILING TEST FIRST

O fluxo definido é Red-Green-Refactor:

1. RED — escrever um teste que represente o comportamento esperado;
2. verificar que o teste falha pelo motivo correto;
3. GREEN — implementar o código mínimo necessário para fazer o teste passar;
4. verificar que o teste passa;
5. REFACTOR — melhorar a implementação mantendo os testes passando;
6. repetir o ciclo para o próximo comportamento.

A documentação também determina que, caso código de produção seja escrito antes
do teste, ele deve ser removido e a implementação deve ser refeita a partir do
teste.

## Aplicação ao projeto

No projeto de palíndromos, o Superpowers poderia ser utilizado para implementar
uma alteração como uma nova regra de análise textual.

Por exemplo, o agente poderia primeiro criar um teste para o comportamento
esperado, executar o teste e confirmar sua falha. Somente depois disso seria
permitido implementar a funcionalidade mínima necessária para fazê-lo passar.

Após o teste passar, o agente poderia realizar o refatoramento e verificar
novamente se todos os testes continuam passando.

## Enforcement

O Superpowers não funciona apenas como uma instrução textual isolada para
"lembrar de fazer testes". A skill de TDD define um fluxo obrigatório para o
agente e estabelece condições explícitas para avançar entre as etapas.

Entre as regras estão:

- testes devem ser escritos antes do código de produção;
- o teste deve ser observado falhando antes da implementação;
- o código de produção deve ser o mínimo necessário para passar o teste;
- o teste deve ser executado novamente após a implementação;
- o refatoramento ocorre somente depois que o comportamento estiver validado;
- código escrito antes do teste deve ser descartado.

O projeto também utiliza outras skills de workflow, incluindo revisão de código,
execução de planos e desenvolvimento orientado por subagentes. A documentação
do Superpowers descreve esses workflows como obrigatórios quando uma skill
correspondente é aplicável.

## Instalação no cenário desta atividade

A instalação e execução do Superpowers não foram realizadas no projeto durante
esta atividade devido à indisponibilidade de acesso ao agente necessário.

A investigação foi realizada por meio da documentação oficial do projeto,
conforme permitido pela atividade quando a instalação não é possível.

## Limitações

Como a ferramenta não foi executada no projeto, não foi possível comprovar
empiricamente o comportamento do enforcement no código de palíndromos.

Portanto, esta investigação registra o funcionamento documentado e a forma como
o mecanismo poderia ser aplicado ao projeto, sem afirmar que um bloqueio real
foi executado nesta atividade.

## Aprendizado

A principal diferença observada em relação a uma simples instrução de prompt é
que o Superpowers estrutura o processo de desenvolvimento em workflows e skills.
No caso do TDD, ele estabelece explicitamente a ordem das etapas e condições de
verificação, reduzindo a possibilidade de o agente simplesmente implementar a
funcionalidade e adicionar os testes posteriormente.