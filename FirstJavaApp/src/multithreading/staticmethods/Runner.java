package multithreading.staticmethods;

public class Runner {
	
	public static void main(String[] args) {
		
		MakingCounter m1 = new MakingCounter();
		MakingCounter m2 = new MakingCounter();
		
		m1.start();
		m2.start();
		
		try {
			m1.join();
			m2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counter final value : "+MakingCounter.counter);
	}

}
