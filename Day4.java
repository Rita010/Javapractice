package revisionclassjune27;

public class Day4 {

	public static void main(String[] args) {

		// String
		// Object --- properties and methods

		String first_name = "gurujee";

		// 0 1 2 3 4 5 6
		// g u r u j e e

		// String stores the value by index

		System.out.println(first_name.charAt(0));

		System.out.println("-------------------------");

		// program 1

		for (int i = 0; i < first_name.length(); i++) {

			System.out.println(first_name.charAt(i));
			// System.out.println(i);

		}

		System.out.println("---------------");

		// program 2

		int t1 = 0;

		while (t1 < first_name.length()) {
			System.out.println(first_name.charAt(t1));
			t1++;
		}

		System.out.println("-------------------");

		// program 3

		// length()

		String city = "Glendale";
		System.out.println(city.length());

		System.out.println("-------------------");

		// toUpperCase()

		String q1 = city.toUpperCase();
		System.out.println(q1);

		// toLowerCase()
              
		String q2 = city.toLowerCase();
		System.out.println(q2);
		
		// concat()
		
		String q3 = city.concat("    welcome! you");
		System.out.println(q3);
		
		System.out.println("-------------------");
		
		
		String q4 = "I am learning Java";
		String []arr =q4.split("");  // {"I", "am", "learning", "Java"}
		System.out.println(arr);
		
		for(int i = 0; i<arr.length;i++){	
			System.out.println(arr[i]);
	}
		System.out.println("-------------------");
		
		// replaceFirst()
		
		String q5 = "I am learning JavaScript";
		String q6 = q5.replace("JavaScript", "Java");
		System.out.println(q6);
		
		System.out.println("-------------------");
		
		
	// replaceAll()
		
		String q7 = "I am learing java and java is great";
		String q8 = q7.replaceAll("java", "Python");
		System.out.println(q8);
		
	// 	replace()
		
		String q10 = "run";
		String q11 = q10.replace("r", "F");
		System.out.println(q11);
		
	// trim()
		
		String q12 = " Glendale "; // here length of Glendale is 10 (including space before & after Glendale)
		System.out.println(q12.trim().length()); // it trimed space before & after Glendale.
		
		
		
		
		
	}
}
