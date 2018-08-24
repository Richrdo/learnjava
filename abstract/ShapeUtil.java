

public class ShapeUtil{
	public double sum(Shape[] shapes){
		double s=0;
		for (Shape shape:shapes) {
			s+=shape.area();
		}
		return s;
	}

}