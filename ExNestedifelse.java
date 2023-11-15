package basicjava;

import java.util.Scanner;

public class ExNestedifelse {

	public static void main(String[] args) 
	{
		char choice=' ';
		int interview_cat;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter your choice\n1: Freshers\n2:Expert");
		interview_cat=sc.nextInt();
		if(interview_cat==1)
		{
			System.out.println("The company will decide the job profile according to the interview");	
		}
		else
		{
			System.out.println("Choice your profile \nJ:java developer\nA:.netDeveloper");
			choice=sc.next().charAt(0);
			if(choice=='J')
			{
			
				System.out.println("You have selected the designation ad Java Developer");
			}
			else
			{
				System.out.println("You have selected the designation as .net developer");
			}
		}
		sc.close();
	}
}

