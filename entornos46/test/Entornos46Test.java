/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entornos46.Calculos;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class Entornos46Test {

    @Test
    public void contarCaracteresTotalTest() {
        assertEquals(4, Calculos.contarCaracteresTotal("hola"));
        assertEquals(7, Calculos.contarCaracteresTotal("hola que"));
    }

    @Test
    public void contarNumeroPalabrasTest() {

        assertEquals(1, Calculos.contarNumeroPalabras("hola"));
        assertEquals(2, Calculos.contarNumeroPalabras("hola que"));
        assertEquals(2, Calculos.contarNumeroPalabras("hola  que"));

    }

    @Test
    public void contarTodosCaracteresTest() {

        int[] miArray = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertArrayEquals(miArray, Calculos.contarTodosCaracteres("hola"));

    }

}
