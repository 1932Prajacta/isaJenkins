
public class Rectangle implements Shape{
	int length = 12;
	int width = 15;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	int areaRectangle = length * width;

	@Override
	public void calculateArea() {
		
		System.out.println("Area of circle is:" + areaRectangle);
		
	}

}
