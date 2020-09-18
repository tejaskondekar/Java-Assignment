//Question:12
import java.util.Scanner;
class sal{
    public static void main(String args[])
     {
     double GS;
     Scanner s = new Scanner(System.in);
     double salary = s.nextFloat();
     if(salary>=10000)
     {
         GS= salary + 2000 + salary*0.98;
         System.out.println(GS); 
     }
     else
     {
         GS= salary + salary*(10/100) + salary*0.90;
         System.out.println(GS); 
     }   
    }
}