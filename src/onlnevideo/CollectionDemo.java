package onlnevideo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection values = new ArrayList();
		
		values.add(4);
		values.add(5);
		values.add(6);
		// Iterator is an Interface. iterator is a method in the interface
		Iterator it = values.iterator();
		
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
