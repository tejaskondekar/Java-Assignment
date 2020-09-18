//Question:8

import java.util.Scanner;
class intrest
{
    public static void main(String args[])
    {   
        double totalIntrest;
        System.out.println("Enter Principal,rate of intrest and time period");
        Scanner abc =new Scanner(System.in);
        double principle=abc.nextDouble();
        float itr=abc.nextFloat();
        int timep=abc.nextInt();

        totalIntrest=(principle * itr * timep)/100;

        System.out.println("Simple intrest = "+totalIntrest);
    }
}