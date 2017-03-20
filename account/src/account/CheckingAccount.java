package account;

public class CheckingAccount extends Account1 {

	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	void CheckingAccount(double credit_interest,double interest,double loan_interest){
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	public double getlimit(){
		return credit_limit;
	}
	public double getinterest(){
		return interest;
	}
	public double getloaninterest(){
		return loan_interest;
	}
	@Override
	public String debit(double s){
		money-=s;
		if(money<credit_limit){
			money+=s;
			return "debit acceed limit";
		}
		return null; 
	}
	public double nextmonth(){
		if(money<0){
			return money*(1+loan_interest);
		}
		else{
			return money*(1+interest);
		}
	}
}

