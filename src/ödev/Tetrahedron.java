package ödev;

public class Tetrahedron extends threeDimensionalShape {
	private double kenar;

	public Tetrahedron(double kenar) {
	
		this.kenar = kenar;
	}
  public double getArea() {
	  return Math.sqrt(3) * kenar*kenar;
  }
	
	public double getVolume() {
		return (kenar*kenar*kenar) / (6* Math.sqrt(2));
	}
	
}
