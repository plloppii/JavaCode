
public abstract class Crashable {
	
	int carStrength= 100;
	
	boolean Drivable= true; //changable, not constant.
	
	public void youCrashed(){
		this.Drivable = false;
	}
	
	public abstract void setCarStrength(int Strength);
	
	public abstract int getCarStrength();
	
}
