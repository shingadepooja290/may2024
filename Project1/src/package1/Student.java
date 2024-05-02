package package1;

public class Student {
public Student()
   {
	this(222,345,786);
	System.out.println("defualt contructor");

   }
public Student(int a)
{
this();
	System.out.println("one parameterized constructorr");
}
public Student(int a, int b)
{
	
	System.out.println("two parameterized constructorr");
}
public Student(int a, int b, int c)
{
   this(20,50);
	System.out.println("three parameterized constructorr");
}
public Student(int a,int b, int c,int d)
{
	System.out.println("four parameterized constructorr");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob= new Student();
	}

}
