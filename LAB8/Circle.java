public class Circle extends GeometricObject { 
  protected double radius;

  // Default constructor
  public Circle() {
    this(1.0, "white", 1.0);
  }

  // Construct circle with specified radius
  public Circle(double radius) {
    super("white", 1.0);
    this.radius = radius;
  }

  // Construct a circle with specified radius, weight, and color
  public Circle(double radius, String color, double weight) {
    super(color, weight);
    this.radius = radius;
  }

  // Getter method for radius
  public double getRadius() {
    return radius;
  }

  // Setter method for radius
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // Implement the getArea method defined in GeometricObject
  @Override
  public double getArea() {
    return radius*radius*Math.PI;
  }

  // Implement the getPerimeter method defined in GeometricObject
  @Override
  public double getPerimeter() {
    return 2*radius*Math.PI;
  }
  public boolean equals(Circle c)
  {	  boolean equal = false;	
	  double aRadius = this.getRadius();
	  double bRadius = c.getRadius();
	  if ( aRadius == bRadius)
	  {
		  equal = true;  
	  } 
	  return equal;
		  
	  
  }
  public String toString()
  {
	  return "Radius: " + this.radius + " \nArea: " + this.getArea() + " \nPerimeter: " + this.getPerimeter();
	  
	  
  }
  }

 
