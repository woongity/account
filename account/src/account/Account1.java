package account;

public class Account1 {
	private double money;
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
	public void Account(double s){
		money=s;
	}
}
