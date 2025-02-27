package multithreading;

public class Account {
	
	private int balance = 10000;
	
		public int getbalance() {
			return balance;
		}
		
		public void withdraw(int amount) {
			balance -= amount;
		}

}
