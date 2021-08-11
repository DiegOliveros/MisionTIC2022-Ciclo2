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
public class CalcularATest {
    
    public CalcularATest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalcularA.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CalcularA.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea method, of class CalcularA.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        int[][] matriz = null;
        int expResult = 0;
        int result = CalcularA.calcularArea(matriz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea2 method, of class CalcularA.
     */
    @Test
    public void testCalcularArea2_int() {
        System.out.println("calcularArea2");
        int intera = 0;
        int expResult = 0;
        int result = CalcularA.calcularArea2(intera);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea2 method, of class CalcularA.
     */
    @Test
    public void testCalcularArea2_intArrArr() {
        System.out.println("calcularArea2");
        int[][] mat = null;
        int expResult = 0;
        int result = CalcularA.calcularArea2(mat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matriz method, of class CalcularA.
     */
    @Test
    public void testMatriz() {
        System.out.println("matriz");
        int[][] expResult = null;
        int[][] result = CalcularA.matriz();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of matriznext method, of class CalcularA.
     */
    @Test
    public void testMatriznext() {
        System.out.println("matriznext");
        int[][] mat = null;
        int[][] expResult = null;
        int[][] result = CalcularA.matriznext(mat);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
