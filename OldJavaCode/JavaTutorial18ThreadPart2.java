import java.util.concurrent.ScheduledThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.*;
import java.util.*;

public class JavaTutorial18ThreadPart2 {
	public static void main(String[] args){
		addThreadstoPool();
	}
	
	public static void addThreadstoPool(){
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 1, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calender"), 10, 10, SECONDS);
		System.out.println("Number of Threads: "+Thread.activeCount());
	
		Thread[] listofThreads = new Thread[Thread.activeCount()];
		Thread.enumerate(listofThreads);
		
		for (int i = 0; i<listofThreads.length;i++){
			System.out.print(listofThreads[i].getName()+" ");
			if(listofThreads[i].getName().equals("pool-1-thread-2")){
				listofThreads[i].setPriority(10);
			}
			System.out.println(listofThreads[i].getPriority());
		}
		
		
	
	}
	
}
