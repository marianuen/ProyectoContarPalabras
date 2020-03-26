package entornos46;

import static entornos46.Entornos46.letras;

/**
 * Se encarga exclusivamente de imprimir la información obtenida en la clase
 * "Calculos"
 * 
 * @author maria
 */
public class Imprimir {
    
    /**
     * Se encarga de imprimir la cantidad final de caracteres
     * 
     * @param total es la cantidad final de caracteres que contendrá la frase
     * que insertará el usuario.
     * @return la variable total (numero final de caracteres)
     */
    public static String textoCaracteresTotal (int total){
        
        return "Cantidad de caracteres: " + total;
    }
    
    /**
     * Se encarga de imprimir la cantidad final de palabras
     * 
     * @param total es la cantidad final de palabras que contendrá la frase que
     * insertará el usuario.
     * @return total (numero final de palabras)
     */
    public static String textoNumeroPalabras (int total){
        
        return "Cantidad de palabras: " + total;
    }
    
    /**
     * Se encarga de imprimir las letras que aparecen en la frase que inserta el 
     * usuario, y el número de veces que aparecen dichas letras.
     * 
     * @param contador es el array que cuenta el número de veces que aparece cada 
     * letra en la frase que insertará el usuario.
     * @return las letras que aparecen, y el número de veces que se repiten.
     */
    public static String textoTodosCaracteres (int[] contador){
        String resultado = "";
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0 && letras[i] != ' ') {
                resultado += "Cantidad de " + letras[i] + ": " + contador[i] + "\n";
            }
        }
        return resultado;
    }
}
