/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entornos46.Calculos;
import entornos46.Imprimir;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class Entornos46Test {

    /**
     *  Realiza los test del método "contarCaracteresTotal", y para pasar por
     *  todas las ramas de ese método se prueba una frase con espacios y otra 
     *  sin ellos.
     */
    @Test
    public void contarCaracteresTotalTest() {
        assertEquals(4, Calculos.contarCaracteresTotal("hola"));
        assertEquals(7, Calculos.contarCaracteresTotal("hola que"));
    }

    /**
     *  Realiza los test del método "contarNumeroPalabras", y para pasar por
     *  todas las ramas de ese método se prueba una frase con espacios y otra 
     *  sin ellos, y otra con dos espacios seguidos.
     */
    @Test
    public void contarNumeroPalabrasTest() {

        assertEquals(1, Calculos.contarNumeroPalabras("hola"));
        assertEquals(2, Calculos.contarNumeroPalabras("hola que"));
        assertEquals(2, Calculos.contarNumeroPalabras("hola  que"));

    }

    /**
     * Realiza los test del método "contarTodosCaracteres", comparando un array
     * que contiene la cantidad de veces que se repite una letra y que se crea
     * en el mismo método, con un array que se encuentra en el 
     * método "contarTodosCaracteres".
     * 
     */
    @Test
    public void contarTodosCaracteresTest() {

        int[] miArray = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertArrayEquals(miArray, Calculos.contarTodosCaracteres("hola"));

    }

    /**
     * Realiza los test del método "textoCaracteresTotal", comparando un String
     * con la salida del método "textoCaracteresTotal" (que debe ser igual)
     */
    @Test
    public void textoCaracteresTotalTest() {

        assertEquals("Cantidad de caracteres: " + 2, Imprimir.textoCaracteresTotal(2));

    }
    
    /**
     * Realiza los test del método "textoNumeroPalabras", comparando un String
     * con la salida del método "textoNumeroPalabras" (que debe ser igual).
     */
    @Test
    public void textoNumeroPalabras() {

        assertEquals("Cantidad de palabras: " + 3, Imprimir.textoNumeroPalabras(3));

    }

}
