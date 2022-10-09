package onlnevideo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2, 2);
		
	//	Collections.sort(values);
		Collections.reverse(values);
		
		for (int i=0; i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		System.out.println();
		//for (Object i : values) // Navin ne o use kia ha
		// it is still an object (Integer) but now an specific object of integers
		for (Integer i : values)
		{
			System.out.println(i);
		}
		
		

	}

}
