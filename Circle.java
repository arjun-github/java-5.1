
public class Circle extends Figure 
{
	private double area;
	private double perimeter;
	
	private double pi=3.14;
	public Circle(double r)
	{
		super(r);
		setArea(r);
		setPerimeter(r);
	}
	
	public void setArea(double r) {
		area=pi*r*r;}
	public double getArea() {
		return area;}
	
	public double getPerimeter() {
		return perimeter;}

	public void setPerimeter(double r) {
		perimeter=2*pi*r;}

	 public void findArea()
	 {	System.out.println("Circle area is "+ getArea());
	 }
	 public void findPerimeter()
	 {  System.out.println("Circle perimeter is "+ getPerimeter()); 
	 } 
}
