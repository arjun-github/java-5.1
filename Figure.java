

public abstract class Figure {
	public double dim1;
	public Figure(double dim1)
	{
		this.dim1=dim1;
		
	}
	/*public double getDim1() {
		return dim1;
	}
	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}
	*/
	public abstract void findArea();
	public abstract void findPerimeter();
}