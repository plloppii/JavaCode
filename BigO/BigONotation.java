import java.util.*;
import java.util.Arrays;

public class BigONotation {
	private  int[] theArray;
	private int arraysize=0;
	private int itemsInArray=0;
	static long startTime;
	static long endTime;



	//O(1)
	public void addItemToArray(int newitem){
		theArray[itemsInArray++]= newitem;
	}

	//O(N)
	public void linearsearch( int numberlook){
		startTime = System.currentTimeMillis();
		String found = "";
		for (int i=0; i<arraysize;i++){
			if(theArray[i]==numberlook){
				found += Integer.toString(i);
			}
		}
		if (found == ""){
			System.out.println("Number not found!");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Number of things searched: "+ arraysize);
		System.out.println("Linear search took: " + (endTime-startTime)+" ms");
	}

	//O(N^2)

	


	//fills in array with numbers
	public void generateArray(){
		for(int i=0;i<arraysize;i++){
			theArray[i] = (int) (Math.random() * 1000)+10;
		}
		itemsInArray = arraysize-1;
	}

	//Constructor
	public BigONotation(int size){
		arraysize = size;
		theArray = new int[size];
	}


	public static void main(String[] args){
		BigONotation test = new BigONotation(2000000);
		test.generateArray();

		BigONotation test1 = new BigONotation(3000000);
		test1.generateArray();

		BigONotation test2 = new BigONotation(4000000);
		test2.generateArray();

		test.linearsearch(20);
		test1.linearsearch(20);
		test2.linearsearch(20);


		//System.out.println(Arrays.toString(test.theArray));
	}

}