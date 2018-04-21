import java.util.Scanner;

public class JavaTutorial5FieldsMethods {
	
	static int correctnum;
	static int max;
	static int min;

	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] arg){
		String start = "y";
		System.out.println("Do you want to play a guessing game? (y/n) ");
		start= userInput.next();
		
		while(start.equalsIgnoreCase("y")){
			int guessnum=0;
			int turn=1;
			int correctness=0;	
			max=1000;
			min=0;
			System.out.println("Lets play a game! You need to guess a number from 1-1000");
			System.out.println("Try to guess the number in the least number of tries.");
			System.out.println("Everytime you guess a wrong number, the possible guess will strink");
			correctnum = getrandomnum();
			
			while (correctness==0)
				{
				System.out.print("Guess a number between "+min+" and "+max+": ");
				guessnum= userInput.nextInt();
				correctness= checknum(guessnum);
				if (correctness==-1){
					correctness=0;
					continue;
				}
				turn++;
				}		
			System.out.println("Congrats you won! # of tries: " +turn);
			System.out.println("Do you want to play again? (y/n)");
			start= userInput.next();
			
		}
	}
	
	
	public static int getrandomnum(){
		int randomnumber= (int) (Math.random() * 1001);
		return randomnumber;
	}
	
	public static int checknum(int a){
		if (a==correctnum){
			return 1;
		}
		else if (a<correctnum && min<=a){
			min=a;
			return 0;
		}
		else if (a>correctnum && max>=a){
			max=a;
			return 0;
		}
		else{
			System.out.println("Out of range!");
			return -1;
		}
	}
	
}