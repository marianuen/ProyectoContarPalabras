/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entornos46.Calculos;
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
        

    
    
   
}
