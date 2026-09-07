# IA Dev Lab

Projeto desenvolvido como atividade prática sobre desenvolvimento de software assistido por inteligência artificial.

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Codex integrado ao IntelliJ

## Funcionalidades

- Exibição de uma mensagem de saudação.
- Verificação de palavras palíndromas.

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

Para compilar e executar os testes da analise de texto a partir da raiz do projeto:

```bash
javac src/AnalisadorTexto.java src/ResultadoAnaliseTexto.java tests/AnalisadorTextoTest.java
java -cp "src;tests" AnalisadorTextoTest
```

## Estrutura do projeto

- `src/`: código-fonte do projeto.
- `tests/`: testes automatizados.
- `docs/`: documentação e decisões arquiteturais.
