package Pkg1;

public class Student {
	int age;
	int roll_no;
	public void school()
	{
		System.out.println("Welcome to all of you");
		
	}
	public void school2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student s= new Student();
				s.age=5;
		s.roll_no=14;
		System.out.println("Age of student is " +s.age);
		System.out.println("Roll no. of student is " +s.roll_no);
		System.out.println("life is good");
		s.school();
		s.school2();
		
	}

}
