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

	//O(log[n])
	public void binarySearch(int numberlook){
		startTime = System.currentTimeMillis();
		
		int min=0;
		int max= itemsInArray;
		int mid =0;
		boolean found= false;
		int timesthrough =0;

		while(!found){
			mid= (min+max)/2;
			if(numberlook>theArray[mid]){
				min=mid;
			}
			else if(numberlook<theArray[mid]){
				max=mid;
			}
			else{
				System.out.println("Number Found! Index: "+ mid);
				found = true;
			}
			timesthrough++;
		}
		endTime = System.currentTimeMillis();
		System.out.println("Binary search took: " + (endTime-startTime)+" ms");
		System.out.println("Times through: "+timesthrough);

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

	//O(NLOG(N))
	//comparisons = log n + log n-1 + ... + log(1) = n log n
	public void quicksort(int left , int right){
		if(right - left <= 0){
			return;
		}
		else{
			int pivot = theArray[right];
			int pivotLocation = partitionArray(left,right,pivot);
			quicksort(left, pivotLocation-1);
			quicksort(pivotLocation+1,right);
		}
	}


	public int partitionArray(int left,int right, int pivot){
		int leftPointer = left-1;
		int rightPointer = right;

		while(true){
			while(theArray[++leftPointer]<pivot);

			while(rightPointer > 0 && theArray[--rightPointer]>pivot);

			if(leftPointer >= rightPointer){
				break;
			}
			else{
				swapValues(leftPointer,rightPointer);
			}
		}
		swapValues(leftPointer,right);

		return leftPointer;
	}





	//O(N^2) 
	public void bubblesort(){
		startTime = System.currentTimeMillis();
		for (int i= arraysize-1; i>1;i--){
			for(int j=0;j<i;j++){
				if(theArray[j]> theArray[j+1]){
					swapValues(j,j+1);
				}
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Bubble sort took: " + (endTime-startTime)+" ms");
	}

	//fills in array with numbers
	public void generateArray(){
		for(int i=0;i<theArray.length;i++){
			theArray[i] = (int) (Math.random() * 1000)+10;
		}
		itemsInArray = arraysize-1;
	}

	public void swapValues(int a, int b){
		int temp = theArray[a];
		theArray[a]= theArray[b];
		theArray[b]= temp;
	}

	//Constructor
	public BigONotation(int size){
		arraysize = size;
		theArray = new int[size];
	}


	public static void main(String[] args){
		BigONotation test = new BigONotation(20000);
		test.generateArray();
		//System.out.println(Arrays.toString(test.theArray));


		//BigONotation test1 = new BigONotation(3000000);
		//test1.generateArray();

		//BigONotation test2 = new BigONotation(4000000);
		//test2.generateArray();
		startTime = System.currentTimeMillis();
		test.quicksort(0,test.theArray.length-1);
		endTime = System.currentTimeMillis();
		System.out.println("Quicksort took: " + (endTime-startTime)+" ms");


		//test.binarySearch(20);

		//System.out.println(Arrays.toString(test.theArray));
	}

}