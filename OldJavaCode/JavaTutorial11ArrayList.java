import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaTutorial11ArrayList{
	
	public static void main(String[] args){
		
		ArrayList arrayListOne = new ArrayList(); //accept any type of data
		
		ArrayList<String> names =  new ArrayList<String>(); //only accept Strings
		
		names.add("John Smith");
		names.add("Penis Dick");
		names.add("Brian Polo");
		
		names.set(0,"Smith John you dumbass");
		
		names.remove(2);
		
		for(int i=0; i< names.size();i++){
			System.out.println(names.get(i));
		}
		
		System.out.println(names);
		
		//advanced forloop
		for(String i :names){
			System.out.println(i);
		}
		
		
		//Iterators
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext()){ //prints out until nothing left
			System.out.println(indivItems.next());
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		String paulYoung = "Paul young";
		names.add(paulYoung);
		
		if(names.contains(paulYoung)){
			System.out.println("Paul is here");
		}
		
		if (names.containsAll(nameCopy)){
			System.out.println("Everything matches");
		}
		
		names.clear();
		
		if(names.isEmpty()){
			System.out.println("empty");
		}
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
	}
}