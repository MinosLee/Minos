package koreait.day11;

public class AshapeTest {

	public static void main(String[] args) {

		Triangle tri = new Triangle(100,84);
		tri.shapeName= "직각삼각형";
		System.out.println(tri);
		System.out.println("넓이" + tri.getArea());
		
		Circle cir= new Circle();
		cir.setRadius(89);
		cir.shapeName="원";
		System.out.println(cir);
		System.out.println("넓이= " + cir.getArea());


	}

}

/*
 * 참고 - 메소드 재정의할 때 접근한정자
 * 부모가 public-> 자식이 디폴트인 경우 X 오류
 * 부모가 디폴트-> 자식이 public인 경우 O 가능
 */



abstract class AShape { // 도형
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {
		System.out.println("AShape 디폴트 생성자 동작합니다");
	}

	public AShape(int width, int height) {
		System.out.println("AShape 생성자 동작");
		this.height=height;
		this.width=width;
	}
	

	public abstract double getArea(); // 도형의 넓이
	//추상클래스도 인스턴스 메소드 정의해서 자식클래스가 재정의 가능.
	public Object explain() {  // 애플리케이션 완료 후 추상메소드를 추가하면 오류가 생김. 인스턴스 메소드로 추가.
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