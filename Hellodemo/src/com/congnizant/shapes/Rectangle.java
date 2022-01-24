package com.congnizant.shapes;
public class Rectangle {
	void calculateArea()
	{
		System.out.println("The Area of the rectangle is calculated using the formula length*breadth");
	}
}
public class AreaCalculator extends Rectangle
{
	static int m1(int x,int y)
	{
		return x*y;
	}
	public static void main(String[] args)
	{
		System.out.print(m1(5,3));
	}
}

