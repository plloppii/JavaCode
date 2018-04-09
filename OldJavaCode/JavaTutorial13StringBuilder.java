import java.util.Arrays;

public class JavaTutorial13StringBuilder{
	public static void main(String[] args){
		String randomString= "I am a penis";
		
		String gotToQuote = "He said, \"I'm here\"";
		// \n new line
		// \b backspace
		// \\ backslash
		
		System.out.println(randomString + " "+ gotToQuote);
		
		String upper = "BIG";
		String lower = "big";
		System.out.println(upper.equals(lower));
		System.out.println(upper.equalsIgnoreCase(lower));
		
		
		System.out.println(upper.charAt(2));
		System.out.println(upper.contains("B"));
		System.out.println(upper.endsWith("B"));
		System.out.println(upper.indexOf("B"));
		System.out.println(upper.length());
		
		String[] bigArray = upper.split("");
		
		System.out.println(Arrays.toString(bigArray));
		
		char[] bigcharArray = upper.toCharArray();
		
		System.out.println(Arrays.toString(bigcharArray));
		
		System.out.println(upper.substring(0,2));
		
		String letters = "        abcdefghijklmnopqrstuvwxyz         ";
		
		letters = letters.trim();
		letters = letters.toUpperCase();
		
		
		System.out.println(letters);
		
		//String does not replace the memory. It repeatidly uses new memory 
		//Thus, use String Builder
		
		StringBuilder randSB= new StringBuilder("Hello World!");
		System.out.println(randSB.append("Fuck you"));
		
		System.out.println(randSB);// original is same
		
		System.out.println(randSB.delete(3,5));
		
		System.out.println(randSB.capacity());
		
		
		
		
		
	}
}