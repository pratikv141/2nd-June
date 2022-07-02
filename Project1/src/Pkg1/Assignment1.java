package Pkg1;

public class Assignment1 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("sum is "+c);
		return c;
			}
	public int sub(int x, int y) {
		int z= x-y;
		System.out.println("sub is " +z);
			return z;
	}
      public int mul(int a1, int a2) {
    	int a3= a1*a2;
    	System.out.println("mul is "+a3);
    	return a3;
      }
      public void div(int d1, int d2) {
    	  int d3= d1/d2;
    	  System.out.println("final result is "+d3);
      }
      
      public static void main(String[] args) {
		Assignment1 ob= new Assignment1();
		int initialsum= ob.sum(10, 2);
		int finalsum= ob.sum(initialsum, 2);
		int sub= ob.sub(finalsum, 2);
		int mul= ob.mul(sub, 2);
		ob.div(mul, 2);
	}
}
