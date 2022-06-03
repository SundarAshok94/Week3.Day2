package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {

	public static void main(String[] args) {
		
		Integer asecl[] = {4,7,89,98,28,56,76};
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(asecl));
		
		Collections.sort(arraylist);
		
		System.out.println(arraylist);
		
		int size = arraylist.size();
		
		for(int i=0;i<arraylist.size();i++) {
			
			System.out.println(arraylist.get(i)+ " ");
		}
		System.out.println('\n' + "Second Largest number is " +arraylist.get(size - 2));
		
		

	}

}
