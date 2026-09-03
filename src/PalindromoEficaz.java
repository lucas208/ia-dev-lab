public class PalindromoEficaz {
    public static boolean ehPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            char caractereInicio = texto.charAt(inicio);
            char caractereFim = texto.charAt(fim);

            if (!Character.isLetter(caractereInicio)) {
                inicio++;
                continue;
            }

            if (!Character.isLetter(caractereFim)) {
                fim--;
                continue;
            }

            char letraInicio = Character.toLowerCase(caractereInicio);
            char letraFim = Character.toLowerCase(caractereFim);

            if (letraInicio != letraFim) {
                return false;
            }

            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("arara: " + ehPalindromo("arara"));
        System.out.println("Casa: " + ehPalindromo("Casa"));
        System.out.println("Ana: " + ehPalindromo("Ana"));
    }
}
