package com.mmcoe.banking;

public class Accounts {
	private double balance;
	private double overdraft;
	
	public Accounts(double balance) {
		this.balance = balance;
		overdraft = 10000;
	}
	
	
	
	public void deposit(double amount) {
		if (overdraft != 10000) {
			if ((amount + overdraft) > 10000) {
				balance = (amount + overdraft) - 10000;
				overdraft = 10000;
			}
			else {
				overdraft += amount;
			}
		}
		else {
			balance += amount;
		}
	}
	
	
	
	public void withdraw(double amount) throws BalanceException {
		if (balance < amount) {
			if ((balance + overdraft) >= amount) {
				overdraft = overdraft - (amount - balance);
				balance = 0;
			}
			else {
				throw new BalanceException("Not enough Money");
			}	
		}
		else {
			balance -= amount;
		}
	}

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Accounts [Balance = " + balance + ", Overdraft = " + overdraft + "]" ;
	}

}
