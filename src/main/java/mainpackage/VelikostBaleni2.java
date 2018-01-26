package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VelikostBaleni2 {

	class Produkt {

		String name = "";
		float price = 0F; // cena
		String priceUnitString = ""; // cena za jednotku
		float sizeUnitPackage = 0F; // velikost balení
		String unit = ""; // jednotka balení

		public Produkt(String name, float price, String priceUnitString, float sizeUnitPackage, String unit) {
			super();
			this.name = name;
			this.price = price;
			this.priceUnitString = priceUnitString;
			this.sizeUnitPackage = sizeUnitPackage;
			this.unit = unit;
		}

		@Override
		public String toString() {
			return "VelikostBaleni [name=" + name + ", price=" + price + ", priceUnitString=" + priceUnitString + ", sizeUnitPackage=" + sizeUnitPackage + ", unit=" + unit + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getPriceUnitString() {
			return priceUnitString;
		}

		public void setPriceUnitString(String priceUnitString) {
			this.priceUnitString = priceUnitString;
		}

		public float getSizeUnitPackage() {
			return sizeUnitPackage;
		}

		public void setSizeUnitPackage(float sizeUnitPackage) {
			this.sizeUnitPackage = sizeUnitPackage;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

	}

	public VelikostBaleni2(){
		List<Produkt> seznam = new ArrayList<Produkt>();
		seznam.add(new Produkt("Váhala Kuřecí prsa v aspiku 190g", 19.9F, "104,70 Kč / kg" ,0F,""));
		seznam.add(new Produkt("Pstruh uzený (cca 250g)", 57.30F, "229,00 Kč / kg" ,0F,""));
		seznam.add(new Produkt("Purina One Junior s kuřecím a celozrnnými obilovinami 800g", 112.00F, "140,00 Kč / kg" ,0F,""));
		seznam.add(new Produkt("Bohemia Sekt Rosé nealko 750ml", 129.9F, "173,20 Kč / l" ,0F,""));
		seznam.add(new Produkt("Neutrogena Intenzivní regenerační tělové mléko sensitive 400ml", 149.9F, "374,80 Kč / l" ,0F,""));
		seznam.add(new Produkt("Neutrogena Tělové mléko pro suchou pokožku 400ml", 149.90F, "0,40 Kč / ml" ,0F,""));
		seznam.add(new Produkt("Alufix talíř z cukrové třtiny 23cm BIO 12Ks", 55.90F, "4,70 Kč / ks" ,0F,""));
		seznam.add(new Produkt("Alufix talíř z cukrové třtiny 23cm BIO 12Ks", 3.90F, "4,70 Kč / ks" ,0F,""));
		seznam.add(new Produkt("La Lorraine Kobliha s nugátovou náplní mražená 50g/ks", 6.90F, "138,00 Kč / kg" ,0F,""));
		seznam.add(new Produkt("Apetit Kulajda 500ml", 36.90F, "73,80 Kč / l" ,0F,""));
		seznam.add(new Produkt("Euromedia Rozpal to, šéfe! - 91 skvělých grilovacích receptů od snídaně po drinky", 399.00f, "399,00 Kč / ks" ,0F,""));
		seznam.add(new Produkt("Kapří stripsy marinované s obalovací směsí (cca 250g)", 70.00f, "279,90 Kč / kg" ,0F,""));
		seznam.add(new Produkt("Rajčata volná (cca 80g)", 2.40f, "29,90 Kč / kg" ,0F,""));
		seznam.add(new Produkt("Jehněčí kolínko (cca 500g)", 199.50f, "399,00 Kč / kg" ,0F,""));
		
		
		System.out.println();
		for (Produkt produkt:seznam ) {
			
			float cena = produkt.getPrice();
			String cenaJednotkyString = produkt.getPriceUnitString();
			String jednotkaBaleni = cenaJednotkyString.substring(cenaJednotkyString.lastIndexOf("/")+1).trim();
			
			//produkt.setUnit(jednotkaBaleni);
			float cenaJednotky = Float.parseFloat(cenaJednotkyString.substring(0, cenaJednotkyString.lastIndexOf("Kč")).replaceAll(",","."));
			float velikostBaleni = cena / cenaJednotky;
			float velikostBaleniToList = 0f;
			
			// velikost baleni je mensi nez 1
			if (velikostBaleni < 1f){
				if(jednotkaBaleni.equals("kg")) {jednotkaBaleni="g";} 
				if(jednotkaBaleni.equals("l")) {jednotkaBaleni="ml";} 
				if(jednotkaBaleni.equals("ks")) {velikostBaleniToList = 1f;} else velikostBaleniToList = velikostBaleni *1000;
				System.out.print("<0");
			} else velikostBaleniToList = velikostBaleni;
			System.out.print(", "+velikostBaleniToList);
			
			// zaokrouhlovani
			if(jednotkaBaleni.equals("ks")) {
				velikostBaleniToList=Math.round(velikostBaleniToList);
			} else velikostBaleniToList = (Math.round(velikostBaleniToList*100f))/100f;	
			
			// aktulizace velikost baleni a jednotky baleni v listu
			produkt.setSizeUnitPackage(velikostBaleniToList);
			produkt.setUnit(jednotkaBaleni);
			
			System.out.println(produkt.toString()+"("+velikostBaleni+")" );
		}
	}	
 }


