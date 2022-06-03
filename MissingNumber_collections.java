package Week3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MissingNumber_collections {

	public static void main(String[] args) {

Integer arr[] = {1,2,3,5,6,7,8,9};


ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

for(int i=0;i<list.size();i++) {
	
	if(list.get(i)!=(i+1)) {
		
		System.out.println("Missing number is" + " "+(i+1));
		break;
		
	}

}


	
	
	}
	
}
