package conditionalStatement;

public class TransactionValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000;
		int withdrawal = 40000;
		
		if (balance > withdrawal) {
			System.out.println("Transaction successfull");
		}
		else {
			System.out.println("Transaction failed  \ntransaction amount is greater than your balance");
		}
	}

}
