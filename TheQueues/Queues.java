import java.util.*;

public class Queues{

	private String[] queuearray;
	private int stacksize;
	private int rear = -1;
	private int front = 0;

	public Queues(int size){
		queuearray = new String[size];
		this.stacksize = size;
		Arrays.fill(queuearray,"-1");
	}

	public void printarray(){
		System.out.println(Arrays.toString(this.queuearray));
	}

	public void printfront(){
		System.out.println(this.queuearray[front]);
	}

	public void displaytheQueue(){
		for (int i=0; i<=60;i++){
			System.out.print("-");
		}
		System.out.println();
		for(int i=0; i<stacksize;i++){
			System.out.print("|  ");
			System.out.print(i+"  ");
		}
		System.out.print("|");
		System.out.println();
		for (int i=0; i<=60;i++){
			System.out.print("-");
		}
		System.out.println();

		for(int i=0;i<stacksize;i++){
			if(queuearray[i].equals("-1")){
				System.out.print("|     ");
			}
			else if(Integer.parseInt(queuearray[i])<10){
				System.out.print("|  ");
				System.out.print(queuearray[i]+"  ");
			}
			else{
				System.out.print("| ");
				System.out.print(queuearray[i]+"  ");
			}
		}
		System.out.print("|");

		System.out.println();
		for (int i=0; i<=60;i++){
			System.out.print("-");
		}
		System.out.println();

	}

	public void remove(){
		queuearray[front]= "-1";
		front++;
	}

	public void insert(String value){
		rear++;
		queuearray[rear]= value;
	}

	public void priorityinsert(String value){
		int thevalue = Integer.parseInt(value);
		int startindex= rear+1;
		int insertindex = 0;
		if (rear==-1){
			insert(value);
		}
		else if(thevalue<Integer.parseInt(queuearray[rear])){
			insert(value);
		}
		else if (thevalue>Integer.parseInt(queuearray[rear])){
			for(int i=rear; i>=0; i--){
				if(thevalue>Integer.parseInt(queuearray[i])){
					insertindex=i;
					queuearray[i+1]=queuearray[i];
					queuearray[i]=value;
					continue;
				}
				else if (thevalue<Integer.parseInt(queuearray[i])){
					
					break;
				}
			}

			//queuearray[index]=value;
			//rear++;
			//System.out.println(index);
		}
	}

	public static void main(String[] args){
		Queues queue = new Queues(10);
		queue.displaytheQueue();
		queue.printarray();
		queue.priorityinsert("10");
		queue.priorityinsert("5");
		queue.priorityinsert("3");
		queue.displaytheQueue();
		queue.printarray();
		queue.priorityinsert("1");
		//heehee.insert("3");
		queue.remove();
		queue.displaytheQueue();
		queue.printfront();
		queue.printarray();
	}
}

