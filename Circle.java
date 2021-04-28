

public class Circle implements Shape{
	int r=5;
	double pi = 3.14;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	double areaCircle = pi * r * r;

	@Override
	public void calculateArea() {
		System.out.println("Area of circle is:" + areaCircle);
	}

}
