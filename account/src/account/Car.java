package account;

public class Car implements Valuable { 
	private String name;
	private double price;
	
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month){
		price=price*Math.pow((1-0.01),month-1);
		return price;
	}
	public String toString(){
		String str=String.format("Car name : %s\nregistered price:%f", name,price);
		return str;
	}
	public double estimateValue(){
		price*=0.8;
		price*=(1-0.01);
		return price;
	}
}
