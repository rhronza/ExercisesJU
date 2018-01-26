package mainpackage;

import java.util.ArrayList;
import java.util.List;


public class PorovnaniProduktu_0 {

	class ComparerProduct {
		String nameProducts ="";
		float rateParity =0f;
		
		public ComparerProduct(String nameProducts, float rateParity) {
			this.nameProducts = nameProducts;
			this.rateParity = rateParity;
		}
		public String getNameProducts() {
			return nameProducts;
		}
		public void setNameProducts(String nameProducts) {
			this.nameProducts = nameProducts;
		}
		public float getRateParity() {
			return rateParity;
		}
		public void setRateParity(float rateParity) {
			this.rateParity = rateParity;
		}
		@Override
		public String toString() {
			return "ComparerProduct [nameProducts=" + nameProducts + ", rateParity=" + rateParity + "]";
		}
		
	}

	List<ComparerProduct> comparerProducts = new ArrayList<ComparerProduct>();
	String vendorProduct = "Chappi S hovězím a drůbežmí masem kompletní krmivo";

	public PorovnaniProduktu_0() {
		comparerProducts.add(new ComparerProduct("Maso Brejcha Vepřová krkovice bez kosti plátek (cca 600g)", 0f));
		comparerProducts.add(new ComparerProduct("Maso Vepřová Brejcha krkovice bez kosti plátek (cca 600g)",0f));
		comparerProducts.add(new ComparerProduct("Maso Vepřová Brejcha krkovice bez kosti plátek (cca600g)",0f));
		comparerProducts.add(new ComparerProduct("Chappi S hovězím a drůbežmí masem kompletní krmivo pro dospělé psy 10kg",0f));
		comparerProducts.add(new ComparerProduct("Chappi S hovězím a drůbežmí masem kompletní krmivo pro dospělé psy 10 kg",0f));
		comparerProducts.add(new ComparerProduct("Chappi kompletní krmivo pro dospělé psy S hovězím a drůbežmí masem  10 kg",0f));

		
		for (ComparerProduct comparerProduct: comparerProducts) {
			
			
		}
		
	}

}
