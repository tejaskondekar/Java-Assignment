//Question:11
class swap
{
    public static void main(String args[])
    {
        int a=10, b=30;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping A = "+a +" B = "+b);
    }
}