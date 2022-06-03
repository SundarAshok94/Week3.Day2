package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates_Collections {

	public static void main(String[] args) {
		
		String text = "Infosys";
		String strArray[] = text.split(" ");
		
		System.out.println(strArray.length);
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i] + " ");
		}
		
		Set<String> RemoveDuplicates_Collections=new LinkedHashSet<String>(Arrays.asList(strArray));
		
		System.out.println(RemoveDuplicates_Collections);


		
	}
	
}		