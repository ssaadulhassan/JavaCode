package onlnevideo;

public class Boxing {

	public static void main(String[] args) {
		int i = 5;
		Integer ii = new Integer(i); // Boxing - Wrapping
		
		int j = ii.intValue(); // Unboxing - unwrapping
		
		Integer value = i; // Autobxing
		int k = value;	// Auto unboxing
		System.out.println(k);
		
		String strw = "124";
		
		int n = Integer.parseInt(strw); // parsing string value as an integer
		System.out.println(n);
		

	}

}
