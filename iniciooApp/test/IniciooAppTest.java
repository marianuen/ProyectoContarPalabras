/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import iniciooapp.ContarPalabras;
import iniciooapp.Imprimir;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class IniciooAppTest {

    @Test
    public void contarCaracteresTotalTest() {

        assertEquals(2, ContarPalabras.contarCaracteresTotal("ko"));
        assertEquals(2, ContarPalabras.contarCaracteresTotal("k o"));

    }

    
}
