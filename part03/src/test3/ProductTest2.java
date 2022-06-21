package test3;

public class ProductTest2 {
//�ۼ���: �̹�ȣ
	public static void main(String[] args) {
		// 13
		Product2[] cart = new Product2[10];
		cart[0] = new Bike2(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "UBS");
		cart[3] = new Bike2(99000, "��õ��", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(225000, "lg�����");
		
		// 14
		((Electronics) cart[7]).setKwh(0.9);
		System.out.println("power()�޼ҵ� ������ : "+ ((Electronics) cart[7]).power());

		// 15
		for (Product2 temp : cart) {
			if (temp != null && temp.price >= 100000) {
				System.out.println(temp);
			}
		}

//		for(int i= 0; i<cart.length; i++) {
//			if(cart[i]!=null && (cart[i].price>= 100000))
//				System.out.println(cart[i]);
//		}
		
		// 16
		for (Product2 temp : cart) {
			if (temp != null && temp instanceof Bike2)
				System.out.println(temp + ((Bike2) temp).ride());
		}

	}

}

class Electronics extends Product2 {
//5
	@Override
	public String sell(Object object) {

		return String.format("���� ��ǰ - %s(1set)", object);
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
		// kwh�ʵ尪���� 1�� 24�ð� ���¼Ҹ� �Ǽ����
		return kwh * 24;
	}
//12
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}

}