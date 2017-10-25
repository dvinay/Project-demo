package com.apex.sample;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new CalculatorImpl();
    	Scanner input = new Scanner(System.in);
    	System.out.println( "enter two numbers sep with space" );
    	int a = input.nextInt();
    	int b = input.nextInt();
    	int c = calculator.sum(a,b);
        System.out.println( "Sum of a : "+ a + " and b :"+ b + " is ="+ c );
        input.close();
    }
}
