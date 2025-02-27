
public class ThreadMain {
	
	public static void main(String[] args) {
		Mythread thread = new Mythread();
		thread.start();
		System.out.println(thread.currentThread().getName());
		thread.currentThread().setName("Mythread");//changing the name
		thread.setPriority(Thread.MAX_PRIORITY);//changing priority for thread scheduler
		System.out.println(thread.currentThread().getName() +" "+thread.getPriority());
	}

}
