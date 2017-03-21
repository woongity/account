package account;
import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args){
		double cost;
		Scanner in=new Scanner(System.in);
	
		CheckingAccount account3=new CheckingAccount(100,-10,0.1,0.3);
		CheckingAccount account4=new CheckingAccount(100,-10,0.1,0.3);
		
		//System.out.println("account 1 set limit");
		System.out.println("넣으려는 돈을 입력해주세요 ");
		cost=in.nextDouble();
		account3.credit(cost);
		System.out.println("account1 "+ account3.getBalance());
		System.out.println("account2 "+account4.getBalance());
		
		System.out.println("빼려는 돈을 입력해주세요");
		cost=in.nextDouble();
		account4.debit(cost);
		System.out.println("account1 "+ account3.getBalance());
		System.out.println("account2 "+account4.getBalance());
		
		System.out.println("next month!");
		account3.nextmonth();
		account4.nextmonth();
		System.out.println("account1"+account3.getBalance() );
		System.out.printf("account2"+account4.getBalance() );		
	}
}