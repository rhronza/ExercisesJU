package mainpackage;

public class CallingFunctionParametr {

	public CallingFunctionParametr() {
		String r1 ="A";
		Float f1=2.0F;
		metoda(r1);
		System.out.println(r1);
		
		metoda2(f1);
		System.out.println(f1);
		
		AAA a1 = new AAA("A1", 741.12F, 896.41f);
		System.out.println(a1);
		metoda3(a1);
		System.out.println(a1);
		
		
	}
	
	public void metoda(String r2) {
		r2="B";
	} 
	public void metoda2(Float f2) {
		f2=222.22F;
	} 
 	public void metoda3(AAA a) {
		a.setR1("ZZZ");
		a.setFloatNumber(951.12F);
		a.setF(753.89f);
	} 
 	
 	class AAA {
		String r1 ="AAArtz";
		Float floatNumber = 123.23F;
		float f = 4565.56f;
		
		
		public AAA(String r1, Float floatNumber, float f) {
			this.r1 = r1;
			this.floatNumber = floatNumber;
			this.f = f;
		}
		public String getR1() {
			return r1;
		}
		public Float getFloatNumber() {
			return floatNumber;
		}
		public float getF() {
			return f;
		}
		public void setR1(String r1) {
			this.r1 = r1;
		}
		public void setFloatNumber(Float floatNumber) {
			this.floatNumber = floatNumber;
		}
		public void setF(float f) {
			this.f = f;
		}
		@Override
		public String toString() {
			return "AAA [r1=" + r1 + ", floatNumber=" + floatNumber + ", f=" + f + "]";
		}
		
	}

}
