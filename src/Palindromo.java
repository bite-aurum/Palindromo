
public class Palindromo {

    // Wrapper que prepara la palabra e inicia la recursividad
    public static boolean esPalindromo(String palabra) {

        // Validar que la palabra no sea null
        if (palabra == null) {
            return false;
        }

        // Convierte a minusculas y eliminar espacios
        palabra = palabra.replace(" ", "").toLowerCase();

        // Iniciar la recursividad desde los extremos
        return esPalindromoRec(
                palabra, 0, palabra.length() - 1
        );
    }

    // Metodo recursivo
    private static boolean esPalindromoRec(
            String palabra, int izq, int der
    ) {

        // Caso base: llegamos al centro
        if (izq >= der) {
            return true;
        }

        // Si los extremos son diferentes no es palindromo
        if (palabra.charAt(izq) != palabra.charAt(der)) {
            return false;
        }

        // Continuar con la parte interior de la palabra
        return esPalindromoRec(palabra, izq + 1, der - 1
        );
    }

    // Metodo principal para probar el programa
    public static void main(String[] args) {

        /*
         * Resultados esperados:
         * radar Es palindromo
         * anna Es palindromo
         * casa No es palindromo
         * ""Es palindromo
         * a Es palindromo
         * Radar Es palindromo
         * anita lava la tina Es palindromo

         */

        String[] palabras = {"radar", "anna", "casa", "", "a", "Radar", "anita lava la tina"};

        for (String palabra : palabras) {

            if (esPalindromo(palabra)) {
                System.out.println("\"" + palabra + "\"  Es palindromo");
            } else {
                System.out.println("\"" + palabra + "\"  No es palindromo");
            }
        }


    }
}
