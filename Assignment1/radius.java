//Quetion:6
import java.util.Scanner;

class radius
{
	public static void main(String args[])
	{
		double area,circumfarance;
		System.out.println("Enter radius of circle");	
		Scanner abc=new Scanner(System.in);
		Float radius=abc.nextFloat();
		area=3.14*radius*radius;
		System.out.println("Area of circle = "+area);
		circumfarance=2*3.14*radius;
		System.out.println("Circumference of circle = "+circumfarance);	
	}
}