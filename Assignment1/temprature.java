import java.util.Scanner;
class temprature  
{
    public static void main(String args[])
    {   float f,c;
        System.out.println("Enter tempreture in Fr");
        Scanner a = new Scanner(System.in);
        f = a.nextFloat();
        c= 5*(f-32)/9;
        System.out.println(" Tempreture in Celsius = "+c+"C");
    }
}