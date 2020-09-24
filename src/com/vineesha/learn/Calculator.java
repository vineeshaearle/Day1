package com.vineesha.learn;
import java.util.Scanner;

public class Calculator {
     static int add(int a, int b){
         return  a+b ;
    }
     static int sub(int a, int b) {
         return a - b;
    }
    static int multiply(int a, int b) {
         return a *b;
        }
    static int div(int a, int b) {
        return a / b;
    }

    public static void main (String[] args){
         int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        a = sc.nextInt();
        System.out.println("Please enter second number");
        b = sc.nextInt();
         int addition=add(a,b);
         int subtraction=sub(a,b);
         int multiply=multiply(a,b);
         int div=div(a,b);

        System.out.println("Addition result is:"+addition);
        System.out.println("Subtraction result is:"+subtraction);
        System.out.println("Multiplication result is:"+multiply);
        System.out.println("Division result is:"+div);
    }
}
