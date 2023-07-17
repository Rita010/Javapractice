package revisionclassjune27;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Comparison operator
		
		// <, > , <= , >= , != , ==
		
		System.out.println(10<5); // false
		System.out.println(10>5); // true
		System.out.println(10<=5); // false
		System.out.println(10>=5); // true
		System.out.println(10!=5); // true 
		System.out.println(10==10); // true
		System.out.println(10<=10); // true
		System.out.println(10>=10); // true
		System.out.println(5!=5);   // false
		
		
		System.out.println("-------------------");
		
		// logical operators
		
		// && - and
		
		// true && true ----- true
		// true && false ---- false
		// false && true ---- false
		// false && false --- false
		
		System.out.println(5==5 && 6==6); // true
		System.out.println(5==5 && 6!=6); // false
		System.out.println(5!=5 && 6==6); // false
		System.out.println(5!=5 && 6!=6); // false
		
		
		System.out.println("-------------------");
		
		// || - or
		
		// true  || true ----- true
		// true  || false ---- true
		// false || true ----- true
		// false || false ---- false
		
		System.out.println(5==5 || 6==6); // true
		System.out.println(5==5 || 6!=6); // true
		System.out.println(5!=5 || 6==6); // true
		System.out.println(5!=5 || 6!=6); // false
	
		
		System.out.println("-------------------");
		
		// !=  - Not 
		
		System.out.println(!(7!=7));// true
		System.out.println(!(7==7));// false
		
		
		System.out.println("-------------------");
		
		
		// conditional statement - one input multiples outcomes 
		
		// if (condition) {
		// block
		// }
		// boolean ---- true of false
		
		int numT = 10;
		if(numT>0 && numT <=5) {
			System.out.println("10% discount");
		}
		if(numT>5 && numT <=10) {
			System.out.println("20% discount");
		}
		
		if(numT>10) {
			System.out.println("30% discount");
		}
		
		
		System.out.println("-------------------");
		
		
		int numT1 = -10;
		if (numT1>0 && numT1 <=5) {
			System.out.println("10% discount");
		}
		if (numT1 >5 && numT1<=10) {
			System.out.println("20% discount");
		}
		if (numT1 > 10) {
			System.out.println("30% discount");
		}
		else {
			System.out.println("incorrect input");
		}
		
		System.out.println("-------------------");
		
		
		int marks = 92;
		if(marks>90) {
			System.out.println("Grade A");
		}
		if(marks>75) {
			System.out.println("Grade B");
		}
		if(marks>65) {
			System.out.println("Grade C");
		}
		
		System.out.println("-------------------");
		
		
		if(marks>90) {
			System.out.println("Grade A");
		}
		else if(marks>75) {
			System.out.println("Grade B");
		}
		else if(marks>65) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Please Try Again");
		}
		
		System.out.println("-------------------");
		
		
		int marks1 = 50;
		if(marks1>90) {
			System.out.println("Grade A");
		}
		else if(marks1>75) {
			System.out.println("Grade B");
		}
		else if(marks1>65) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Please Try Again");
		}
		
		System.out.println("-------------------");
		
		
		// Ternary Operator
		
		
		int a = 10;
		int b = 5;
		
		String grt = a>b ? "a is greater":"b is greater";
		
		System.out.println(grt);
		
		

		int age = 18;
		String Age1 = age >= 18? 
				"can drive":"cannot drive";
		System.out.println(Age1);
		
		
		System.out.println("------------------------");
		
		
		// Switch Case
		
		String city = "phoenix"; 
		switch(city) {
		case "boise":
			System.out.println("Idaho");
		case "phoenix":
			System.out.println("Arizona");
		case "dallas":
			System.out.println("Texas");
			default: 
				System.out.println("incorrect city name");
		
		}
		
		System.out.println("-------------------------");
		
		
		switch(city) {
		case"boise":
			System.out.println("Idaho");
			break;
		case"phoenix":
			System.out.println("Arizona");
			break;
		case"dallas":
			System.out.println("Texas");
			break;
		default: 
				System.out.println("Incorrect city name");
		}
		
		System.out.println("-------------------");
		
		
		
		switch(city){
		case"boise":
		case"salt lake":
			System.out.println("Idaho");
			break;
		case"phoenix":
		case"Mesa":
			System.out.println("Arizona");
			break;
		case"dallas":
		case"asustin":
			System.out.println("Texas");
			break;
		default:
				System.out.println("Incorrect city name");	
			
		}
		
//		 Write a program to check number is odd or even
		
		
		System.out.println(10%2); // modulus 0, even
		System.out.println(23%5); // modulus 3 , odd
//		
//		 if(condition) {
//			(block)
//		}
//		else {
//			
//		}
	
		int q1 = 7;
		if(q1%2 == 0) {
			  System.out.println("even");    
		}
		else {
			System.out.println("odd");
		}
		
		


		
		
		
		
		
		
		
		
		
	}	
}

