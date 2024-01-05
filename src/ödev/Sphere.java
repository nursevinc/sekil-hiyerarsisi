package ödev;

public class Sphere extends threeDimensionalShape {
private double yaricap;

public Sphere(double yaricap) {
	super();
	this.yaricap = yaricap;
}
public double getArea() {
	return 4* Math.PI* yaricap* yaricap;
}

public double getVolume() {
	return (4/3)*Math.PI*yaricap*yaricap*yaricap;
	
}
}
