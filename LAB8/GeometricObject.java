public abstract class GeometricObject implements Comparable{
  protected String color;
  protected double weight;

  // Default construct
  protected GeometricObject() {
    color = "white";
    weight = 1.0;
  }

  // Construct a geometric object
  protected GeometricObject(String color, double weight) {
    this.color = color;
    this.weight = weight;
  }

  // Getter method for color
  public String getColor() {
    return color;
  }

  // Setter method for color
  public void setColor(String color) {
    this.color = color;
  }

  // Getter method for weight
  public double getWeight() {
    return weight;
  }

  // Setter method for weight
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public int compareTo(GeometricObject o)
  {
	  double area1 = this.getArea();
	  double area2 = o.getArea();
	  
	  if (area1> area2)
	  {
		  return 1;
	  }
	  else if (area2 > area1)
	  {
		  return -1;
	  }
	  else 
	  {
		  return 0;
	  }
  }
	   public static GeometricObject max(GeometricObject obj, GeometricObject obj1)
	   {
  
	  if (obj.compareTo(obj1) == 1)
	  {
		  return obj;
	  }
	  else if (obj.compareTo(obj1) == -1)
	  {
		  return obj1;
	  }
	  else 
	  {
		  return obj;
	  }
  }
	  
  


  // Abstract method
  public abstract double getArea();

  // Abstract method
  public abstract double getPerimeter();
  
 
}