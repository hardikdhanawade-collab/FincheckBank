package Operators;

public class Transactioncalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 50000;
		int Amount = 45000;
		
		balance -= Amount;
		
		System.out.println("Anil kumar current balance is" +balance);
		
		int incentive = 5000;
		balance = balance + incentive;
		System.out.println("Anil kumar current update balance is "+balance);
	}

}
