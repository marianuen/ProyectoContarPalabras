package entornos46;

import static entornos46.Entornos46.letras;


/**
 * Se encarga exclusivamente de realizar diferentes conteos con la frase
 * dada por el usuario
 * 
 * @author maria
 */
public class Calculos {
    
    /**
     * Cuenta los caracteres que tiene la frase
     * 
     * @param cadena es la frase que insertará el usuario
     * @return la cantidad total de caracteres que tiene la frase dada por el 
     * usuario
     */
    public static int contarCaracteresTotal(String cadena){
        //devuelve el número total de caracteres dada una determinada cadena
        int cantidadCaracteres = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                cantidadCaracteres++;
            }
        }
        return cantidadCaracteres;
    }
    
    /**
     * Cuenta el número de palabras que tiene la frase
     * 
     * @param cadena es la frase que insertará el usuario
     * @return la cantidad de palabras que tiene  la frase dada por el usuario
     */
    public static int contarNumeroPalabras(String cadena){
        //cuenta el número de palabras introducido
        int cantidadPalabras = 1;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ' && cadena.charAt(i - 1) != ' ') {
                cantidadPalabras++;
            }
        }
        return cantidadPalabras;
        
    }
    
    /**
     * Cuenta las veces que se repite cada letra en la frase
     * 
     * @param cadena es la frase que insertará el usuario
     * @return un contador, que contiene el numero de veces que aparece una letra
     * (o símbolo) en la frase que ha insertado el usuario. 
     */
    public static int[] contarTodosCaracteres(String cadena){
        //devuelve la cantidad de caracteres de cada tipo
        letras = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?',
            '¿', '!', '¡', ';', ':', '(', ')'};
        int[] contador = new int[37];
        for (int i = 0; i < cadena.length(); i++) {

            for (int j = 0; j < contador.length; j++) {
                if (cadena.charAt(i) == letras[j]) {
                    contador[j]++;
                }
            }
        }
        return contador;
        
    }
    
}
