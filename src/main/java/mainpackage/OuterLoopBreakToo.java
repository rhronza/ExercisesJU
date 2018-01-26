package mainpackage;

public class OuterLoopBreakToo {

	public OuterLoopBreakToo() {
		outerloop: for (int i = 0; i < 5; i++) {
			System.out.println("i:" + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j:" + j);
				if ((i * j) > 6) {
					System.out.println("Breaking");
					break outerloop;
				}
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		System.out.println("Done");
	}

}
