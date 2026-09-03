# IA Dev Lab

Projeto desenvolvido como atividade prática sobre desenvolvimento de software assistido por inteligência artificial.

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Codex integrado ao IntelliJ

## Funcionalidades

- Exibição de uma mensagem de saudação.
- Verificação de palavras e frases palíndromas, ignorando maiúsculas, espaços e pontuação.
- Análise de texto com contagem de palavras, caracteres e vogais.

## Como executar

É necessário ter uma JDK instalada e configurada no ambiente.

Acesse a pasta `src` e execute os comandos abaixo:

```bash
cd src
javac Hello.java
java Hello
```

Para executar o exemplo de verificação de palíndromos:

```bash
javac PalindromoEficaz.java
java PalindromoEficaz
```

Para executar o exemplo de análise de texto:

```bash
javac AnaliseTexto.java
java AnaliseTexto
```

Para usar a API em outro programa, chame `AnaliseTexto.analisar(texto)` e obtenha
as contagens com `getPalavras()`, `getCaracteres()` e `getVogais()`.

## Estrutura do projeto

- `src/`: código-fonte do projeto.
- `tests/`: testes automatizados.
- `docs/`: documentação e decisões arquiteturais.
