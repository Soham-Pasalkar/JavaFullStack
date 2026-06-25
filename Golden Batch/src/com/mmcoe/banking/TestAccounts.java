package com.mmcoe.banking;

public class TestAccounts {
	public static void main(String[] args) {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(16000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); // used by developers for troubleshooting (shows everything)
			//System.out.println(e); // used for logging to audit System (does not show the Trace Root of Exception)
			System.out.println(e.getMessage()); // For End User (does not show type of Exception)

		}
		
		/*
		ac.withdraw(3000);
		System.out.println(ac);
		ac.withdraw(8000);
		System.out.println(ac);
		
		ac.deposit(3000);
		System.out.println(ac);
		ac.deposit(11000);
		System.out.println(ac);*/
	}

}
