package account;

public class SavingAccount extends Account1 {
	
	private int check1=0;
	private int check2=0;
	private double benefit;
	public SavingAccount(double money,double benefit) {
		super(money);
		this.benefit=benefit;
	}
	@Override
	public void debit(double money){
		if(month<=12){
			System.out.println("아직 출금할수 없습니다");
		}
		else{
			this.money-=money;
		}
	}
	@Override
	public double passTime(int month){
		this.month+=month;
		if(month>=12){
			if(check1==0){
				check1=1;
				money=money*Math.pow((1+benefit),12);
				return money;
			}
			else
				return money;
		}else{
			//money=money*Math.pow((1+benefit),12);
			return money;
		}
	}
	public double getWithdrawableAccount(){
		if(month>=12){
			if(check2==0){
				check2=1;
				money=money*Math.pow((1+benefit),12);
				return money;
			}
			else{
				return money;
			}
		}
		else{
			return money;
		}
	}
}
