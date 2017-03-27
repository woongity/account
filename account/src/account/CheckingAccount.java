package account;

public class CheckingAccount extends Account1{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private int month;

	public CheckingAccount(double money,double credit_limit,double interest,double loan_interest){
		super(money);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	@Override
	public void debit(double s){
		money-=s;
		if(money<credit_limit){
			System.out.println("account1 went Bankrupt!");
		} 
	}
	public void nextMonth(){
		if(money<0){
			money= money*(1+loan_interest);
		}
		else{
			money=money*(1+interest);
		}
	}
	public double passTime(int month){
		 if(money<0){
			 money= money*Math.pow((1+loan_interest),month);
			 return money;
		 }
		 else{
			 money= money*Math.pow((1+interest),month);
			 return money;
		 }
	}
	public double getWithdrawableAccount(){
		if(money+credit_limit<0){
			return 0;
		}else{
			return money+credit_limit;
		}
	}
	public boolean isBankrupted(){
		if(money<credit_limit)
			return true;
		else
			return false;
	}
}

