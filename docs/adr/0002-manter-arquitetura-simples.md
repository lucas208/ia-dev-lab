## Contexto

O projeto possui escopo reduzido e tem como objetivo implementar funcionalidades
de verificação de palíndromos e análise de texto. Atualmente, a aplicação possui
poucas classes de produção, concentradas em `src`, e testes automatizados
separados em `tests`.

Não foram identificadas necessidades de múltiplos serviços, módulos independentes
ou camadas adicionais de complexidade.

## Decisão

Manter a arquitetura simples e centralizada, sem introduzir novos módulos,
serviços ou camadas de abstração neste momento.

As classes de produção permanecem organizadas em `src`, enquanto os testes ficam
em `tests`, mantendo a separação entre código de produção e validação.

## Justificativa

A estrutura atual é proporcional ao tamanho e à complexidade do projeto.
Adicionar camadas ou módulos neste momento aumentaria o acoplamento estrutural e
a quantidade de código sem um benefício correspondente.

A abordagem também facilita a compreensão, manutenção e evolução da aplicação,
mantendo baixo o custo de desenvolvimento para um sistema pequeno.

Caso o escopo aumente futuramente, a arquitetura poderá ser revisada de acordo
com novas responsabilidades e necessidades do sistema.

## Consequências

- Menor complexidade estrutural.
- Facilidade de compreensão e manutenção.
- Menor quantidade de código e configurações.
- Não há separação em módulos ou serviços que possa ser necessária caso o sistema
  cresça significativamente.

## Observação

No momento, estou sem acesso ao agente de IA por limite de utilização. 
A decisão arquitetural poderá ser revisada posteriormente com apoio do agente, caso novas necessidades ou possibilidades de modularização sejam identificadas.