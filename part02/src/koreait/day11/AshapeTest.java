package koreait.day11;

public class AshapeTest {

	public static void main(String[] args) {

		Triangle tri = new Triangle(100,84);
		tri.shapeName= "�����ﰢ��";
		System.out.println(tri);
		System.out.println("����" + tri.getArea());
		
		Circle cir= new Circle();
		cir.setRadius(89);
		cir.shapeName="��";
		System.out.println(cir);
		System.out.println("����= " + cir.getArea());


	}

}

/*
 * ���� - �޼ҵ� �������� �� ����������
 * �θ� public-> �ڽ��� ����Ʈ�� ��� X ����
 * �θ� ����Ʈ-> �ڽ��� public�� ��� O ����
 */



abstract class AShape { // ����
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {
		System.out.println("AShape ����Ʈ ������ �����մϴ�");
	}

	public AShape(int width, int height) {
		System.out.println("AShape ������ ����");
		this.height=height;
		this.width=width;
	}
	

	public abstract double getArea(); // ������ ����
	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ�Ŭ������ ������ ����.
	public Object explain() {  // ���ø����̼� �Ϸ� �� �߻�޼ҵ带 �߰��ϸ� ������ ����. �ν��Ͻ� �޼ҵ�� �߰�.
		return null;
	}

	@Override
	public String toString() {
		return "AShape [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}

	
}

class Triangle extends AShape { // width *height/2
	
	
	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	
	public double getArea() {

		return width *height/2;
	}

	@Override
	public String toString() {
		return "Triangle [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
	

}

class Circle extends AShape { // radius *radius*3.14
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius *radius*3.14;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	
}

class Rectangle extends AShape { // width*height
	
	public Rectangle(int width, int height) {
		super(width, height);
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
}