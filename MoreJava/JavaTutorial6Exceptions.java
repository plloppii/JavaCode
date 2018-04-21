//java.lang.RunTimeException
//java.lang.Exception
//ArithmeticException
//ClassNotFoundException
//IllegalArgumentException
//IndexOutOfBoundsException
//InputMismatchException
//FileNotFoundException
//IOException e

import java.util.*;
import java.io.*;

public class JavaTutorial6Exceptions{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] arg){
		/* divideByZero(2);
		
		System.out.println("Tell me how old you are now");
		int age= checkage();
		if (age!= 0){
			System.out.println("You are a "+age+" year old moron");
		}*/
		//getafile("./somestuff.txt");
		
	}
	
	public static void getafile(String fileName) throws ClassNotFoundException{ //ignores this exception. lets main do the catching 
		try{
			FileInputStream file= new FileInputStream(fileName);
		}
		catch(FileNotFoundException e){
			System.out.println("Sorry cant find the file.");
		}
		catch(IOException e){
			System.out.println("Unknown IO Erorr");
		}
		catch(Exception e){
			System.out.println("Some error occured");
		}
		finally{ //always triggered
			System.out.println("");
		}
	}
	
	
	public static int checkage(){
		try{
			return userInput.nextInt();
		}
		catch(InputMismatchException e){
			userInput.next();
			System.out.println("Thats not possible.");
			return 0;
		}
	}
	
	public static void divideByZero(int a){
		try
		{
			System.out.println(a/0);
		}
		
		catch(ArithmeticException e){
			System.out.println("You suck dude, thats not allowed");
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
}