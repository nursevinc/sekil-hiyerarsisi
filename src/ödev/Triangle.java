package ödev;

public class Triangle extends twoDimensionalShape {
private double taban;
private double yukseklik;
public Triangle(double taban, double yukseklik) {

	this.taban = taban;
	this.yukseklik = yukseklik;
}
public double getArea() {
	return taban*yukseklik*0.2;
}

}
