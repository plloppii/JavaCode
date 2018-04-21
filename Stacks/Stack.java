import java.util.*;

public class Stack{
	private String[] stackArray;
	private int stacksize;

	private int topofstack = -1;//empty stack


	//Constructor
	public Stack(int size){
		stacksize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray,"-1");
	}

	public void push(String input){
		if(topofstack + 1 < stacksize){
			topofstack++;
			stackArray[topofstack]= input;
		}
		else {
			System.out.println("Sorry But the Stack is Full");
		}

		displayTheStack();

		System.out.println("PUSH "+input+" Was Added to the Stack.");

	}

	public void pushmany(String many){
		String[] nums = many.split(" ");
		for(int i = 0;i<nums.length;i++){
			this.push(nums[i]);
		}
	}

	public String pop(){
		if(topofstack>=0){
			displayTheStack();
			System.out.println("POP "+stackArray[topofstack]+" Was Removed From the Stack\n");
			stackArray[topofstack]="-1";
			return stackArray[topofstack--];
		}
		else{
			displayTheStack();
			System.out.println("Sorry But the Stack is Empty");
			return "-1";
		}

	}

	public String peek(){
		displayTheStack();
		System.out.println("PEEK "+stackArray[topofstack]+" Is at the Top of the Stack\n");

		return stackArray[topofstack];
	}

	public void popAll(){
		for(int i=topofstack;i>=0;i--){
			pop();
		}
	}


	public void displayTheStack(){
		for(int n=0;n<61;n++)System.out.print("-");
		System.out.println();

		for(int n=0; n<stacksize; n++){
			System.out.print("| ");
			System.out.format("%2s  ",n);
		}
		System.out.println("|");

		for(int n=0;n<61;n++)System.out.print("-");
		System.out.println();

		for(int n=0;n<stacksize;n++){
			if(stackArray[n].equals("-1")){
				System.out.print("|     ");
			}
			else{
				System.out.print(String.format("| %2s "+ " ", stackArray[n]));
			}
		}
		System.out.println("|");

		for(int n=0;n<61;n++)System.out.print("-");
		System.out.println();
	}

	public static void main(String[] args){
		Stack mystack = new Stack(10);
		mystack.push("18");
		mystack.push("20");

		//mystack.pushmany("9 2 3 4 1 3");

		//mystack.popAll();

		mystack.displayTheStack();




		//mystack.peek();
	}


}