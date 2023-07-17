package revisionclassjune27;

public class Day5 {

	public static void main(String[] args) {

		// Program 1
		
		String text = "I am learning Java";
		String textA = text.toUpperCase();
		System.out.println(textA);
		
		
		String textB = text.toLowerCase();
		System.out.println(textB);
		
		int a = text.length();   // 18 (total alphabet(15)+3 space)
		System.out.println(a);
		
		// Program 2
		
		String firstName = "rita";
		boolean a1 = firstName.equals("rita");
		System.out.println(a1);   // true
		
		
		firstName = "rita";
		boolean a2 = firstName.equalsIgnoreCase("Rita");
		System.out.println(a2);
		
		String info = "I am new to java";
		boolean a3 = info.contains("x"); 
		System.out.println(a3); // false
		
		// 0 1 2 3 
		// R i t a
		
		String firstNameA = "Rita";
		char a4 = firstNameA.charAt(3);
		System.out.println(a4);
		
		// 0 1 2 3 4 5 6 7 
		// G l e n d a l e
		
		String info2 = "Glendale";
		String a5 = info2.substring(4);
		System.out.println(a5);
		
		String a6 = info2.substring(2,6);
		System.out.println(a6); // e n d a (ignore last alphabet l)
		
		
		// Program 3
		
		String r = " I am learning javascript and javascript is great";
		
		String a7 = r.replace("I", "w");
		String a8 = r.replaceFirst("javascript", "Python");
		String a9 = r.replaceAll("javascript", "python");
		
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		
		String r1 = "rita"; // {"r", "i", "t","a"}
		char[]r2 = r1.toCharArray();
		for(int i = 0; i<r2.length;i++) {
			System.out.println(r2[i]);
		}
		
		// Program 4
	
		String firstNameN = "rita";
		String lastNameN = "khatiwoda";
		
		String a10 = String.join("",firstNameN,lastNameN,"Silva");
		System.out.println(a10);
		
		String a11 = String.join("@", lastNameN,firstNameN);
		System.out.println(a11);
		
		
		boolean a13 = "".isEmpty();
		System.out.println(a13);
		
		boolean a14 = firstNameN.startsWith("ri");
		System.out.println(a14);
		
		boolean a15 = firstNameN.endsWith("ta");
		System.out.println(a15);

		
		
		
		
		
		
		
		
		
		
		

	}

}
