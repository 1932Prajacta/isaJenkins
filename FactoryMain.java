
public class FactoryMain {
	public static void main(String[] args) {
		ShapeFactoryDesign shape = new ShapeFactoryDesign();
		
		Shape s1 = shape.getInstance("circle");
		s1.calculateArea();
		
		Shape s2 = shape.getInstance("triangle");
		s2.calculateArea();
		
		Shape s3 = shape.getInstance("rectangle");
		s3.calculateArea();
		
		
	}

}
