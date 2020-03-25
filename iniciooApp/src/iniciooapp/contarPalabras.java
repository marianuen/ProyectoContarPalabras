/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciooapp;

import static iniciooapp.IniciooApp.letras;

/**
 *
 * @author maria
 */
public class contarPalabras {

    public static int contarCaracteresTotal(String cadena) {
        //devuelve el número total de caracteres dada una determinada cadena
        int cantidadCaracteres = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                cantidadCaracteres++;
            }
        }
        return cantidadCaracteres;
    }

    static int contarNumeroPalabras(String cadena) {
        //cuenta el número de palabras introducido
        int cantidadPalabras = 1;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ' && cadena.charAt(i - 1) != ' ') {
                cantidadPalabras++;
            }
        }
        return cantidadPalabras;

    }

    static int[] contarTodosCaracteres(String cadena) {
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
