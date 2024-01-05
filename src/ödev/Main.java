package ödev;

public class Main {

	public static void main(String[] args) {
		Shape[] shapes=new Shape[6];
	shapes[0]= new Circle(4);
	shapes[1]= new Square(3);
	shapes[2]= new Triangle(4,7);
	shapes[3]= new Sphere(5);
	shapes[4]= new Cube(4);
	shapes[5]= new Tetrahedron(3);
	
	for(Shape shape: shapes) {
		System.out.println("Shape: "+ shape.getClass().getSimpleName());
		
		if( shape instanceof twoDimensionalShape) {
			twoDimensionalShape twoDShape= (twoDimensionalShape) shape;
			System.out.println("Area: "+ twoDShape.getArea());
		}
		else if( shape instanceof threeDimensionalShape) {
			threeDimensionalShape threeDShape=(threeDimensionalShape) shape;
			System.out.println("Area: "+ threeDShape.getArea());
			System.out.println("Volume: "+ threeDShape.getVolume());
		}
		
		System.out.println("------------------");
	}
	
		
		
		
		
		
	}
	
}
