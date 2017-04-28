
public class Rectangle extends Figure {
	
	//private double b;
	private double area;
	private double perimeter;
	
	public Rectangle(double l, double b)
	{
		super(l);
		setArea(l,b);
		setPerimeter(l,b);
	}
	
	public void setArea(double l,double b) {
		area=l*b;}
	public double getArea() {
		return area;}
	
	public double getPerimeter() {
		return perimeter;}

	public void setPerimeter(double l,double b) {
		perimeter=2*(l+b);}
	
	public void findArea()
	 {	System.out.println("Rectangle area is "+ getArea());
	 }
	 public void findPerimeter()
	 {  System.out.println("Rectangle perimeter is "+ getPerimeter()); 
	 } 
}
