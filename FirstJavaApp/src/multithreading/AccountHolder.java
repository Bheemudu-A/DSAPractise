package multithreading;

public class AccountHolder implements Runnable{
	
	private Account account;
	
	public AccountHolder(Account account) {
		this.account=account;
		//this.account = new Account(); instead of manual initialzation, iam initializing through constructer as above
	}

	@Override
	public void run() {
		
		for(int i=0;i<4;i++) {
			if((Thread.currentThread().getName()).equals("Koushika"))
				withdrawMoney(1000);
			else
				withdrawMoney(3000);
		}
		
	}

	//Synchronized is must to avoid ambuigity multiple thread performing same operations in one account 
	private  synchronized void withdrawMoney(int amount) {		
		if(account.getbalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to Withdraw : "+amount);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" completes the Withdrawal of : "+amount);
		}else {
			System.out.println(Thread.currentThread().getName()+" has overdrawn of "+account.getbalance());
		}
	}

}
