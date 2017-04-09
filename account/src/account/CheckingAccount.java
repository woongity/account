package account;

public class CheckingAccount extends Account1{
	private double creditLimit;
	private double interest;
	private double loanInterest;

	public CheckingAccount(double money,double creditLimit,double interest,double loanInterest){
		super(money);
		this.creditLimit=creditLimit;
		this.interest=interest;
		this.loanInterest=loanInterest;
	}
	@Override
	public void debit(double s){
		if(balance - s >= - creditLimit) {
			super.debit(s);
		}
	}
	/*public void nextMonth(){
		if(money<0){
			money= money*(1+loan_interest);
		}
		else{
			money=money*(1+interest);
		}
	}*/
	public double passTime(int month){
		 if(balance<0){
			 balance= balance*Math.pow((1+loanInterest),month);
			 return balance;
		 }
		 else{
			 balance= balance*Math.pow((1+interest),month);
			 return balance;
		 }
	}
	public double getWithdrawableAmount(){
		if(isBankrupted()){
			return 0;
		}else{
			return balance+creditLimit;
		}
	}
	public boolean isBankrupted(){
		return balance < -creditLimit;
	}
	@Override
	public double EstimateValue(int month) {
		return passTime(month);
	}
	public String toString(){
		String str=String.format("CheckingAccount_Balance : %f",balance);
		return str;
	}
}

