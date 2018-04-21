
public class JavaTutorial16ObjectClass {
	public static void main(String[] args){
		Object supercar= new Vehicle("McQueen");
		
		//System.out.println(supercar.getSpeed()); //does not work because super car is a Object
		System.out.println(((Vehicle)supercar).getspeed());
		
		Vehicle superTruck= new Vehicle();
		
		System.out.println(supercar.equals(superTruck));
		
		System.out.println(supercar.hashCode());
		
		System.out.println(supercar.getClass());
		
		System.out.println(supercar.getClass().getName());
		
		if(supercar.getClass() == superTruck.getClass()){
			System.out.println("These two are the same!");
		}
		System.out.println();
		System.out.println(supercar.getClass().getSuperclass());
		
		
		System.out.println(supercar.toString());
		int i=100;
		System.out.println(Integer.toString(i));
		
		//CLONING A OBJECT
		superTruck.setWheels(40);
		Vehicle supertruck2= (Vehicle) superTruck.clone();
		System.out.println(supertruck2.hashCode());
		System.out.println(superTruck.hashCode());
		
		
		
		
	}
}
