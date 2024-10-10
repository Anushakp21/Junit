
public class MethodExample {
	private static final double PI = Math.PI;
	public static double calArea(double radius)
	{
		if(radius < 0)
		{
			throw new IllegalArgumentException("Radius cannot be Negative");	
		}
		return PI * radius * radius;
	}

}
