package Semana5;

import Semana5_6.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITOS
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("esta es la prueba main");
        String[] args = null;
       // Calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("esta es la prueba sumar");
        double a =5;
        double b =7;
        Calculadora instance = new Calculadora();
        double expResult = 12;
        double result = instance.sumar(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("esta es la prueba restar");
        double a = 5;
        double b = 7;
        Calculadora instance = new Calculadora();
        double expResult = -2.0;
        double result = instance.restar(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double a = 5;
        double b = 7.0;
        Calculadora instance = new Calculadora();
        for(int i =0; i<10;i++){
        double expResult = a*b*i;
        double result = instance.multiplicar(a, instance.multiplicar(b,i));
        assertEquals(expResult, result, 0);
            System.out.println("Semana5.CalculadoraTest.testMultiplicar()");
            System.out.println(expResult +" ---> " + result);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
