//Question:9
import java.util.Scanner;
class year
{
 
public static void main(String[] args) 
{int m, day , year , week;  
System.out.println("Enter no of days");
Scanner a = new Scanner(System.in);
m = a.nextInt();
year = m /365;
m = m%365;
week =m/7;
m = m%7;

day = m;

System.out.println("Years = "+year);
System.out.println("Week = "+week);
System.out.println("Day = "+day);
    
        
}
}