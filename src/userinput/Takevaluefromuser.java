package userinput;
import java.util.Scanner;
public class Takevaluefromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		//object
		System.out.println("Enter your withdrawl amount");
		int amount = sc.nextInt();
		
		System.out.println("user withdrawl amount is "+amount);
	8*/
	 int bal = 300000;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your withdraw money");
	 int amount  = sc.nextInt();
	 if (bal> amount) {
		System.out.println("Transaction successfull");
	 }
	 else {
		 System.out.println("Transaction failed");
	 }
	 
}
}
