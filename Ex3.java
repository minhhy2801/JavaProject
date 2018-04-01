/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Program menu: Array process 
// Function 1: Sort and print array 
// Function 2: Print min and max value in array 
// Function 3: Calculate and print out average of elements divided by 3 
package javaapplication15;

import java.util.Arrays;
import java.util.Scanner;
public class Ex3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many numbers: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        int sum = 0;
        int average = 0 ;
        System.out.print("Input number: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted numbers: ");
        show(arr);
        int max = getMax(arr);
        System.out.println("Maximum Value is: "+max);
        int min = getMin(arr);
        System.out.println("Minimum Value is: "+min);
        System.out.println("Average of nums: ");
        for (int i = 0; i < n; i++) {
        if (arr[i] % 3 == 0) {
            sum = sum + arr[i]; 
            System.out.print(sum);
        }
    }

    }
 
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
     public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}
