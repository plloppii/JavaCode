import java.util.*;

public class GameTimerTest{
	
	public int interval=0;
	
	Timer timer = new Timer();
	TimerTask task= new TimerTask(){
		public void run(){
			interval++;
			System.out.print(interval);
		}
	};
	public void start(){
		timer.scheduleAtFixedRate(task, 1000, 300);
	}
	
	public static void main(String[] args){
		GameTimerTest mytimer = new GameTimerTest();
		mytimer.start();
	}
}