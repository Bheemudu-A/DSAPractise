package multithreading;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//Runnable interface example
public class ThreadMain {
	
	public static void main(String[] args) {
/*		Mythread thread = new Mythread();
		thread.start();
		System.out.println(thread.currentThread().getName());
		thread.currentThread().setName("Mythread");//changing the name
		thread.setPriority(Thread.MAX_PRIORITY);//changing priority for thread scheduler
		System.out.println(thread.currentThread().getName() +" "+thread.getPriority());
		*/
		
		//-----------for Multithreading Implementation----------
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Bheem");
		t2.setName("Koushika");
		t1.start();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
	}

}
