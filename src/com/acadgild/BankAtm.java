package com.acadgild;

/**
 * 
 * BankATM class having deposit and withdraw functions to update the balance of
 * the ATM.
 *
 */
public class BankAtm {
	String atmId, bankName, location;
	static double balance;

	void withdraw(double amt) throws BankATMException {
		double checkBalance;
		checkBalance = balance - amt;

		// Raise exception if balance of ATM goes below 10000
		if (checkBalance < 10000 && checkBalance > 0) {
			throw new BankATMException("Balance is less than 10000");
		}
		// Don't allow withdraw of amount if the amount entered is greater than
		// the available balance.
		else if (amt > balance) {
			System.out.println("Insufficient Balance. Cannot Withdraw " + amt);
			System.out.println("Total ATM Balance = " + balance);
		} else {
			// Update balance if withdraw is successful.
			balance = balance - amt;
			System.out.println("Successfully withdrawn " + amt);
			System.out.println("Total ATM Balance = " + balance);
		}

	}

	void deposit(double amt) {
		// Update the balance when deposit is successful.
		balance = balance + amt;
		System.out.println("Successfully deposited " + amt);
		System.out.println("Total ATM Balance = " + balance);
	}

}
