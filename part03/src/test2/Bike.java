package test2;

public class Bike extends Product{

	@Override
	public String sell(Object Object) {
		
		return String.format("추가 할인행사- %d %%인하", Object);
	}

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Bike() {}
	
	public Bike(int price, String prdName, int speed) {
		this.prdName= prdName;
		this.price= price;
		this.speed= speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
	
	
}
