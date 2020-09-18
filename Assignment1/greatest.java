//Question:13
import java.util.Scanner;
class greatest
{
    public static void main(String args[])
    {   System.out.println("Enter three variables");
        int a,b,c;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();
        c = x.nextInt();

        if(a>b && a>c)
        {
            System.out.println("1 st number is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("2 nd number is greater");
        }
        else
        {
            System.out.println("3 rd number is greater");
        }
    }
}