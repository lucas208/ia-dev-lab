public class PalindromoEficazMini {
    public static boolean ehPalindromo(String palavra) {
        if (palavra == null) {
            return false;
        }

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            char letraInicio = Character.toLowerCase(palavra.charAt(inicio));
            char letraFim = Character.toLowerCase(palavra.charAt(fim));

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
