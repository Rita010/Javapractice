package revisionclassjune27;

public class RevisionDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		// arithmetic operations
		
		int x=5;
		int y =2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		int a = 2;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
// calling function calculator
		Calculator(2,2);
		Calculator(3,3);
		
		addA();
		addA();
		addA();
		
		addB(2,2);
		addB(5,3);
		addB(10,4);

		int sum = addC(5,6);
		System.out.println(sum);
		System.out.println(sum+sum);
		System.out.println(sum-6);
		System.out.println(sum*0.20);
		
	}
public static void Calculator (int x, int y) 
{
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y); 
	System.out.println(x%y);
}
	
	// function without parameter and without return type

	public static void addA() {	
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	
	public static void addB(int a, int b) {
		System.out.println(a+b);
	}
	// function with parameter and return type
	public static int addC(int s, int t) {
		return s+t;
		
	}
		
	
	}

	

