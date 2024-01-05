package ödev;

public class Square extends twoDimensionalShape {
private double kenar;

public Square(double kenar) {
	this.kenar = kenar;
}
public double getArea() {
	return kenar*kenar;
}

}
