package account;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValuableTest {

	public static void main(String args[]){
		Account1 account1=new CheckingAccount(100,50,0.01,0.07);
		Account1 account2=new SavingAccount(100,0.05);
		
		Scanner scan=new Scanner(System.in);
		
		try{
			double amount;
			System.out.println("Enter deposit amount for Account1: ");
			amount=scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance : $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Accounn2");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account2 balance : $"+account2.getBalance());
		}
		catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n"+e.toString());
		}
		catch(Exception e){
			System.out.println("예외발생 "+e.toString());
		}
		finally{
			account1.passTime(2);
			System.out.println("2 month later account1 : "+account1.getBalance());
		}	
	}	
}
