package account;

public abstract class Account1 {
	protected double money;
	protected int month;
	protected double benefit;
	public Account1(double money){
		this.money=money;
	}
	public void debit(double s){
		money-=s;
		if(money<0){
			money+=s;
		}
	}
	public void credit(double s){
		money+=s;
	}
	void setBalance(double s){
		money=s;
	}//ÀÜ¾×¼öÁ¤
	public double getBalance(){
		return money;
	}
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int month);
}
