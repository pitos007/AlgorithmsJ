/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author UPatryk
 */
public class SumIntegers { 
    public static void main(String[] args) { 
        sumArray(); 
        sumArrayStream(); 
        //quickCheck();
    } 
     

    public static void sumArray(){ 
        System.out.println("enter array size"); 
        Scanner in = new Scanner(System.in); 
        int size = in.nextInt(); 
        int[] intArray = new int[size]; 
        for (int i = 0; i < size; i++) { 
            System.out.println("enter int " + (size - i) + " left"); 
            intArray[i] = in.nextInt(); 
        } 
        in.close(); 
        System.out.println("array full"); 


        int total = 0; 
        for (int i : intArray) { 
            total += i; 
        } 
        System.out.println(total); 
    } 
     

    public static void sumArrayStream(){ 
        System.out.println("enter array size"); 
        Scanner in = new Scanner(System.in); 
        int size = in.nextInt(); 
        int[] intArray = new int[size]; 
        for (int i = 0; i < size; i++) { 
            System.out.println("enter int " + (size - i) + " left"); 
            intArray[i] = in.nextInt(); 
        } 

        in.close(); 
        System.out.println("array full"); 
         

        int sum1 = IntStream.of(intArray).sum(); 
        int sum2 = Arrays.stream(intArray).sum(); 
        System.out.println("sum1: " + sum1); 
        System.out.println("sum2: " + sum2); 
    }
    
    public static void quickCheck(){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String str = in.nextLine();
        
        System.out.println(i);
        System.out.println(d);
        System.out.println("you entered text: " + str);
        
        
        int i2 = 0;
        double d2 = 0.0;
        try {
            i2 = Integer.parseInt(in.nextLine());
            d2 = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String s2 = in.nextLine();
        
        System.out.println(i2);
        System.out.println(s2);
    }
} 
