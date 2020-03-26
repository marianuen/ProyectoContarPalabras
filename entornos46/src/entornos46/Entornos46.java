/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos46;

import java.util.Scanner;

/**
 * Es la clase principal. En este proyecto se pide una frase al usuario, y se
 * realizan diferentes conteos con esa misma frase (número de caracteres, número 
 * de palabras y cantidad de veces que se repite cada letra o símbolo)
 * 
 * @author maria
 */
public class Entornos46 {

    /**
     * Crea un objeto de la clase Scanner, que permite pedir datos al usuario.
     */
    public static Scanner sc = new Scanner(System.in);
    
    static char[] letras;

    /**
     * Contiene el main. Se encarga de pedir una frase al usuario, y de ejecutar
     * los diferentes métodos de las diferentes clases que contiene el proyecto.
     * @param args
     */
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
