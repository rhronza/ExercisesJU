package mainpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationCollection {
	
	class PriceForShop {
		private int shopId;
		private float price;
		
		public PriceForShop(int shopId, float price) {
			this.shopId = shopId;
			this.price = price;
		}

		public PriceForShop() {
		}

		public int getShopId() {
			return shopId;
		}

		public float getPrice() {
			return price;
		}

		public void setShopId(int shopId) {
			this.shopId = shopId;
		}

		public void setPrice(float price) {
			this.price = price;
		}

	}
	

	public IterationCollection() {
		
		List<PriceForShop> list1 = new ArrayList();
		
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			PriceForShop priceForShop = (PriceForShop) iterator.next();
			System.out.println("in iteration...");
			
		}
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("in iteration...2");
			
		}

		/* foreach zvládne i null */
		for (PriceForShop priceForShop : list1) {
			System.out.println("in iteration...3");
			
		}
	}

}
