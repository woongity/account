package account;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValuableTest {
	public static void main(String args[]) throws Exception{
		CheckingAccount account1=new CheckingAccount(100,50,0.01,0.07);
		SavingAccount account2=new SavingAccount(100,0.05);
		
		ArrayList<Account1> accountList= new ArrayList<Account1>();
		accountList.add(account1);
		accountList.add(account2);
		System.out.println("전체 계좌의 잔액 합산 : "+Account1.sumForAccount(accountList));
		Account1.passTimeForList(accountList,12);
		System.out.println("전체 계좌의 잔액 합산 : "+Account1.sumForAccount(accountList));
	}
}
		
		
		