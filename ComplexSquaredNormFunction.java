package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts 
{
	public double fOfXY(int x , int y)
	{
		return Math.hypot((x*x)-(y*y), 2*x*y);
	}
	
	public String 	getName()
	{
		return "ComplexSquaredNormFunction";
	}

}
