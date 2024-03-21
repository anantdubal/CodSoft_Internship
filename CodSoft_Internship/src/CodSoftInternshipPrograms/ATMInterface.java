package CodSoftInternshipPrograms;

import java.util.Scanner;

public class ATMInterface {
	public static  void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Account Balance : ₹");
		double initialBalance = s.nextDouble();
		
		BankAccount bankAccount = new BankAccount(initialBalance);
		ATM atm = new ATM(bankAccount);
		
		while(true) {
		atm.displayMenu();
		System.out.println("Select an Option :") ;
		int choice = s.nextInt();
		atm.performTransaction(choice,s);
	}
  }
}
class BankAccount {
	private double balance ;
	public BankAccount(double initialBalance) {
		this.balance = initialBalance ;
	}
	public double getBalance() {
		return balance ;
	}
	public void deposite(double amount) {
		if (amount >0) {
			balance += amount ;
			System.out.println("Deposite of ₹ " +amount+ " Sussesful"); 
		    System.out.println("Current balance : ₹ "+balance);
		}
		else {
			System.out.println("Invalid Deposite Amount");
		}
	}
	public void withdrow (double amount) {
		if (amount >0 && amount <= balance) {
			balance -= amount ;
			System.out.println("Withdroal Amount of ₹ "+amount+ " Sussesful"); 	
		    System.out.println("Current Balance : ₹ "+balance);
		}
		else {
			System.out.println("Invalid Withdrowal Amount or Insufficient Balance");
		}
	}
}
class ATM {
	private BankAccount bankAccount ;
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount ;
	}
	public void displayMenu() {
		System.out.println("-----Welcome in State Bank Of India ATM-----");
		System.out.println("Select Options from ATM Menu :-");
		System.out.println("1.Chech Balance");
		System.out.println("2.Deposite Money");
		System.out.println("3.Withdrow money");
		System.out.println("4.Exit");
	}
	public void performTransaction(int choice , Scanner s) {
		switch (choice) {
		case 1 :
			System.out.println("Current Balance : ₹ "+bankAccount.getBalance());
			System.out.println("------------------------------------------------------------");
			break;

		case 2 :
			System.out.println("Enter Deposite Amount : ₹ ");
			double depositeAmount = s.nextDouble();
			bankAccount.deposite(depositeAmount);
			System.out.println("------------------------------------------------------------");
			break;
			
		case 3 :
			System.out.println("Enter Withdrowal Amount : ₹ ");
			double withdrowAmount = s.nextDouble();
			bankAccount.withdrow(withdrowAmount);;
			System.out.println("------------------------------------------------------------");
			break;
		
		case 4 :
			System.out.println("Exiting ATM . Thank You !");
			s.close();
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice .Please Select a Valid option");
			System.out.println("------------------------------------------------------------");
			break;
		}
	}
}