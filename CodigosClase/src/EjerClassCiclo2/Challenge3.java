/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerClassCiclo2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Challenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una palabra: ");
        String s = sc.nextLine();
        Challenge3 ch = new Challenge3();
        System.out.println(ch.validar(s));
    }

    public boolean validar(String s) {
        s = s.replace(" ", "");
        System.out.println(s);
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) != s.charAt(s.length() - 1 - x)) {
                System.err.println(x);
                return false;
            }
        }
        return true;
    }
}
