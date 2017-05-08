package account;
import java.util.ArrayList;

public abstract class Account1  {
	protected double balance;
	public Account1(double money){
		this.balance=money;
	}
	public void debit(double s) throws Exception{
		balance-=s;
	}
	public void credit(double s){
		balance+=s;
	}
	void setBalance(double s){
		balance=s;
	}//ÀÜ¾×¼öÁ¤
	public double getBalance(){
		return balance;
	}
	public static double sumForAccount(ArrayList<? extends Account1> list ){
		double sum=0;
		for(Account1 account:list){
			sum+=account.getBalance();
		}
		return sum;
	}
	public abstract double getWithdrawableAmount() throws Exception;
	public abstract void passTime();
	public abstract double estimateValue();
	public abstract double estimateValue(int a);
	public abstract void passTime(int i) throws Exception;
	public static void passTimeForList(ArrayList<? extends Account1> list, int month) throws Exception  {
		for(Account1 account:list){
			account.passTime(month);
		}	
	}
}
