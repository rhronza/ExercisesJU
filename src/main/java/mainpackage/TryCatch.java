package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class TryCatch {
	
	List<Integer> list = new ArrayList<>();
	
	public TryCatch() {
		iniList();
		// printEvenNumber();
		try {
			callPrintEvenNumber();
		
		} catch (Exception e) {
			System.out.println("Exeption: konstruktor: "+e.getMessage());
		}
	}
	
	
	private void iniList() {
		for(int i = 0; i < 10; i++) {
			this.list.add(i);
		}	
	}
	
	private void printEvenNumber() throws Exception{
		for (Integer integerNumber : list) {
			if(integerNumber % 2 == 0) {
				System.out.println("number "+integerNumber + " is even.");
			} else {
				throw new Exception("printEvenNumber Exception number "+integerNumber + " is NOT even. ");
			}
			
		}
		
	}
	
	private void callPrintEvenNumber() throws Exception{
		try {
			printEvenNumber();
		} catch (Exception e) {
			System.out.println("Exception:"+e.getMessage()+", "+e.getLocalizedMessage()+", "+e.getCause());
			throw new Exception();
		}
	}
	
	
	
	

}
