package ödev;

public class Circle extends twoDimensionalShape {
	private double yaricap;
	public Circle( double yaricap) {
		this.yaricap=yaricap;
		
	}
	@Override
    public double getArea() {
	return Math.PI*yaricap*yaricap;
}


}
