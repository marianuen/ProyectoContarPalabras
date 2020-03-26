/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos46;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Entornos46 {

    public static Scanner sc = new Scanner(System.in);
    
    static char[] letras;

    public static void main(String[] args) {

        System.out.println("------- Ejercicio cadena caracteres Array -------");

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String cadena = frase.toLowerCase();//frase pero en minúsculas.

        System.out.println(textoCaracteresTotal(Calculos.contarCaracteresTotal(cadena)));
        System.out.println(textoNumeroPalabras(Calculos.contarNumeroPalabras(cadena)));
        System.out.println(textoTodosCaracteres(Calculos.contarTodosCaracteres(cadena)));
        
    }
    
    
    
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
