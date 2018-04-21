import java.util.*;

public class SnakeGame{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args){
		System.out.println("Welcome to Battle Snakes.");
		System.out.println("Enter Player one's Snake's Name: ");
		String player1 = userInput.next();
		//System.out.println("Enter Player two's Snake's Name: ");
		//String player2 = userInput.next();
		
		
		Snake.buildboard();
		Snake P1 = new Snake(3,player1);
		//Snake P2 = new Snake(3,player2);
		
		Snake.redrawboard();
	}
}