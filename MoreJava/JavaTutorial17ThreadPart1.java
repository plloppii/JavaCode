import java.util.*;
import java.text.DateFormat;

public class JavaTutorial17ThreadPart1 extends Thread{
	
	
	
	
	public void run(){
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for (int i=1;i<=20;i++){
			rightNow= new Date();
			currentLocale= new Locale("en");
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocale);
				
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){	
			}	
		
		}
	}
	
	
	public static void main(String[] args){
		Thread getTime= new JavaTutorial17ThreadPart1();
		getTime.start();
		//RunnableDemo R1 = new RunnableDemo( "Thread-1");
		//R1.start();
		//RunnableDemo R2 = new RunnableDemo( "Thread-2");
		//R2.start();
	}
}
