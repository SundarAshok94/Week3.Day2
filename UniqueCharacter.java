package Week3.Day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {

		
		String unique = "babu";
		char[] charArray = unique.toCharArray();
		
		Set<Character> uniquechar = new HashSet<Character>();
		
		for(int i=0;i<uniquechar.size();i++) {
			
			if(uniquechar.contains(charArray[i])) {
				
				uniquechar.remove(charArray[i]);
				
			}
			else {
				uniquechar.add(charArray[i]);
				
			}

		}
		
		System.out.println(uniquechar);

	}
}

			
			
			
			