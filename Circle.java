package basicjava;

import java.util.Scanner;

//Write A Program to accept Radius from user and calculate Area of Circle & Circumference of Circle
public class Circle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter the Radius");
		radius=sc.nextDouble();//accept radius from user
		double area_circle=Math.PI*radius*radius;
		double circumference_circle=2*Math.PI*radius;
		
		System.out.println("Area of Circle:"+area_circle);//print the output of area of circle
		System.out.println(" Circumference of Circle:"+circumference_circle);//print the output of  Circumference of Circle
		sc.close();
		
	}

}
