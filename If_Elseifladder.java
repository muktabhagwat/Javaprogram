package basicjava;
//Write a Program to find out profit and loss
import java.util.Scanner;
public class If_Elseifladder
{
	public static void main(String[] args) 
	{
				int costprice,sellprice,result;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter selling price");
				sellprice=sc.nextInt();
				System.out.println("Enter Cost Price");
				costprice=sc.nextInt();
				
				result=sellprice-costprice;
				if(result==0)
				{
					System.out.println("Neither profit Nor loss");
				}
				else if(result>0)
				{
					System.out.println("The profit is ="+result);
				}
				else
				{
					System.out.println("It is Loss="+(-result));
				}
				sc.close();
	 }
}
