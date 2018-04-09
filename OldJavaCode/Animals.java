
public class Animals {
	private String name = "Animals";
	public String favfood = "food";
	public String sound= "animal";
	
	
	protected final void changeName( String thename){
		this.name=thename;
	}
	protected final void changesound(String sound){
		this.sound= sound;
	}
	
	protected final String getName(){
		return this.name;
	}
	
	public void eatStuff(){
		System.out.println("I love to eat "+ this.favfood);
	}
	
	public void animalsound(){
		System.out.println("The "+this.name+" says "+this.sound);
	}
	
	public Animals(){
		
	}
	
	public Animals(String name, String favfood, String sound){
		this.name= name;
		this.favfood= favfood;
		this.sound= sound;
	}
	
	
	public static void main(String[] args) {
		Animals Cat = new Animals();
		Cat.changeName("Dog");
		System.out.println(Cat.getName());
		System.out.println(Cat.favfood);
	}

}
