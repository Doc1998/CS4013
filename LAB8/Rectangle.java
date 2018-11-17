public class Rectangle extends GeometricObject {
  private double width;
  private double height;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }
  public boolean equals(Rectangle r)
  {
	  boolean equal  =  false;
	  double aHeight = this.getHeight();
	  double aWidth  = this.getWidth();
	  double bHeight = r.getHeight();
	  double bWidth  = r.getWidth();
	  if (aHeight == bHeight && aWidth == bWidth)
	  {
		 equal  = true;
	  }
		  return equal;
	  
	  
	  
  }
  public void howToColor()
  {
     System.out.println("Colour all four sides");
	  
  }
  public String toString()
  {
	  return "Height: " + getHeight() + "\nWidth: " + getWidth() + "\nArea: " + getArea() + "\nPerimeter :" + getPerimeter();
  }

}
