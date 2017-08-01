package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public double getArea() {

		return width*height/2;
	}
	
	@Override
	public double getPerimeter() {

		return Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2))+width+height;
	}
}
