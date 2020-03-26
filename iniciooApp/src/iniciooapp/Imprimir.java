package iniciooapp;

public class Imprimir {

    public static String textoCaracteresTotal(int total) {

        return "Cantidad de caracteres: " + total;
    }

    public static String textoNumeroPalabras(int total) {

        return "Cantidad de palabras: " + total;
    }

    public static String textoTodosCaracteres(int[] contador) {
        String resultado = "";
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0 && IniciooApp.letras[i] != ' ') {
                resultado += "Cantidad de " + IniciooApp.letras[i] + ": " + contador[i] + "\n";
            }
        }
        return resultado;
    }

}
