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

        System.out.println(Imprimir.textoCaracteresTotal(Calculos.contarCaracteresTotal(cadena)));
        System.out.println(Imprimir.textoNumeroPalabras(Calculos.contarNumeroPalabras(cadena)));
        System.out.println(Imprimir.textoTodosCaracteres(Calculos.contarTodosCaracteres(cadena)));
        
    }
    
    

    
}
