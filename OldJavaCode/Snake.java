import java.util.*;
//import org.apache.commons.lang3.ArrayUtils;

public class Snake{
	
	static String[][] board = new String[10][10];
	
	public static void buildboard(){
		for(int i=0; i<board.length;i++){
			for (int j = 0; j<board[i].length;j++){
				board[i][j]="   ";
			}
		}
	}
	
	public static void redrawboard(){
		System.out.print(" ");
		for(int i=0; i<board.length ; i++){System.out.print(" "+i+" ");}
		System.out.println();
		for (int i=0; i<board.length;i++){
			System.out.print(i);
			for (int j=0; j<board[i].length;j++){
				System.out.print(board[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		for(int i=0; i<32 ; i++){System.out.print("-");}
		System.out.println();
	}
	
	private boolean checkinrange(int x, int y) {
		if (x>(board.length-Snake.tail) || y>(board[0].length)-Snake.tail){
			return true;
		}
		else if (x<Snake.tail || y<Snake.tail){
			return true;
		}
		return false;
	}
	
	private boolean checkothersnakes(int x, int y){
		for(int i=0; i<Snake.tail;i++){
			if (board[x+i][y] != "   " || board[x][y+i] != "   "){
				return true;
			}
			else if (board[x-i][y] != "   "||board[x-i][y] != "   "){
				return true;
			}
		}
		return false;
	}
	

	private boolean alive = true;
	private int turn = 0;
	
	public String name= "Snake";
	public static int tail = 5;
	public int xposition;
	public int yposition;
	public String[] upleftrightdown = {"up","right","down","left"};
	public static String direction;
	
	public int gettail(){
		return tail;
	}
	public int getxposition(){
		return xposition;
	}
	public int getyposition(){
		return yposition;
	}
	public boolean getalive(){
		return alive;
	}
	public String getdirection(){
		return direction;
	}
	public void eaten(){
		tail++;
	}
	
	
	//Constructor
	public Snake (int newtail, String newname){
		this.tail= newtail;
		this.name = newname;
		
		String namechar= Character.toString(this.name.charAt(0));
		
		int maxXboard= board.length-1;
		int maxYboard= board[0].length-1;
		
		int randx = (int) (Math.random() *maxXboard);
		int randy = (int) (Math.random() *maxYboard);
		
		while (checkinrange(randx,randy)){
			randx = (int) (Math.random() *maxXboard);
			randy = (int) (Math.random() *maxYboard);
		}
		this.xposition = randx;
		this.yposition = randy;
		
		this.direction= this.upleftrightdown[(int) (Math.random()*4)];
		
		System.out.println(this.xposition + " "+ this.yposition);
		System.out.println(this.direction);

		board[this.xposition][this.yposition]= " "+namechar+" ";
		
		for (int i=1;i<this.tail;i++){
			if (this.direction=="up"){
				board[this.xposition+i][this.yposition]= " ^ ";
			}
			else if (this.direction == "right"){
				board[this.xposition][this.yposition-i]= " > ";
			}
			else if (this.direction == "down"){
				board[this.xposition-i][this.yposition]= " v ";
			}
			else if (this.direction == "left"){
				board[this.xposition][this.yposition+i]= " < ";
			}
		}
		
	}
	

	public static void main(String[] args){
		Snake.buildboard();
		//Snake.redrawboard();
		Snake Bill = new Snake(4,"Ass");

		
		Snake.redrawboard();
	}


	
}