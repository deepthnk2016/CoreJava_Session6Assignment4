package com.acadgild;

/**
 * 
 * Main class to deposit and withdraw amount to / from ATM
 *
 */
public class Session6Assignment4 {

	public static void main(String[] args) {
		try {

			BankAtm b1 = new BankAtm();
			System.out.println("Depositing 50000");
			b1.deposit(50000);
			System.out.println("-------------------------------------");
			BankAtm b2 = new BankAtm();
			System.out.println("Withdrawing 40000");
			b2.withdraw(40000);
			System.out.println("-------------------------------------");
			BankAtm b3 = new BankAtm();
			System.out.println("Withdrawing 8000");
			b3.withdraw(8000);
			System.out.println("-------------------------------------");
		} catch (BankATMException e) {
			System.out.println(e.toString());
		}
	}

}
