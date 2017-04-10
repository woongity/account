package account;

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
	public abstract double getWithdrawableAmount();
	public abstract double passTime(int month);
}
