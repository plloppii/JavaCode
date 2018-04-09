public class Monster{
	
	public final String TOMBSTONE = "Here Lies a Dead Monster";
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack(){
		return attack; //accessor methods
	}
	
	public int getMovement(){
		return movement;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int decreaseHealth){
		health -= decreaseHealth;
		if (health<0){
			alive = false;
		}
	}
	
	public void setHealth(double decrease){ //overloading, must take different attributes
		int intDecreaseHealth = (int) decrease;
		health -= intDecreaseHealth;
			if (health<0){
				alive = false;
			}
	}
	
	public Monster(int newHealth, int newAttack, int newMovement){ //constructor
		health= newHealth;
		attack= newAttack;
		movement= newMovement;
	}
	
	//Default Constructor
	public Monster(){}
	
	public static void main (String[] arg){
		Monster Frank = new Monster();
		System.out.println();
	}
	
}