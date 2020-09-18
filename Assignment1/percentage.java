//Question:7
import java.util.Scanner;
class percentage
{
	public static void main(String args[])
	{	System.out.println("Enter marks here");
		int a,b,c,d,e;
		float average,percentage;
		Scanner abc=new Scanner(System.in);
		
		a=abc.nextInt();
		b=abc.nextInt();
		c=abc.nextInt();
		d=abc.nextInt();
		e=abc.nextInt();
		average=(a+b+c+d+e)/5;
		System.out.println("Average marks = "+average);
		percentage=(a+b+c+d+e)/5;
		System.out.println("percentage marks = " +percentage+"%");		
		
				
	}
}