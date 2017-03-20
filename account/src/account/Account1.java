package account;

public class Account1 {
	protected double money;
	public double balance(){
		return money;
	}
	public String debit(double s){
		money-=s;
		if(money<0){
			money+=s;
			return "Debit amount exceed Account balance"; 
		}
		return null;
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
}
