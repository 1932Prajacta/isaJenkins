
public class ShapeFactoryDesign {
	public Shape getInstance(String str) {
		if(str.equals("circle")) {
			return new Circle();
		}
		else if(str.equals("triangle")) {
			return new Triangle();
		}
		else if(str.equals("rectangle")) {
			return new Rectangle();
		}
		else {
			return null;
			//System.out.println("Shapes");
		}
		
	}

}
