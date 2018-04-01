/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Exercise 5- Create class Product have private name: String, private price: double, private color: String 
// Create three method: private computeVAT(), public inputProduct(), public printProduct() 
// Create constructor full field ,constructor 2 parameter name, price and constructor empty 
// Create at least 3 object, Using method created 
// Print with format table 
package ex5;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Product sp1 = new Product();
        Product sp2 = new Product("Den", 20000, "Red");
        Product sp3 = new Product("Tu Lanh", 9000000, "While");
        sp1.input();
        sp1.print();
        sp2.print();
        sp3.print();
    }
    
}
class Product{
    private String name;
    private double price;
    private String color;
    private double VAT(){
        this.price = this.price /100 * 110;
        return this.price;}
        Product(){
    }
    
    public void input(){
    int count = 0;
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scan.nextLine();
        System.out.print("Enter color: ");
        this.color = scan.nextLine();
    do{
        try{
            do{
            System.out.print("Enter price: ");
            this.price = scan.nextDouble();
            if(this.price <= 0)
                System.out.println("Error!!!");
            }while(this.price <= 0);
            count++;
        }
        catch(Exception e){
            System.out.println("Error!!!");
            scan.next();
        }
    }while(count == 0);
    }
    public void print(){
        this.price = VAT();
        System.out.printf("Name: %s\n" , this.name);
        System.out.printf("Price: %f\n",this.price);
        System.out.println("Color: " + this.color);
    }
    Product(String name, double price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
