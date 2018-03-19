package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class OuterLoopBreakToo {

	List<String> l1 = new ArrayList<String>();
	List<String> l2 = new ArrayList<String>();

	public OuterLoopBreakToo() {

		l1.add("10");
		l1.add("20");
		l1.add("30");
		l1.add("40");

		l2.add("AAA");
		l2.add("BBB");
		l2.add("CCC");

		outerloop: for (String s1 : l1) {
			System.out.println(s1);
			for (String s2 : l2) {
				System.out.println("    " + s2);
				if (s1.equals("30")) {
					// break;
					 break outerloop;
				}
			}
			System.out.println("End of innner loop");

		}

	}

}
