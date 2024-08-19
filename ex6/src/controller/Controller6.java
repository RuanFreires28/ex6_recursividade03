package controller;

public class Controller6 
{

	public Controller6()
	{
		super();
	}
	
	public double SomaFat (int n, double s)
	{
		if (n == 0)
		{
			return s;
		}
		else
		{
		
			int x = n;
			long x1 = x;
			while (x > 1)
			{
				 x1 = x1 * (x - 1) ;
				 x = x-1;
			}
			
			s = s + (double) 1/x1;
			
			return SomaFat ((n - 1), s);
		}
	}
	
	
	
	
}
