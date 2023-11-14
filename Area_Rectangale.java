package basicjava;
//14 November
//Que 1:Write A Program to accept Length & Breadth from the user and find out Area of Rectangle and Perimeter 
//of Rectangle
import java.util.Scanner;
public class Area_Rectangale {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double length,breadth;
		System.out.println("Enter the length");
		length=sc.nextDouble();//accept length from user
		System.out.println("Enter the breadth");
		breadth=sc.nextDouble();//accept breadth to user
		double area_rectangle=length*breadth;//formula of area of rectangle
		double perimeter=2*(length*breadth);//formula of perimeter of rectangle
		System.out.println("Area of Rectangle:"+area_rectangle);//print the output of area of rectangle
		System.out.println("Perimeter of rectangle:"+perimeter);//print the output of perimeter of rectangle
		sc.close();
	}

}
