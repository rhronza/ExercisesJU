package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class PorovnaniProduktu_1 {
	
	
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
		List<ComparerProduct> comparerProducts = new ArrayList<ComparerProduct>();
		/* hledaný PP */
		//String vendorProduct = "Chappi S hovězím a drůbežmí masem kompletní krmivo pro dospělé psy 10kg";
		//String vendorProduct = "G&G Cat kapsičky s jemným mase v omáčce 8x100g";
		//String vendorProduct = "G&G Cat kapsičky s jemným mase v omáčce";
		String vendorProduct = "papírový kapesník";
		//String vendorProduct = "G&G 8x100g Cat kapsičky s jemným mase v omáčce ";
	
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
		comparerProducts.add(new ComparerProduct("papírový kapesník ",0f));
		
		String[] longerArrayString = {""};
		String[] shorterArrayString = {""};
		String vendorProductLowercase = vendorProduct.toLowerCase();
		int lengthVendorProduct = vendorProductLowercase.length();
		float baseRateParity, currentComparerProductRateParity =0f;
		int indexRateParity = 0; // počet shod připorovnání slov jednoho PP a jednoho PS
	
		float maxRateParity = 0f; // maximální shod
		int indexMaxRateParity = 0; // index řádku s maximální shodou s PP a PS
		
		System.out.println("PP:"+vendorProduct+"\n");
		
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
			if (currentComparerProductRateParity>maxRateParity) {
				maxRateParity = currentComparerProductRateParity;
				indexMaxRateParity = idx;
			}
			comparerProducts.get(idx).setRateParity(currentComparerProductRateParity);
			System.out.println(comparerProducts.get(idx).toString());
		}
			
		System.out.println("\nNejvyšší shoda "+maxRateParity+": "+comparerProducts.get(indexMaxRateParity));


	
		
	}

}

