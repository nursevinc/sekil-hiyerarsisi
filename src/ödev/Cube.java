package ödev;

public class Cube extends threeDimensionalShape {
private double kenar;

public Cube(double kenar) {
	this.kenar = kenar;
}
public double getArea() {
	return 6*kenar*kenar;
}
public double getVolume() {
	return kenar*kenar*kenar;
}
}
