package account;

public class CheckingAccount extends Account1 {

	private double credit_limit;
	private double interest;
	private double loan_interest;
	

	public CheckingAccount(double money,double credit_limit,double interest,double loan_interest){
		super(money);
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
	public void debit(double s){
		money-=s;
		if(money<credit_limit){
			money+=s;
			System.out.println("error occur!");
		} 
	}
	public void nextmonth(){
		if(money<0){
			money= money*(1+loan_interest);
		}
		else{
			money=money*(1+interest);
		}
	}
}

