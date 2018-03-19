package mainpackage;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArray {
	 int[] units = {1,2,3,4};
	 Integer[] unitsInteger= {1,2,3,4};

	public InArray() {
		boolean contains = IntStream.of(units).anyMatch(x -> x == 5);
		System.out.println(contains);
		contains = IntStream.of(units).anyMatch(b -> b == 3);
		System.out.println(contains);
		contains=Arrays.asList(unitsInteger).contains(3);
		System.out.println(contains);
		
	
	}

}
