class expressb{
		public static void main(String args[])
		{
			int x=2,y=3,z;
			z = x++ - --y - --x  +  x++ ;
			System.out.println("Value of x="+x);
			System.out.println("Value of y="+y);
			System.out.println("Value of z="+z);
		}
		}