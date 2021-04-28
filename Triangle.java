
public class Triangle implements Shape{
	double base = 7.5;
	double height = 10;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	double areaTriangle = 0.5 * base * height;

	@Override
	public void calculateArea() {
		
		System.out.println("Area of circle is:" + areaTriangle);
	}

}
