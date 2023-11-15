package basicjava;
//condition statement
//Write a Program to accept a no from the user and find out the square if no is positive  & less than 20
import java.util.Scanner;
public class Ifcondition 
{

		public static void main(String[] args) 
		{
			int num,square=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");//accept the value from user
			num=sc.nextInt();
			if(num>0 && num<20)
			{
				square=num*num;
			}
			System.out.println("The result is ="+square);//print the output
			sc.close();//close the scanner class
		}
}
