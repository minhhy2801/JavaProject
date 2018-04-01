/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Using Two Arrays save information Fullname and mark of Student 
package javaapplication14;

import java.util.*;
import java.util.Scanner;
 
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();
        int[] array = new int[numofstudents];
        String[] names = null;
        for(int i = 0; i < numofstudents; i++) {
            System.out.print("Enter the student's name: ");
            names[i] = input.nextLine();
            System.out.println("Enter the student's score: ");
            array[i] = input.nextInt();
        }
        selectionSort(names, array);
        System.out.println(Arrays.toString(names));
    }
    public static void selectionSort(String[] names, int[] array) {
        for(int i = array.length - 1; i >= 1; i--) {
            String temp;
            int currentMax = array[0];
            int currentMaxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if (currentMax > array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }       
                if (currentMaxIndex != i) {
                    temp = names[currentMaxIndex];
                    names[currentMaxIndex] = names[i];
                    names[i] = temp;
                    array[currentMaxIndex] = array[i];
                    array[i] = currentMax;
                }
        }       
    }
}



