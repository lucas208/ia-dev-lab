# IA Dev Lab

Projeto desenvolvido como atividade prática sobre desenvolvimento de software assistido por inteligência artificial.

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Codex integrado ao IntelliJ

## Funcionalidades

- Exibição de uma mensagem de saudação.
- Verificação de palavras palíndromas.

- Verificacao de frases palindromas, ignorando capitalizacao e caracteres nao alfabeticos.
- Analise de palavras, caracteres e vogais em um texto.

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

## Como executar os testes

Na raiz do projeto, compile as classes de producao e os testes:

```bash
javac -d out src/*.java tests/*.java
```

Em seguida, execute os testes:

```bash
java -cp out PalindromoEficazTest
java -cp out AnalisadorTextoTest
```

## Estrutura do projeto

- `src/`: código-fonte do projeto.
- `tests/`: testes automatizados.
- `docs/`: documentação e decisões arquiteturais.
