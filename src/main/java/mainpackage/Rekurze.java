package mainpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Rekurze {
	
	List<Zamestnanec> zamestnanci = new ArrayList<Zamestnanec >();
	List<Schuzka> schuzka = new ArrayList<Schuzka>();

	public Rekurze() {
		Calendar hronzaDatumNarozeni = Calendar.getInstance();		
		hronzaDatumNarozeni.set(1964, 9, 21);
		Calendar karasovaDatumNarozeni = Calendar.getInstance();	
		karasovaDatumNarozeni.set(1965, 12, 29);
		Calendar mrazDatumNarozeni = Calendar.getInstance();		
		mrazDatumNarozeni.set(2011, 1, 11);		
		zamestnanci.add(new Zamestnanec("Hronza", hronzaDatumNarozeni));
		zamestnanci.add(new Zamestnanec("Karasová", karasovaDatumNarozeni));
		zamestnanci.add(new Zamestnanec("Mráz", mrazDatumNarozeni));
	}
	
	public void vypisZamestnance(int idx ) {
		
		/* nefunguje to správně !!! */
		
		System.out.println(zamestnanci.get(idx).toString());
		for (int i = 0; i<10; i++) {
			vypisZamestnance(i);
		}
		
	}
	
	class Zamestnanec {
		private String jmeno;
		private Calendar datumNarozeni;
		
		public Zamestnanec(String jmeno, Calendar datumNarozeni) {
			this.jmeno = jmeno;
			this.datumNarozeni = datumNarozeni;
		}
		public String getJmeno() {
			return jmeno;
		}
		public void setJmeno(String jmeno) {
			this.jmeno = jmeno;
		}
		public Calendar getDatumNarozeni() {
			return datumNarozeni;
		}
		public void setDatumNarozeni(Calendar datumNarozeni) {
			this.datumNarozeni = datumNarozeni;
		}
		@Override
		public String toString() {
			return "Zamestnanec [jmeno=" + jmeno + ", datumNarozeni=" + datumNarozeni + "]";
		}
		
	}
	
	class Schuzka {
		private Calendar datumCas;
		private String popisObsahuScuzky;
		public Calendar getDatumCas() {
			return datumCas;
		}
		public void setDatumCas(Calendar datumCas) {
			this.datumCas = datumCas;
		}
		public String getPopisObsahuScuzky() {
			return popisObsahuScuzky;
		}
		public void setPopisObsahuScuzky(String popisObsahuScuzky) {
			this.popisObsahuScuzky = popisObsahuScuzky;
		}
		
	}

}
