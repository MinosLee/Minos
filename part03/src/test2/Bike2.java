package test2;
//�ۼ���: �̹�ȣ
public class Bike extends Product{
	//4
	@Override
	public String sell(Object object) {
		
		return String.format("�߰� �������- %d %%����", object);
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
	public Bike() {
		
	}
	
	public Bike(int price, String prdName, int speed) {
		this.prdName= prdName;
		this.price= price;
		this.speed= speed;
	}
	
	
	//10
	public String ride() {
		
		return "����� �̰��� �ü� " + speed + "km�� Ż �� �ֽ��ϴ�.";
				
	}
	
	//12
		@Override
		public String toString() {
			return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
		}
}
