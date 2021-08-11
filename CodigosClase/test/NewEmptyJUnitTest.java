/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Pruebas.Calcular;
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
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("para empezar");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("para terminar");
    }
    
    @Before
    public void setUp() {
        System.out.println("Hola mundo");
    }
    
    @After
    public void tearDown() {
        System.out.println("Chao mundo");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void hello() {}
      @Test
     public void testSuma(){
         int resultado= Calcular.suma(2, 3);
         int esperado=5; //
         assertEquals(esperado, resultado);
     }
     @Test
       public void testResta(){
         int resultado= Calcular.resta(3, 2);
         int esperado=1; //
         assertEquals(esperado, resultado);
     }
}
