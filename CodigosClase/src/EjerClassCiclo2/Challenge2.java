/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

import java.util.Scanner;

/**
 *
 * @author Diego Iván Oliveros Acosta
 */
public class Challenge2 {

    int year;

    //constructor 
    Challenge2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el año");
        this.year = sc.nextInt();
    }

    int validar() {
        if (this.year % 100 == 0) {
            return Math.round(year / 100);
        }
        return Math.round(year / 100) + 1;
    }

    public static void main(String[] args) {
        Challenge2 obj = new Challenge2();
        //obj.Challenge2();
        System.out.println(obj.validar());
    }
}
