package revisionclassjune27;

public class Day1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Method 1
		
	//	Program 1
		
		System.out.println("hello"); 
		System.out.println("helloooooo" );
		System.out.println("________________________________");
	
	//	Program 2
		
		int a = 10; int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);	
		
		int  q = 8; int r = 4; 
		System.out.println(q + r);
		System.err.println(q - r);
		System.out.println(q * r);
		System.out.println(q/r);
		System.out.println(q%r); 
		System.out.println("________________________________");
		
		// calling the function
	
		addA(); // function without parameter and without return type
		
		System.out.println("________________________________");

		addB(5,10); // function with parameter and without return type
		
		System.out.println("________________________________");
		
		int sum = addC(30,20); // function with parameter and with return type
		System.out.println(sum);
		System.out.println(sum + sum);  
		System.out.println(sum*0.10);
		
		System.out.println("________________________________");
		
		// calling calculator
		
		calculator(10,3);
		calculator(20,10);
		calculator(2,2);
		
	}
	// function without parameter and without return type
	public static void addA()
	{
	
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	public static void addB(int a, int b) 	
	{

		System.out.println(a+b);
	}
	// function with parameter and with return type
	public static int addC(int m, int n) 
	{
		return m + n ;
	}
	public static void calculator(int x, int y) 
	{
	System.out.println(x+y);	
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
	
	
	
	
	
	}
	
}
