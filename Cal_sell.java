package basicjava;
//WAP to find out profit and loss
import java.util.Scanner;

public class Cal_sell
{
	public static void main(String[] args) 
	{
				int cp,sp,result;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter selling price");
				sp=sc.nextInt();
				System.out.println("Enter Cost Price");
				cp=sc.nextInt();
				
				result=sp-cp;
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
