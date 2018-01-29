package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class PorovnaniProduktu_1 {
	List<ComparerProduct> comparerProducts = new ArrayList<ComparerProduct>();
	
	class ComparerProduct {
		String nameProduct ="";
		float rateParity =0f;
		
		public ComparerProduct(String nameProducts, float rateParity) {
			this.nameProduct = nameProducts;
			this.rateParity = rateParity;
		}
		public String getNameProduct() {
			return nameProduct;
		}
		public void setNameProduct(String nameProducts) {
			this.nameProduct = nameProducts;
		}
		public float getRateParity() {
			return rateParity;
		}
		public void setRateParity(float rateParity) {
			this.rateParity = rateParity;
		}
		@Override
		public String toString() {
			return "[" + nameProduct + ", " + rateParity + "]";
		}
	}	
		
	public PorovnaniProduktu_1() {
		
		/* hledaný PP */
		//String vendorProduct = "Chappi S hovězím a drůbežmí masem kompletní krmivo pro dospělé psy 10kg";
		//String vendorProduct = "G&G Cat kapsičky s jemným mase v omáčce 8x100g";
		//String vendorProduct = "G&G Cat kapsičky s jemným mase v omáčce";
		//String vendorProduct = "papírový kapesník 4";
		//String vendorProduct = "krmivo pro dospělé";
		//String vendorProduct = "G&G cca 8 x 100g Cat kapsičky s jemným mase v omáčce ";
		String vendorProduct = "dětské kapsičky";
	
		comparerProducts.add(new ComparerProduct("Maso Brejcha Vepřová krkovice bez kosti plátek (cca 600g)", 0f));
		comparerProducts.add(new ComparerProduct("Maso Vepřová Brejcha krkovice bez kosti plátek (cca 600g)",0f));
		comparerProducts.add(new ComparerProduct("Maso Vepřová Brejcha krkovice bez kosti plátek (cca600g)",0f));
		comparerProducts.add(new ComparerProduct("Chappi krmivo pro dospělé S hovězím a drůbežmí masem kompletní psy 10kg",0f));		
		comparerProducts.add(new ComparerProduct("Chappi S hovězím a drůbežmí masem kompletní krmivo pro dospělé psy 10kg",0f));
		comparerProducts.add(new ComparerProduct("Chappi S hovězím a drůbežmí masem kompletní krmivo ",0f));
		comparerProducts.add(new ComparerProduct("G&G Cat kapsičky s jemným mase v omáčce 8x100g",0f));
		comparerProducts.add(new ComparerProduct("G&G Cat kapsičky s jemným mase v omáčce 8 x 100g",0f));
		comparerProducts.add(new ComparerProduct("G&G Cat kapsičky s jemným mase v omáčce 8 * 100g",0f));
		comparerProducts.add(new ComparerProduct("G&G Cat kapsičky s jemným mase v omáčce 8*100g",0f));
		comparerProducts.add(new ComparerProduct("Pomelo červené (cca 800g)",0f));
		comparerProducts.add(new ComparerProduct("Pomelo červené (cca800g )",0f));
		comparerProducts.add(new ComparerProduct("Pomelo červené ( cca 800g )",0f));
		comparerProducts.add(new ComparerProduct("kapesník papírový",0f));
		//comparerProducts.add(new ComparerProduct("papírový kapesník ",0f));
		
		/* ----------------- volání porovnání   ---------------------------- */
      	 int idx = getIdComparerProduct(comparerProducts, vendorProduct,12);
		/* ----------------------------------------------------------------- */
		
		System.out.println("PP:"+vendorProduct+", "+idx+"\n\n");
		
		for (int i = 0; i<comparerProducts.size(); i++) {
			System.out.println(i+", "+comparerProducts.get(i).getNameProduct()+", "+comparerProducts.get(i).getRateParity());
		}

	}
	
	/* Určuje id Produktu srovnávače, dle zadaného názvu Produktu prodejce na základě porovnání názvů PS a PP.
	 * Pokud není zadán nepovinný parametr "minimální shoda" pak se vrací Id productu s nejvyšší shodou (bez ohledu na hodnotu)
	 * pokud je zadán nepovinný parametr, pak se vrací producId nejvyšší shody názvů a 
	 * zároveň vyšší shody než je zadaná minimální úroveň shody 
	 */
	public int getIdComparerProduct(List<ComparerProduct> comparerProducts, String vendorProduct , int ... inputMinRateParity /* nepovinný parametr*/ ) {
		
		int minRateParity = 0;
		
		if (inputMinRateParity.length>0) {
			minRateParity=inputMinRateParity[0];
		}
		
		List<Float> comparerProductParity = new ArrayList<Float>();
		
		String[] longerArrayString = {""};
		String[] shorterArrayString = {""};
		String vendorProductLowercase = vendorProduct.toLowerCase();
		int lengthVendorProduct = vendorProductLowercase.length();
		float baseRateParity, currentComparerProductRateParity =0f;
		int indexRateParity = 0; // počet shod připorovnání slov jednoho PP a jednoho PS
	
		float maxAchivedRateParity = 0f; // maximální dosažená shoda
		int indexMaxRateParity = -1; // index řádku s maximální shodou s PP a PS
		
		for (int idx =0; idx <comparerProducts.size(); idx ++) {

			if (lengthVendorProduct>comparerProducts.get(idx).getNameProduct().length()) {
				longerArrayString = vendorProduct.toLowerCase().split(" ");
				shorterArrayString = comparerProducts.get(idx).getNameProduct().toLowerCase().split(" ");
			} else {
				longerArrayString = comparerProducts.get(idx).getNameProduct().toLowerCase().split(" ");
				shorterArrayString = vendorProduct.toLowerCase().split(" ");
			}
			baseRateParity = (float) longerArrayString.length;
			indexRateParity = 0;
			
			for (String wordLoSt:longerArrayString) {
				for (String wordShSt: shorterArrayString) {
					//System.out.println(wordLoSt+", "+wordShSt);
					if (wordLoSt.equals(wordShSt)) {
						//System.out.println(wordLoSt+", "+wordShSt);
						indexRateParity++;
					}
				}
			}
			
			currentComparerProductRateParity = ((float) indexRateParity)/ baseRateParity;
			if (currentComparerProductRateParity>maxAchivedRateParity) {
				maxAchivedRateParity = currentComparerProductRateParity;
				indexMaxRateParity = idx;
			}
			comparerProducts.get(idx).setRateParity(currentComparerProductRateParity);
		}
		
		if ((maxAchivedRateParity*100)<minRateParity) {
			/* nebylo dosaženo minimální požadované shody */
			indexMaxRateParity = -1; 
		}
		return indexMaxRateParity;
		
	}

}

