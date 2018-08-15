package mainpackage;

public class Iteration {

	public Iteration() {

		System.out.println("--------------------------------");
		System.out.println(" break");
		System.out.println("--------------------------------");

		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);

		}
		
		System.out.println("--------------------------------");
		System.out.println(" continue");
		System.out.println("--------------------------------");

		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);

		}
	}

}
