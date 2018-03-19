package mainpackage;

public class SplitString {

	public SplitString() {
		String s = "Coca- Cola   Vanilla 0,5l";
		// String[] poleString = s.split("\\s|-");
		String[] poleString = s.split(" ");
		/* odmezerování? */
		for (String ss : poleString) {
			ss = ss.trim();
		}
		for (String ss : poleString) {
			System.out.println("." + ss + ".");
		}

	}

}
