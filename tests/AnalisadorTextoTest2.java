public class AnalisadorTextoTest2 {
    public static void main(String[] args) {
        testarTextoComum();
        testarFormatacaoEspacosEPontuacao();
        testarEntradasVazias();
        testarVogaisAcentuadas();

        System.out.println("AnalisadorTextoTest2: OK");
    }

    private static void testarTextoComum() {
        ResultadoAnaliseTexto2 resultado = AnalisadorTexto2.analisar("Java é simples");
        verificar(resultado, 3, 14, 5, "texto comum");
    }

    private static void testarFormatacaoEspacosEPontuacao() {
        ResultadoAnaliseTexto2 resultado = AnalisadorTexto2.analisar("Ola,   mundo!");
        verificar(resultado, 2, 13, 4, "espacos e pontuacao");
    }

    private static void testarEntradasVazias() {
        verificar(AnalisadorTexto2.analisar(""), 0, 0, 0, "texto vazio");
        verificar(AnalisadorTexto2.analisar("  \t\n"), 0, 4, 0, "texto com espacos");
        verificar(AnalisadorTexto2.analisar(null), 0, 0, 0, "texto nulo");
    }

    private static void testarVogaisAcentuadas() {
        ResultadoAnaliseTexto2 resultado = AnalisadorTexto2.analisar("Árvore e Útil");
        verificar(resultado, 3, 13, 6, "vogais acentuadas");
    }

    private static void verificar(
            ResultadoAnaliseTexto2 resultado,
            int palavras,
            int caracteres,
            int vogais,
            String cenario
    ) {
        if (resultado.getPalavras() != palavras
                || resultado.getCaracteres() != caracteres
                || resultado.getVogais() != vogais) {
            throw new AssertionError("Falha no cenario: " + cenario);
        }
    }
}
