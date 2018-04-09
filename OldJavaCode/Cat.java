
public class Cat extends Animals{
	public String favToy = "Yarn"; //animals does not have access to this.
	
	
	public void playwith(){
		System.out.println(this.getName()+" plays with "+this.favToy);
	}
	
	public void eatStuff(){
		System.out.println("I love to devour "+this.favfood);
	}
	
	public Cat(){
		
	}
	
	public Cat(String name, String favfood, String sound, String favToy){
		super(name, favfood, sound);
		this.favToy= favToy;
	}
	
	public static void acceptAnimal(Animals randomanimal){
		System.out.println(randomanimal.getName());
		System.out.println(randomanimal.favfood);
		
		randomanimal.eatStuff(); //polymorphism can recognize that Tabby is a Cat. 
		//System.out.println(randomanimal.favToy); cannot recognize fields tho. need to cast
		System.out.println(((Cat)randomanimal).favToy);
		
		if (randomanimal instanceof Cat){
			System.out.println();
			System.out.println(randomanimal.getName() +" is a cat.");
		}
	}
	
	public static void main(String[] args){
		Animals Cat= new Animals();
		Cat.changeName("Cat");
		System.out.println(Cat.getName());
		
		Cat Tabby= new Cat("Nigel","tuna","Meow","Dildo");
		System.out.println(Tabby.getName());
		Tabby.eatStuff();
		System.out.println();
		
		acceptAnimal(Tabby);
		
	}
}
