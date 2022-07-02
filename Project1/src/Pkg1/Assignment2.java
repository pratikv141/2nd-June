package Pkg1;

public class Assignment2 {
	public int div(int a, int b) {
		int c= a/b;
		System.out.println("division is " +c);
		return c;
		
	}
	public int sub(int d, int e) {
		int f= d-e;
		System.out.println("sub is "+f);
		return f;
	 }
      
	public int sum(int x, int y) {
		int z= x+y;
		System.out.println("sum is "+z);
		return z;
    	  
      }
	public void mul(int x1, int x2) {
		int x3= x1*x2;
		System.out.println("final result is "+x3);		
	}
	public static void main(String[] args) {
		Assignment2 ob= new Assignment2();
		int division= ob.div(10,2);
		int initialsub= ob.sub(division, 2);
		int minus= ob.sub(initialsub, 2);
		int add= ob.sum(minus, 2);
		ob.mul(add,2);
		
	}
}
