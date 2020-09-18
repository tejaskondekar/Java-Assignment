//Question 15;
import java.util.Scanner;
class age
{
    public static void main(String args[])
    {   System.out.println("Enter gender and age to check eligibility");
    char gender;    
    int no;
        Scanner x = new Scanner(System.in);
        gender = x.next().charAt(0);
        no = x.nextInt();
        
        if( gender == 'm' && no >= 21)
        {
            System.out.println("eligible");
        }
       else if( gender == 'f' && no >= 18)
        {
            System.out.println("eligible");
        }
       else
        {
            System.out.println("not eligible");
        }

    }
}