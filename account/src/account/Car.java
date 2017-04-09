package account;

public class Car implements Valuable { 
	private String name;
	private double price;
	
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month){
		price=0.8*price;
		price=price*Math.pow((1-0.01),month-1);
		return price;
	}
	public String toString(){
		String str=String.format("Car name : %s registered price:%f", name,price);
		return str;
	}
}
