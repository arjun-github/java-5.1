
public class Square extends Figure {
	private double area;
	private double perimeter;
	public Square(double s)
	{
		super(s);
		setArea(s);
		setPerimeter(s);
	}
	public void setArea(double a) {
		area=a*a;}
	public double getArea() {
		return area;}
	
	public double getPerimeter() {
		return perimeter;}

	public void setPerimeter(double a) {
		perimeter=4*a;}

	 public void findArea()
	 {	System.out.println("Square area is "+ getArea());
	 }
	 public void findPerimeter()
	 {  System.out.println("Square perimeter is "+ getPerimeter()); 
	 } 
}