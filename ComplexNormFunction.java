package func;

public class ComplexNormFunction implements DoubleFunctionOfTwoInts 
{
	public double fOfXY(int real , int imaginary)
	{
		return Math.hypot(real, imaginary);
		
	}
	public String 	getName()
	{
		return "ComplexNormFunction";
	}


}
