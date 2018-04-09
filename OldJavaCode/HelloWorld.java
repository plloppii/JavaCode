
public class HelloWorld {
	private static int i;
	
	
	public static void main(String[] args) {
		double pivalue = 4.0;
		double j = 3.0;
		while (j<11000000)
		{
			pivalue= pivalue - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(pivalue);
		}
		System.out.println("Actual Value of Pi " + Math.PI);
	}
}