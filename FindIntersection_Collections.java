package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection_Collections {
	
		public static void main(String[] args) {

		Integer arr1[] = {8,4,87,7,399,57};
		Integer arr2[]= {9,4,8,57,300,25};

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr1));
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr2));

		for(int i=0;i<list.size();i++) {
			
			for(int j=0;j<list1.size();j++) {
				
				if(list.get(i)==list1.get(j)) {
					
					System.out.println(list.get(i));
				}
				
				
			}
		}
			
		}
		}