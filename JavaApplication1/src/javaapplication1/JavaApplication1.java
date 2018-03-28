/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f=1;
        Scanner in = new Scanner(System.in);
        int g = 1;
        int input;
        boolean a = false;
       
        System.out.println("input :");
        input = in.nextInt();
        System.out.print("1");
        System.out.print(" ");
    for (int i = 2; i <= input; i++) {
        System.out.print(f + " ");
        f = f + g;
        g = f - g;
    } 

    System.out.println();
    }

}
