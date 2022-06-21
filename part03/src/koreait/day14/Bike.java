package koreait.day14;

public class Bike extends Product {
//e
	private int speed;
		
	public Bike() {
	}
//d
	@Override
	public String sell(Object Object) {

		return String.format("추가 할인행사 -%d  %% 인하", Object);
	}

	
//e
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//f
	public Bike(int price, String prdName, int speed){
		this.price= price;
		this.prdName= prdName;
		this.speed= speed;
				
	}
//g
	@Override
	public String toString() {
		return "Bike [price=" + price + ", speed=" + speed + ", prdName=" + prdName + "]";
	}
	
	
	
}
