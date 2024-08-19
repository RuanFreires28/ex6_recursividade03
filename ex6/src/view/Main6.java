package view;

import controller.Controller6;

public class Main6 
{

	public static void main(String[] args) 
	{
		Controller6 c = new Controller6();
		
		int n = 7;
		double s = 0;
		
		double resultado = c.SomaFat(n, s);
		
		System.out.println(" a série resulta em:" + resultado);
		
		
	}
	
}
