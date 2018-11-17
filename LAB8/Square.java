public class Square extends GeometricObject implements Colorable
{ private double length;
public Square(double length)
 {
	 super("white",1.0);
     this.length = length;	
 }
 public Square()
 {
	  this(1.0, "white", 1.0);
 }
 public Square(double length, String color, double weight)
	{
		super(color,weight);
		this.length = length;
	}
	@Override
	public double getArea()
	{
		return length * length;
	}
	
	@Override
	public double getPerimeter()
	{
		return 4 * length;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean equal = false;
		Square s = (Square) o;
		double aLength = this.getLength();
		double bLength = this.getLength();
		if (aLength == bLength)
		{
			equal = true;
		}
	  
		return equal;
	}
	
	@Override
	public String toString()
	{
		return "Length : " + this.getLength() + "\nArea : " + this.getArea() + "\nPerimeter : " + this.getPerimeter();
	}
	
	public void howToColor()
	{
		System.out.println("Colour all four sides.");
	}
}



