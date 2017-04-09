package account;

public abstract class Account1 implements Valuable {
	protected double balance;
	public Account1(double money){
		this.balance=money;
	}
	public void debit(double s){
		balance-=s;
		System.out.printf("Withdraw: %f ; Balance: %f\n", s, balance);
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
	public abstract double getWithdrawableAmount();
	public abstract double passTime(int month);
}
