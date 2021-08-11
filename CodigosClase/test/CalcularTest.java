/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Pruebas.Calculadora;
import Pruebas.Calcular;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Diego Iván Oliveros Acosta
 */
public class CalcularTest{
    @Test
     public void testSuma(){
         int resultado= Calcular.suma(2, 3);
         Calculadora a = new Calculadora();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
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
