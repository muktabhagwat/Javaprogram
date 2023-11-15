package basicjava;

import java.util.Scanner;

public class Switchex1 {

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice=\n1:Withdrawal process\n2:Pin change\n3:Print the last transaction");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter amount and complete the process of withdrawal");
				break;
			case 2:
				System.out.println("Change the pin ");
				break;
			case 3:
				System.out.println("Print the last transaction");
				break;
			default:
				System.out.println("Pls enter valid no");
				break;
		}
		sc.close();
	}

}
