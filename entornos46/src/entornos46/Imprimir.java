package entornos46;

import static entornos46.Entornos46.letras;

/**
 *
 * @author maria
 */
public class Imprimir {
    
        
    static String textoCaracteresTotal (int total){
        
        return "Cantidad de caracteres: " + total;
    }
    
    static String textoNumeroPalabras (int total){
        
        return "Cantidad de palabras: " + total;
    }
    
    static String textoTodosCaracteres (int[] contador){
        String resultado = "";
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0 && letras[i] != ' ') {
                resultado += "Cantidad de " + letras[i] + ": " + contador[i] + "\n";
            }
        }
        return resultado;
    }
}
