package mainpackage;

public class OptionalParametr {

	public OptionalParametr() {
		metoda(1,2,3);
		metoda(4,5);
	}
	
	
	public void metoda (int p1, int p2, int ... p3) {
		System.out.println("length:"+p3.length+", nultý:"/*+p3[0]*/);
	}
	

}
