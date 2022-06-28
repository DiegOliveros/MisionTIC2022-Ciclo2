package Semana3;

import Semana3.Circulo;

/**
 * Diego Iván Oliveros Acosta
 *
 * @scalapp.co ITOS 28/06/2022
 */
public class Main {

    public static void main(String args[]) {
        Circulo plato = new Circulo(10);
        System.out.println(plato.area());
        System.out.println(plato.perimetro(5));

        Barco pinta = new Barco();
        pinta.modeloVehiculo = 1980;
        String s0 = pinta.prenderMotor();
        String s1 = pinta.navegar();
        pinta.nombreVehiculo = "la pinta";
        String s2 = pinta.transportar();
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);

    }
}
