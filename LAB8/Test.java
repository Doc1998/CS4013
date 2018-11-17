import java.util.*;
public class Test
{
public static void main(String args[])
{
	GeometricObject c = new Circle(2,"red",2);
	GeometricObject x = new Circle(3,"red",2);
	System.out.println(GeometricObject.max(c,x).toString());
	GeometricObject[] shapes = new GeometricObject[5];
	shapes [0] = new Circle(6);
	shapes [1] = new Square(6);
	shapes [2] = new Square(4);
	shapes [3] = new Circle(19);
	shapes [4] = new Square(11);
		for (GeometricObject g : shapes)
		{
			if (g instanceof Colorable)
			{
				Square sq = (Square) g;
				sq.howToColor();
			}
		}

}

}