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
	public void debit(double s) throws Exception{
		 if(s<0){
			throw new Exception("음수입력!");
		}
		 else if(balance - s >= - creditLimit) {
			super.debit(s);
		}
		else if(balance - s < - creditLimit){
			throw new Exception("한도초과");
		}
		else{
			throw new InputMismatchException();
		}
	}
	public void nextMonth(){
		if(balance<0){
			balance= balance*(1+loanInterest);
		}
		else{
			balance=balance*(1+interest);
		}
	}
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
	public String toString(){
		String str=String.format("CheckingAccount_Balance : %f",balance);
		return str;
	}
}

