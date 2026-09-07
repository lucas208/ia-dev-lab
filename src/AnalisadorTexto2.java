public class AnalisadorTexto2 {
    public static ResultadoAnaliseTexto2 analisar(String texto) {
        String entrada = texto == null ? "" : texto;

        return new ResultadoAnaliseTexto2(
                quantidadeDePalavras(entrada),
                entrada.length(),
                quantidadeDeVogais(entrada)
        );
    }

    private static int quantidadeDePalavras(String texto) {
        String textoSemEspacosNasExtremidades = texto.trim();

        if (textoSemEspacosNasExtremidades.isEmpty()) {
            return 0;
        }

        return textoSemEspacosNasExtremidades.split("\\s+").length;
    }

    private static int quantidadeDeVogais(String texto) {
        int total = 0;

        for (char caractere : texto.toCharArray()) {
            if (eVogal(caractere)) {
                total++;
            }
        }

        return total;
    }

    private static boolean eVogal(char caractere) {
        switch (Character.toLowerCase(caractere)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'á':
            case 'à':
            case 'â':
            case 'ã':
            case 'é':
            case 'ê':
            case 'í':
            case 'ó':
            case 'ô':
            case 'õ':
            case 'ú':
            case 'ü':
                return true;
            default:
                return false;
        }
    }
}
