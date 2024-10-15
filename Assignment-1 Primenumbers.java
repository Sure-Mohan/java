import java.io.*;
import java.util.Scanner;

class Primenumbers
{
	public static void main(String args[])
	{
		int start,end;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start value : ");
		start=sc.nextInt();
		System.out.println("Enter End value   : ");
		end=sc.nextInt();
		System.out.println("\nThe prime numbers from "+start+" to "+end+" are : ");
		for(int i=start;i<=end;i++)
		{
			ch=1;
			if(i==1)
				ch=1;
			for(int j=2;j<i;j++)
			{
					if(i%j==0)
					{
						ch=0;
						break;
					}
			}
			if(ch==1)
				System.out.println(i+" ");
		}
		System.out.print("\n");
		
	}
}
