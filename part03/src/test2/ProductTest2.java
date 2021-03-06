package test2;

public class ProductTest {
//작성자: 이민호
	public static void main(String[] args) {
		// 13
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "UBS");
		cart[3] = new Bike(99000, "삼천리", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(225000, "lg냉장고");
		
		// 14
		((Electronics) cart[7]).setKwh(0.9);
		System.out.println("power()메소드 실행결과 : "+ ((Electronics) cart[7]).power());

		// 15
		for (Product temp : cart) {
			if (temp != null && temp.price >= 100000) {
				System.out.println(temp);
			}
		}

//		for(int i= 0; i<cart.length; i++) {
//			if(cart[i]!=null && (cart[i].price>= 100000))
//				System.out.println(cart[i]);
//		}
		
		// 16
		for (Product temp : cart) {
			if (temp != null && temp instanceof Bike)
				System.out.println(temp + ((Bike) temp).ride());
		}

	}

}

class Electronics extends Product {
//5
	@Override
	public String sell(Object object) {

		return String.format("묶음 상품 - %s(1set)", object);
	}
//8
	private double kwh;

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
//9
	Electronics() {

	}

	Electronics(int price, String prdName) {
		this.price = price;
		this.prdName = prdName;

	}
//11
	public double power() {
		// kwh필드값으로 1일 24시간 전력소모량 실수계산
		return kwh * 24;
	}
//12
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

}