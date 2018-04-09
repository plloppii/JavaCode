import java.util.Arrays;
import java.util.LinkedList;

public class JavaTutorial12LinkedList{
	
	public static void main(String[] args){
		
		LinkedList linkedlistone = new LinkedList();
		LinkedList<String> names = new LinkedList<String>();
		names.add("Noah Pan");
		names.add("Caitlyn Gardiner");
		names.add("Brian Park");
		names.add("Trevor Maxfield");
		names.add("John Alberta");
		names.add("Amanda Wang");
		names.add("Johnny Depth");
		
		names.addLast("Last Person");
		names.addFirst("First Person");
		
		names.add(1, "Second person");
		
		names.set(3, "Third Person");
		
		System.out.println(names.get(2));
		
		System.out.println(names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names); //makes a copy of list
		
		System.out.println(names);
		
		//names.contains("something")
		//names.containsAll(LinkedList);
		
		System.out.println(names.indexOf("Noah Pan"));
		
		System.out.println(names.size());
		
		System.out.println(names.peek());//returns null if item not in list
		
		System.out.println(nameCopy.poll()); //retrieves and deletes
		
		System.out.println(nameCopy.pollLast()); //pulls last and deletes
		
		nameCopy.push("Amanda Wang"); //pushes value to front
		nameCopy.pop(); //removes first value
		
		System.out.println(nameCopy);
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		
		
		
		
		
	}
}