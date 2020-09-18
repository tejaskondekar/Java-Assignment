//question:14
import java.util.Scanner;
class leap
{
    public static void main(String args[])
    {   System.out.println("Enter year to check its leap or not");
        int year;
        Scanner x = new Scanner(System.in);
        year = x.nextInt();
        if (year % 400 == 0) {
         
            System.out.println("is a leap year."+ year);
         }
        
         else if (year % 100 == 0) {
            System.out.println("is not a leap year."+ year);
         }
        
         else if (year % 4 == 0) {
            System.out.println("is a leap year."+ year);
         }
        
         else {
            System.out.println("is not a leap year."+ year);
         }
    }   
}