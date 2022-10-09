package onlnevideo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List values = new ArrayList();
		
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2, "Saad");
		
		for (int i=0; i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		System.out.println();
		for (Object i : values) // Navin ne o use kia ha
		{
			System.out.println(i);
		}
		
		

	}

}
