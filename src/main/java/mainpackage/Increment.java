package mainpackage;

public class Increment {

	public Increment() {

		int i = 24;
		int j = 24;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		for (int idx = 0; idx < 5; idx++) {
			System.out.println("idx  " + idx);
			System.out.println("i+=  " + (i += idx));
			System.out.println("j=+  " + (j = +idx));
			System.out.println("-------------------");
		}
		System.out.println("=======================================================");
		System.out.println("");
		i = 24;
		j = 24;
		System.out.println("i=" + i);
		System.out.println("j=" + j);

		for (int idx = 0; idx < 5; idx++) {
			System.out.println("idx  " + idx);
			System.out.println("i++  " + (i++));
			System.out.println("++j  " + (++j));
			System.out.println("-------------------");
		}
	}

}
