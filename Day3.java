package revisionclassjune27;



public class Day3 {

	public static void main(String[] args) {

		// for loop ---- break and continue
		
		// for(initialization; conditionCheck; increment/decrement)
		// {
			//statements
		//}
		
		// program 1
		// to print 1,2,3 numbers by using for loop
		
		
		for(int i = 1; i<=3; i++) { //2,3,4
			System.out.println(i); //1,2,3
		}
		
		System.out.println("--------------------");
		
		
		// Program 2
		// to print "hello" 3 times by using for loop
		
		
		for(int i = 1; i<=3; i++) { 		// 2,3,4
			System.out.println("hello");	//hello,hello,hello
		}
		
		System.out.println("---------------------");
		
		
		// Program 3 
		// to print 1 to 5
		
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		
		// Program 4
		// to print 5 to 1
		
		for(int i=5; i>=1; i--) {	//4,3,2,1,0
			System.out.println(i);  //5,4,3,2,1
		}
		
		
		System.out.println("---------------------");
		
		
		// Program 5
		// to print tables of 2
		
		for(int i=2; i<=20;  i=i+2) { //4,6,8,10,12,14,16,18,20,22
			System.out.println(i);  //2,4,6,8,10,12,14,16,18,20
		}
		
		System.out.println("---------------------");    
	
		
			// Program 6
		// to print tables of 5 in reverse
		
		
		for(int i=50; i>=5; i=i-5) { //45,40,35,30,25,20,15,10,5,0
			System.out.println(i); //50,45,40,35,30,25,20,15,10,5
		}
			
			
		System.out.println("---------------------");
			
		
		// Program 7
		
		// break
		
		for (int i = 1; i<=5;i++) {  //2,3
			if(i==3) {
				break;
			}
			System.out.println(i); //1,2,
		}
			
		System.out.println("---------------------");
		
		
			// Program 8
		
			// continue
			
		for(int i = 1; i<=5; i++) { //2,3,4,5,6
			if(i==3) {
				continue;
			}
			System.out.println(i); //1,2,4,5
		}
		
		System.out.println("---------------------");
		
		
		// Program 9
		
		// initialization
		//while(condition){
				//statement
				//increment/decrement
		//}
		
		int t1 =1;
		while(t1<=3) {
			System.out.println(t1);
			t1++;
		}
		
		System.out.println("---------------------");
		
		
		// Program 10
		// print "hello" 3 times
		
		
		int t2 =1;
		while(t2<=3) {
			System.out.println("hello");
			t2++;
		}
		
		System.out.println("---------------------");
	
		
		// Program 11
		
		
		int t3 =5;
		while(t3>=1) {
			System.out.println(t3);
			t3--;
		}
		
		System.out.println("---------------------");
		
		
		// Program 12
		// tables of 2
		
		int t4 = 2;
		while (t4<=20) {
			System.out.println(t4);
			t4 = t4+2;
		}
		
		System.out.println("---------------------");
		
		
		// Program 13
		//tables of 5 in reverse 
		
		int t5 =50;
		while(t5>=5) {
			System.out.println(t5);
			t5 = t5-5;
		}
		
		
		System.out.println("---------------------");
		
		
		// Program 14
		
		
		int t6 = 1;
		while(t6<=5) {
			if(t6==3) {
				break;
			}
			System.out.println(t6);
			t6++;
		}
		
		
		System.out.println("---------------------");
		
		
		// Program 15
		
		
		int t7 =1;
		while(t7<=5) {
			if(t7==3) {
				t7++;
				continue;
			}
			System.out.println(t7); //1,2,4,5,
			t7++;			//2,3,4,5,6
		}
		
		
		
		
		
		
		
	}

}
