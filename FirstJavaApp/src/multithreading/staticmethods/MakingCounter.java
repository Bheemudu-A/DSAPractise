package multithreading.staticmethods;

public class MakingCounter extends Thread{
	
	 static int counter;
	
	
	public void run() {
		counterMethod();
	}

	private static void counterMethod() {
		for(int i=0;i<2000;i++) {	
			synchronized (MakingCounter.class) {//making variable level synchronized as no need of method level, as it makes long wait for other thread
				counter++;			
			}
		   System.out.println(Thread.currentThread().getName()+" count is : "+counter);
		}
		
	}

}
