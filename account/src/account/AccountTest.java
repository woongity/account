package account;
import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args){
		double cost;
		Scanner in=new Scanner(System.in);
		double credit_interest;
		double interest;
		double loan_interest;
		System.out.println("account1 credit_interest  : ");
		credit_interest=in.nextDouble();
		System.out.println("account1 interest  : ");
		interest=in.nextDouble();
		System.out.println("account1 loan_interest  : ");
		loan_interest=in.nextDouble();
		CheckingAccount account3=new CheckingAccount(credit_interest,interest,loan_interest);
		
		System.out.println("account2 credit_interest  : ");
		credit_interest=in.nextDouble();
		System.out.println("account2 interest  : ");
		interest=in.nextDouble();
		System.out.println("account2 loan_interest  : ");
		loan_interest=in.nextDouble();
		CheckingAccount account4=new CheckingAccount(credit_interest,interest,loan_interest);
		
		System.out.println("account 1 set account : ");
		cost=in.nextDouble();
		account3.setBalance(cost);
		System.out.println("account 1 set account : ");
		cost=in.nextDouble();
		account4.setBalance(cost);
		
		while(true){
			int check=0;
			System.out.println("1 : debit");
			System.out.println("2 : deposit");
			System.out.println("3 : set account");
			System.out.println("4 : next month!");
			System.out.println("5: show me the money");
			check=in.nextInt();
			if(check==1){
				System.out.println("빼려는 돈을 입력해주세요");
				cost=in.nextDouble();
				account3.debit(cost);
				account4.debit(cost);
			}//빼기
			else if(check==2){
				System.out.println("넣으려는 돈을 입력해주세요 ");
				cost=in.nextDouble();
				account3.credit(cost);
				account4.credit(cost);
			}//더하기
			else if(check==3){
				System.out.println("잔액을 다시 입력해주세요");
				cost=in.nextDouble();
				account3.setBalance(cost);
				account4.setBalance(cost);
			}//다시 정의
			else if(check==4){
				System.out.println("next month!");
				account3.nextmonth();
				account4.nextmonth();
			}
			else{
				System.out.println("account1 "+ account3.getBalance());
				System.out.println("account2 "+account3.getBalance());
			}
		}
	}
}
