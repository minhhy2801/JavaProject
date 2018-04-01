/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Input an integer n, the program will show multiplication table of n (Using String.format) 
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num, stt;
      System.out.println("Enter an integer to print it's multiplication table");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      System.out.println("Multiplication table of "+num+" is :-");
 
      for ( stt = 1 ; stt <= 10 ; stt++ )
         System.out.println(String.format(num+"*"+stt+" = "+(num*stt)));
    }
    
}
