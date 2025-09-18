package Tution;

import java.util.Scanner;

public class Full 
{

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("entner the input");
    	
    	
    	/*
    	if(sc.hasNextInt() || sc.hasNextDouble())
    	{
    		System.out.println("given input is number");
    	}else
    	{
    		System.out.println("given input NOT is number");

    	}
   
   */
    	String input=sc.nextLine();
    	
    	if(input.matches("[a-zA-Z]+"))
    	{
    		System.out.println("given input is string");
    	}else
    	{
    		System.out.println("given input is not string");
    	}
    	
    	
    	
    }
    
}
