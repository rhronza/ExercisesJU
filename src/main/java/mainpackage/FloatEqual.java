package mainpackage;

public class FloatEqual {

	public FloatEqual() {
		float f1 = 150.00f;
		float f2 = 150.001f;
		float presnost=0.001f;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(Math.abs(f1 -f2));
		
		/* výpočet ekvivalence*/
		System.out.println(Math.abs(f1 -f2)<presnost);

	}

}
