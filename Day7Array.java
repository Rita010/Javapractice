package revisionclassjune27;

import java.lang.Thread.State;
import java.nio.file.spi.FileSystemProvider;

public class Day7Array {

	public static void main(String[] args) {


		
	// program 1
		
		String firstName = null;
		System.out.println(firstName);
		
		
		int a = 0;
		System.out.println(a);
		
		
		System.out.println("----------------------");
		
		
		int [] numbers = new int [3];
		int numbers2 [] = new int [4]; // writing array in different way
		

		System.out.println(numbers[0]);
		
		numbers[0] = 11;
		numbers[1] = 12;
		numbers[2] = 13;
	//  numbers[3] = 14;   // it won't give out the print because we define only 3 rows 
		
		System.out.println(numbers);
		
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		
		
		
		// Program 2
		
		
		int [] numbersC = new int [3];
		int numbersD [] = new int [3];  // writing array in different way
		
		
		//				   0  1  2  3   4  5  6 (index)
		int numbersE [] = {11,22,33,44,55,66,77};
		
		for(int i = 0; i < numbersE.length; i++) {
		//	System.out.println(i);  // it will print only the index
			System.out.println(numbersE[i]);
		}
		
		
		// Program 3
		
		
		int numbersF [] = {11,22,33,44,55,66,77};
		int t1 = 0;
		while (t1< numbersF.length) {
			//System.out.println(t1);  //  it will print only the index
			System.out.println(numbersF[t1]);
			t1++;
		}
		
		
		// Program 4
		
		
		
		// doing Array in different way
		
		int numbersG [] = {11,22,33,44,55,66,77};
		for (int x:numbersG) {
			System.out.println(x);
		}
		
		
		// Program 5
		
		
		String [] names = new String [3];
		String [] cities = {"Phoenix", "Glendale","Mesa","Surprise"};
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		
	
		int t2 = 0;
		
		while (t2 < cities.length) {
			System.out.println(cities[t2]);
			t2++;
		}
		
		// forEach
		
		for(String i : cities) {
			System.out.println(i);
		}
		
		
		// Program 6
		
		
		int [][] numbersB = new int [3][3];
		int [][] numbersj = {
					{1,1,1},
					{11,11,11},
					{111,111,111}
		};
		
		
		numbersB [0][0] = 1;
		numbersB [0][1] = 1;
		numbersB [0][2] = 1;
		
		numbersB [1][0] = 11;
		numbersB [1][1] = 11;
		numbersB [1][2] = 11;
		
		numbersB [2][0] = 111;
		numbersB [2][1] = 111;
		numbersB [2][2] = 111;
		
		System.out.println(numbersB[1][1]);
		
		
		// numbersj
		
		
		for(int i = 0; i <numbersj.length ; i++) {
			int [] ray = numbersj[i];
			
			for(int j = 0; j <ray.length; j++) {
				System.out.println(ray[j]);
			}
		}
	

		// while;
		

	
		
		
		
		// forEach();
		
	
		
		
		
	}

}
