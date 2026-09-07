public class AnalisadorTexto {
    public static ResultadoAnaliseTexto analisar(String texto) {
        if (texto == null) {
            texto = "";
        }

        int quantidadePalavras = contarPalavras(texto);
        int quantidadeCaracteres = texto.length();
        int quantidadeVogais = contarVogais(texto);

        return new ResultadoAnaliseTexto(
                quantidadePalavras,
                quantidadeCaracteres,
                quantidadeVogais
        );
    }

    private static int contarPalavras(String texto) {
        int quantidadePalavras = 0;
        boolean dentroDePalavra = false;

        for (int indice = 0; indice < texto.length(); indice++) {
            if (Character.isWhitespace(texto.charAt(indice))) {
                dentroDePalavra = false;
            } else if (!dentroDePalavra) {
                quantidadePalavras++;
                dentroDePalavra = true;
            }
        }

        return quantidadePalavras;
    }

    private static int contarVogais(String texto) {
        int quantidadeVogais = 0;

        for (int indice = 0; indice < texto.length(); indice++) {
            if (ehVogal(texto.charAt(indice))) {
                quantidadeVogais++;
            }
        }

        return quantidadeVogais;
    }

    private static boolean ehVogal(char caractere) {
        char letra = Character.toLowerCase(caractere);
        return "aeiouáàâãéêíóôõúü".indexOf(letra) >= 0;
    }
}
