/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Iván Oliveros Acosta
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
     /**
     * Test of main method, of class Calculadora.
     */
   
    @Test 
    public void testResta(){
        int resultado = Calculadora.resta(5, 9);
        int esperado = -4;
        assertEquals(esperado, resultado);
    }
     @Test 
    public void testSuma(){
        int resultado = Calculadora.suma(5, 9);
        int esperado = 14;
        assertEquals(esperado, resultado);
    }
    
}
