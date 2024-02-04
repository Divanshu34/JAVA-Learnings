package com.sunbeam;

// synchronization using synchronized method
public class Demo18_05Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static Account acc = new Account(1, "Saving", 10000.0);

	public static void main(String[] args) {
		
		class DepositThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					acc.deposit(1000); // internally "acc" object is locked -- synchronized deposit()
					System.out.println("Deposit Balance: " + acc.getBalance());
					delay(100);
				}
			}
		}
		Thread dt = new DepositThread();
		dt.start();
		
		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					acc.withdraw(1000);// internally "acc" object is locked -- synchronized withdraw()
					System.out.println("Withdraw Balance: " + acc.getBalance());
					delay(100);
				}
			}
		}
		Thread wt = new WithdrawThread();
		wt.start();
		
		try {
			// main thread waits for dt and wt.
			dt.join(); // calling thread (main) waits for given thread (dt)
			wt.join(); // calling thread (main) waits for given thread (wt)
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Final Balance: " + acc.getBalance());
	}

}
