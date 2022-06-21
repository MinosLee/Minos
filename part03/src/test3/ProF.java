package test3;

public class ProF {
	public static final int WAR = 1;
	public static final int WWAR = 2;
	public static final int WWWAR = 3;

	private String name;
	private String crime;
	private int num;

	@Override
	public String toString() {
		return "ProF [name=" + name + ", crime=" + crime + ", num=" + "("
				+ (this.num == 1 ? "ÈÆ¹æ" : this.num == 2 ? "°æ¹üÁË" : "Áß¹üÁË") + ")" + "]";

	}

	public ProF() {
	}

	public ProF(String name, String crime, int num) {
		this.name = name;
		this.crime = crime;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
