public class Palindromo {
    public static boolean ehPalindromo(String palavra) {
        if (palavra == null) {
            return false;
        }

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }

            inicio++;
            fim--;
        }

        return true;
    }
}
