package revisionclassjune27;

public class revisionD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1
		
		int a = 2;
		boolean b = true;
		String c = "Rita";
		
		
		// to print "hello world"
		
		System.out.println("hello world");
		
		System.out.println("------------------");	
		
		// program 2
		
		// Arithmetic Operation
		
		int x = 5;
		int y = 4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		System.out.println("------------------");	
		
		int m = 6;
		int n = 2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);	
		
		System.out.println("------------------");	
		// Calling calculator
		
		Calculator (14,10);
		Calculator (8,3);
		
		System.out.println("------------------");	
		
		//calling the function without parameter and without return type
		addA();
		addA();
		addA();
		
		System.out.println("------------------");
		
		//calling the function with parameter and without return type
		
		addB(5,6);
		
		System.out.println("------------------");
		
		//function with parameter and with return type
		int sum = addC(30,20);
		System.out.println(sum);
		System.out.println(sum + sum);
		System.out.println(sum - 20);
		System.out.println(sum * 20);
		System.out.println(sum*0.10);
		System.out.println(sum / 20);
		
	}

	// calculator 
	public static void Calculator (int a, int b){
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);	
	}
	//  function without parameter and without return type
	
	public static void addA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	
	public static void addB(int q, int r) {
		System.out.println(q + r);
	}
	
	//function with parameter and with return type
	
public static int addC(int m, int n) {
	System.out.println(m + n);
	return m + n;
	
}
}
