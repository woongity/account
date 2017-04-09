package account;
import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args){
		Account1 account1=new CheckingAccount(100,50,0.01,0.07);
		Account1 account2=new SavingAccount(100,0.05);
		
		Scanner scan=new Scanner(System.in);
		double amount;
		
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액:%.2f\n",account1.getBalance(),account1.getWithdrawableAmount());
		System.out.println("Enter withdrawal amount for account1 : ");
		amount=scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액:%.2f\n",account1.getBalance(),account1.getWithdrawableAmount());
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.println("you'v just got bankrupcy");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액:%.2f\n",account1.getBalance(),account1.getWithdrawableAmount());
		if(((CheckingAccount) account1).isBankrupted()==true){
			System.out.println("you'v just got bankrupcy");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액:%.2f\n",account1.getBalance(),account1.getWithdrawableAmount());
		if(((CheckingAccount)account1).isBankrupted()==true){
			System.out.println("you'v just got bankrupcy");
		}
		//savingaccount
		System.out.println();
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액:%.2f\n",account2.getBalance(),account2.getWithdrawableAmount());
		
		System.out.println("6 month later");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액:%.2f\n",account2.getBalance(),account2.getWithdrawableAmount());
		account2.debit(50);
		
		System.out.println("next 6 month later");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액:%.2f\n",account2.getBalance(),account2.getWithdrawableAmount());
		
		System.out.println("next 1 month later");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액:%.2f\n",account2.getBalance(),account2.getWithdrawableAmount());
		account2.debit(50);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액:%.2f\n",account2.getBalance(),account2.getWithdrawableAmount());		
	}
}