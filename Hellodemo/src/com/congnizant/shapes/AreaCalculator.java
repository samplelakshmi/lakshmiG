package com.congnizant.shapes;
import java.util.Scanner;
class rectangle
{
void calculateArea()
{
System.out.println("The Area of the rectangle is calculated using the formala length*breadth");
}
}
class AreaCalculator extends rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
int res=l* b;
rectangle r=new rectangle();		
r.calculateArea();
System.out.print(res);
}
}

