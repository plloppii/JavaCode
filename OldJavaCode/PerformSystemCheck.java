import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable{

		private String checkwhat;
		ReentrantLock lock= new ReentrantLock();
		
		public PerformSystemCheck(String checkwhat){
			this.checkwhat=checkwhat;
		}
		
		//"synchronized" protects method, and if any thread accesses the method, no other thread can access it. 
		public void run(){
			lock.lock();
			System.out.println("checking"+ this.checkwhat);
			lock.unlock();
		}
		
}
