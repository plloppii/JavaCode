
public class Vehicle extends Crashable implements Drivable, Cloneable{

	int numWheels= 2;
	double speed=100;
	String name= "Car";
	
	
	
	public int getWheel(){
		return this.numWheels;
	}
	
	public void setWheels(int numWheels){
		this.numWheels=numWheels;
	}
	
	public double getspeed(){
		return this.speed;
	}
	
	public void setSpeed(double speed){
		this.speed= speed;
	}
	
	public void setCarStrength(int strength){
		this.carStrength= strength;
	}
	public int getCarStrength() {
		return this.carStrength;
	}
	
	public String toString(){
		return "Name of the Vehicle: "+this.name;
	}

	public Vehicle (){
		
	}
	
	public Vehicle(String name){
		this.name= name;
	}
	public Vehicle(int wheels, double speed){
		this.numWheels=wheels;
		this.speed=speed;
	}
	
	public Object clone(){
		Vehicle car;
		try{
			car= (Vehicle) super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}
		return car;
	}
	
	public static void main(String[] args){
		Vehicle Rocket = new Vehicle(5,200.0);
		System.out.println(Rocket.speed);
		System.out.println(Rocket.numWheels);
		
		Rocket.setCarStrength(1000);
		System.out.println(Rocket.carStrength);
		
		
	}
}
