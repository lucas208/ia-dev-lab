public class AnalisadorTextoTest {
    public static void main(String[] args) {
        verificarTextoDoCriterioDeAceite();
        verificarMultiplosEspacos();
        verificarPontuacao();
        verificarEntradasVazias();
        System.out.println("AnalisadorTextoTest: OK");
    }

    private static void verificarTextoDoCriterioDeAceite() {
        ResultadoAnaliseTexto resultado = AnalisadorTexto.analisar("Java é simples");

        assertResultado(resultado, 3, 14, 5, "Texto do criterio de aceite");
    }

    private static void verificarMultiplosEspacos() {
        ResultadoAnaliseTexto resultado = AnalisadorTexto.analisar("um   dois");

        assertResultado(resultado, 2, 9, 3, "Multiplos espacos");
    }

    private static void verificarPontuacao() {
        ResultadoAnaliseTexto resultado = AnalisadorTexto.analisar("Ola, mundo!");

        assertResultado(resultado, 2, 11, 4, "Pontuacao");
    }

    private static void verificarEntradasVazias() {
        assertResultado(AnalisadorTexto.analisar(""), 0, 0, 0, "Texto vazio");
        assertResultado(AnalisadorTexto.analisar("   "), 0, 3, 0, "Somente espacos");
        assertResultado(AnalisadorTexto.analisar(null), 0, 0, 0, "Texto null");
    }

    private static void assertResultado(
        ResultadoAnaliseTexto resultado,
        int palavras,
        int caracteres,
        int vogais,
        String descricao
    ) {
        if (resultado.getQuantidadePalavras() != palavras
            || resultado.getQuantidadeCaracteres() != caracteres
            || resultado.getQuantidadeVogais() != vogais) {
            throw new AssertionError(descricao + " retornou valores inesperados");
        }
    }
}
