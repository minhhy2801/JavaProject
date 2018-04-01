/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Input an integer n, the program will show the first n primes 
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex1 {

public static void main(String[]args)
    {
        int count = 0, max_count = 100, i;
        System.out.println("First "+max_count+" Prime Numbers:");

        for(int num=1; count<max_count; num++)
        {
            for(i=2; num%i != 0; i++);

            if(i == num)
            {
                System.out.print(" "+num);
                count++;
            }
        }
    }
}
    
    
    
    
  
