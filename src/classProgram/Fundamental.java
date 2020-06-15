package classProgram;

public class Fundamental {
	
	/**
	 * q1.  Create a class account which will represent a bank account . It should have some properties which a typical 
	 * 		bank account have .
	 * q2.	Create three accounts and print the details of  accounts. 
	 *
	 *	H.W	1. revise till class
	 *		2. remember all the previous program.
	 *		3. complete the above question.
	 *
	 *q3.	Add methods in account for adding & withdrawing money. Demonstrate the usage in main method.
	 *
	 *q4. 	create a class Bank which will have list of Accounts , it should have methods to add an account and
	 *		print all the available account.
	 */
	
	public static void main(String args[]) {
		Account acc1= new Account(123456L, "RAM", "30/1/1990", 50000 , "saving");
		Account acc2= new Account(123456L, "SHAM", "31/2/1990", 20000 , "current");
		Account acc3= new Account(123456l, "JODU", "1/3/1990", 80000 , "fixed");
		acc1.printDetails();
		acc2.printDetails();
		acc3.printDetails();
		System.out.println("balance in account: "+acc1.accountNum+" before adding is : " + acc1.balance);
		acc1.addMoney(1000);
		System.out.println("balance in account: "+acc1.accountNum+" after adding money is : " + acc1.balance );
		System.out.println("balance in account: "+acc1.accountNum+" before withdrawing is : " + acc1.balance);
		 acc1.withdrawMoney(500);
		 System.out.println("balance in account: "+acc1.accountNum+" after withdrawing money is : " + acc1.balance );
		 
		 //creating bank
		 Bank bank= new Bank();
		 bank.addAcc(acc1);
		 bank.addAcc(acc2);
		 bank.addAcc(acc3);
		 bank.printAccDetails();
		 
		   }

}

class Account{                 // Class is a bluePrint of object . Objects are used to represent the real world entity
	long accountNum;           // these are instance variable. 
	String name;
	String DOB;
	int balance;
	int avgBalance;
	String accountType;
	
	Account(long accountNum, String name, String DOB, int balance, String accountType){
		this.accountNum= accountNum;
		this.name= name;
		this.DOB= DOB;
		this.balance= balance;
		this.accountType= accountType;
	}
	
	public void printDetails() {
		System.out.println(" Account Details are : ");
		System.out.println("Account Number: "+accountNum);
		System.out.println("Account Name: "+name);
		System.out.println("DOB: "+DOB);
		System.out.println("Account Balance: "+balance);
		System.out.println("Account Type: "+accountType);
		System.out.println();
	}
	
	public void addMoney(int money ) {
		
		balance= balance + money;	
		
	}
	
public void withdrawMoney(int money ) {
		
		balance= balance - money;	
		
	}
	
}

class Bank{
	Account acc[]=new Account[10];
	int i=0;
	
	public void addAcc(Account a) {
		if(i<acc.length) {
		acc[i]= a;
		i++;
		}
		else {
			System.out.println("max no. of account has reached ");
		}
	}
	
	public void printAccDetails() {
		for(int g=0; g<i;g++) {
			acc[g].printDetails();
		}
	}
	
	
	
	
}
