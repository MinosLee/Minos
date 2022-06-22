package test2;
//작성자: 이민호
public class Bike2 extends Product{
	//4
	@Override
	public String sell(Object object) {
		
		return String.format("추가 할인행사- %d %%인하", object);
	}
	//6
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//7
	public Bike2() {
		
	}
	
	public Bike2(int price, String prdName, int speed) {
		this.prdName= prdName;
		this.price= price;
		this.speed= speed;
	}
	
	
	//10
	public String ride() {
		
		return "당신은 이것을 시속 " + speed + "km로 탈 수 있습니다.";
				
	}
	
	//12
		@Override
		public String toString() {
			return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
		}
}
