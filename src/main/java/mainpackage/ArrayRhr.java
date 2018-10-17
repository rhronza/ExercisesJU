package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayRhr {

	public ArrayRhr() {
		Integer[] pole;
		
		pole = new Integer[5];
		
		pole[0] = 147;
		pole[1]= 4569;
		pole[3] = 9632;
		System.out.println("velikost pole="+pole.length);
		
		System.out.println("---------------------------------------------------------");
		System.out.println(" (1)");
		System.out.println("---------------------------------------------------------");
		for (Integer integer : pole) {
			System.out.println(integer);
		}
		
		List<Integer> integerItems = new ArrayList<>();
		integerItems.add(new Integer(456));
		integerItems.add(new Integer(852));
		integerItems.add(new Integer(111));
		integerItems.add(new Integer(333));
		
		pole = new Integer[integerItems.size()];
		pole = integerItems.toArray(pole);
		System.out.println("---------------------------------------------------------");
		System.out.println(" (2)");
		System.out.println("---------------------------------------------------------");
		for (Integer integer : pole) {
			System.out.println(integer);
		}
		
		
		System.out.println("---------------------------------------------------------");
		System.out.println(" (3)");
		System.out.println("---------------------------------------------------------");
		pole = new Integer[9];
		for (Integer integer : pole) {
			System.out.println(integer);
		}
	}

}
