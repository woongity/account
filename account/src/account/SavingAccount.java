package account;

public class SavingAccount extends Account1 {
	protected int month;
	private double interest;
	public SavingAccount(double money,double benefit) {
		super(money);
		this.interest=benefit;
	}
	@Override
	public void debit(double money) throws Exception{
		if(month<=12){
			throw new Exception("아직 출금할수 없습니다");
		} else if(money <= balance){
			debit(money);
		}else if(money<0){
			throw new Exception("음수입력!");
		}
		else{
			throw new InputMismatchException();
		}
	}
	
	@Override public void credit(double money) {
		
	}
	
	@Override
	/*public void passTime(int month){
		if(month <= 0) balance=balance;

		if(this.month < 12 || this.month + month >= 12) {
			balance=balance*Math.pow((1+interest),12);
		}
		this.month+=month;
	}*/
	
	public double getWithdrawableAmount(){
		return (month < 12) ? 0 : balance;
	}
	@Override
	public String toString(){
		String str=String.format("SavingAccount_Balance : %f",balance);
		return str;
	}
	public void passTime(){
		//this.month+=1;
		balance*=(1+interest);	
	}
	public double estimateValue()
	{
		balance=balance*(1+interest);
		return balance;
	}
	public double estimateValue(int month)
	{
		balance=Math.pow((1+interest),month);
		return balance;
	}
	@Override
	public void passTime(int month) throws Exception {
		if(month<0)
			throw new Exception("음수입력!");
		//this.month+=month;
		this.month+=month;
		if(this.month < 12 || this.month + month >= 12) {
			balance=balance*Math.pow((1+interest),12);
		}
		else{
			balance=balance*Math.pow((1+interest),month-1);
		}
	}
}