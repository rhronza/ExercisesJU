package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListService {

	class ShoppingItem {
		private Integer pgid;
		private String namePG;
		private Integer productId;
		private String nameProduct;
		private Float price;

		public ShoppingItem(Integer pgid, String namePG, Integer productId, String nameProduct, Float price) {
			super();
			this.pgid = pgid;
			this.namePG = namePG;
			this.productId = productId;
			this.nameProduct = nameProduct;
			this.price = price;
		}

		@Override
		public String toString() {
			return "ShoppingItem [pgid=" + pgid + ", namePG=" + namePG + ", productId=" + productId + ", nameProduct=" + nameProduct + ", price=" + price + "]";
		}

		public Integer getPgid() {
			return pgid;
		}

		public String getNamePG() {
			return namePG;
		}

		public Integer getProductId() {
			return productId;
		}

		public String getNameProduct() {
			return nameProduct;
		}

		public Float getPrice() {
			return price;
		}

		public void setPgid(Integer pgid) {
			this.pgid = pgid;
		}

		public void setNamePG(String namePG) {
			this.namePG = namePG;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public void setNameProduct(String nameProduct) {
			this.nameProduct = nameProduct;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

	}

	class ShoppingIcon {
		private Integer numberOfProduct;
		private Boolean isLarge;
		private Boolean isSelected;
		private ShoppingItem shoppingItem;

		public Integer getNumberOfProduct() {
			return numberOfProduct;
		}

		public Boolean getIsLarge() {
			return isLarge;
		}

		public Boolean getIsSelected() {
			return isSelected;
		}

		public ShoppingItem getShoppingItem() {
			return shoppingItem;
		}

		public void setNumberOfProduct(Integer numberOfProduct) {
			this.numberOfProduct = numberOfProduct;
		}

		public void setIsLarge(Boolean isLarge) {
			this.isLarge = isLarge;
		}

		public void setIsSelected(Boolean isSelected) {
			this.isSelected = isSelected;
		}

		public void setShoppingItem(ShoppingItem shoppingItem) {
			this.shoppingItem = shoppingItem;
		}

		public ShoppingIcon(Integer numberOfProduct, Boolean isLarge, Boolean isSelected, ShoppingItem shoppingItem) {
			super();
			this.numberOfProduct = numberOfProduct;
			this.isLarge = isLarge;
			this.isSelected = isSelected;
			this.shoppingItem = shoppingItem;
		}

		public ShoppingIcon() {
		}

		@Override
		public String toString() {
			return "ShoppingIcon [numberOfProduct=" + numberOfProduct + ", isLarge=" + isLarge + ", isSelected=" + isSelected + ", shoppingItem=" + shoppingItem + "]";
		}

	}

	class ProductGroupToFrontEnd {
		private Integer pgId;
		private String namePG;
		List<ShoppingIcon> shoppingIcons;

		public ProductGroupToFrontEnd(Integer pgid, String namePG, List<ShoppingIcon> shoppingIcons) {
			super();
			this.pgId = pgid;
			this.namePG = namePG;
			this.shoppingIcons = shoppingIcons;
		}

		public Integer getPgId() {
			return pgId;
		}

		public String getNamePG() {
			return namePG;
		}

		public List<ShoppingIcon> getShoppingIcons() {
			return shoppingIcons;
		}

		public void setPgId(Integer pgid) {
			this.pgId = pgid;
		}

		public void setNamePG(String namePG) {
			this.namePG = namePG;
		}

		public void setShoppingIcons(List<ShoppingIcon> shoppingIcons) {
			this.shoppingIcons = shoppingIcons;
		}

		@Override
		public String toString() {
			return "ProductGroup [pgid=" + pgId + ", namePG=" + namePG + ", shoppingIcons=" + shoppingIcons + "]";
		}

	}

	public ShoppingListService() {

		Integer i1 = 88;
		Integer i2 = null;

		if (i1.equals(i2)) {
			System.out.println("se rovnají");
		} else {
			System.out.println("se NErovnají");
		}

		orderedInput();
		// nonOrderedInput();

	}

	private void orderedInput() {

		List<ShoppingItem> shoppingItems = new ArrayList<>();
		List<ProductGroupToFrontEnd> productGroupToFrontEndItems = new ArrayList<>();

		shoppingItems.add(new ShoppingItem(1, "pečivo", 100, "rohlík", 1.9f));
		shoppingItems.add(new ShoppingItem(1, "pečivo", 101, "chléb", 25.60f));
		shoppingItems.add(new ShoppingItem(null, "pečivo", 102, "dalamánek", 5.8f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 103, "jablka", 41.8f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 104, "pomeranče", 38.9f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 105, "jahody", 88.9f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 108, "borůvky", 110.4f));
		shoppingItems.add(new ShoppingItem(3, "pivo", 106, "Pillsner 12st.", 19.9f));
		shoppingItems.add(new ShoppingItem(3, "pivo", 107, "Premier 18st.", 44.7f));
		shoppingItems.add(new ShoppingItem(4, "zelenina", 108, "kapusta", 88.0f));
		shoppingItems.add(new ShoppingItem(null, "", null, "kaviár", 999.91f));
		shoppingItems.add(new ShoppingItem(-1, "", null, "jogurt yoplat Kosik.cz", 1.11f));
		shoppingItems.add(new ShoppingItem(-1, "", 118, "jogurt yoplat itesco.cz", 22.44f));
		shoppingItems.add(new ShoppingItem(-1, "", 120, "cigarety Marlboro", 28.90f));

		Integer lastProductGropupId = null;
		Integer lastProductId = null;

		for (ShoppingItem shoppingItem : shoppingItems) {
			/* alternativa */
			// ProductGroupToFrontEnd productGroupToFrontEndItem = productGroupToFrontEndItems.stream().filter( itr -> itr.getPgid().equals(shoppingItem.getPgid())).findFirst().orElse(null);

			if (shoppingItem.getPgid() != null && shoppingItem.getPgid() > 0 && !shoppingItem.getPgid().equals(lastProductGropupId)) {
				productGroupToFrontEndItems.add(new ProductGroupToFrontEnd(shoppingItem.getPgid(), shoppingItem.getNamePG(), new ArrayList<>()));
			} else if (shoppingItem.getPgid() != null && shoppingItem.getProductId() != null && shoppingItem.getPgid().equals(-1) && !shoppingItem.getProductId().equals(lastProductId)) {
				productGroupToFrontEndItems.add(new ProductGroupToFrontEnd(shoppingItem.getProductId(), shoppingItem.getNameProduct(), new ArrayList<>()));
			}

			productGroupToFrontEndItems.get(productGroupToFrontEndItems.size() - 1).shoppingIcons.add(new ShoppingIcon(1, false, false, shoppingItem));
			lastProductGropupId = shoppingItem.getPgid();
			lastProductId = shoppingItem.getProductId();
		}

		System.out.println("productGroupsToFrontEnd - OrderedInput");
		System.out.println("---------------------------------------------------------------------------------");
		for (ProductGroupToFrontEnd productGroupToFrontEnd : productGroupToFrontEndItems) {
			System.out.println(productGroupToFrontEnd.getPgId() + ", " + productGroupToFrontEnd.getNamePG());
			for (ShoppingIcon shoppingIcon : productGroupToFrontEnd.shoppingIcons) {
				System.out.println("     " + shoppingIcon.toString());

			}
		}

		// System.out.println("");
		// System.out.println("+-------------------------------------------------+");
		// System.out.println("");
		//
		// for (ProductGroup productGroup : productGroups) {
		// System.out.println("productGroup=" + productGroup);
		// }
		//
		//// System.out.println("shoppingItem=" + shoppingItem);
		// Pg pg = new Pg(shoppingItem.pgid ,shoppingItem.nameProduct);
		//// ProductGroup pg = productGroups.stream()
		//// .filter(itr -> itr.pgid == shoppingItem.pgid)
		//// .findFirst()
		//// ;
		// System.out.println(pg.namePG+": "+productGroups.lastIndexOf(pg));
		//
		// if (pg != null) {
		// /* přidat shoppinIcon k poslední productGroup*/
		// //System.out.println(pg.pgid+", "+pg.namePG);
		// //productGroups.get(productGroups.size() - 1).shoppingIcons.add(new ShoppingIcon(25, 16.9f, shoppingItem));
		// } else {
		// /* přidat productGroup k */
		//
		// // productGroups.add
		// }

		/*
		 * class Pg { private Integer pgid; private String namePG; public Pg(Integer pgid, String namePG) { super(); this.pgid = pgid; this.namePG = namePG; }
		 * 
		 * }
		 */

	}

	private void nonOrderedInput() {

		List<ShoppingItem> shoppingItems = new ArrayList<>();
		List<ProductGroupToFrontEnd> productGroupToFrontEndItems = new ArrayList<>();

		shoppingItems.add(new ShoppingItem(1, "pečivo", 100, "rohlík", 1.9f));
		shoppingItems.add(new ShoppingItem(4, "zelenina", 108, "kapusta", 88.0f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 104, "pomeranče", 38.9f));
		shoppingItems.add(new ShoppingItem(null, "pečivo", 102, "dalamánek", 5.8f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 103, "jablka", 41.8f));
		shoppingItems.add(new ShoppingItem(1, "pečivo", 101, "chléb", 25.60f));
		shoppingItems.add(new ShoppingItem(-1, "", 120, "cigarety Marlboro", 28.90f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 105, "jahody", 88.9f));
		shoppingItems.add(new ShoppingItem(2, "ovoce", 108, "borůvky", 110.4f));
		shoppingItems.add(new ShoppingItem(3, "pivo", 106, "Pillsner 12st.", 19.9f));
		shoppingItems.add(new ShoppingItem(3, "pivo", 107, "Premier 18st.", 44.7f));
		shoppingItems.add(new ShoppingItem(null, "", null, "kaviár", 999.91f));
		shoppingItems.add(new ShoppingItem(-1, "", null, "jogurt yoplat Kosik.cz", 1.11f));
		shoppingItems.add(new ShoppingItem(-1, "", 118, "jogurt yoplat itesco.cz", 22.44f));

		Integer lastProductGropupId = null;

		for (ShoppingItem shoppingItem : shoppingItems) {
			System.out.println("start:"+shoppingItem);
			/* alternativa */
			ProductGroupToFrontEnd productGroupToFrontEndItem = productGroupToFrontEndItems.stream().filter(itr -> itr.getPgId().equals(shoppingItem.getPgid())).findFirst().orElse(null);

			System.out.println("finisch finding:"+shoppingItem);

			if (productGroupToFrontEndItem == null) { /* nebyla nalezena produktová skupina */
				productGroupToFrontEndItems.add(new ProductGroupToFrontEnd(shoppingItem.getPgid(), shoppingItem.getNamePG(), new ArrayList<>()));
				lastProductGropupId = (productGroupToFrontEndItems.size() > 0) ? productGroupToFrontEndItems.size() - 1 : 0;
				productGroupToFrontEndItems.get(lastProductGropupId).shoppingIcons.add(new ShoppingIcon(1, false, false, shoppingItem));
			} else if (productGroupToFrontEndItem.getPgId() > -1) { /* byla nalezena produktová skupina a není to produkt, tj id product group > 1 */
				lastProductGropupId = (productGroupToFrontEndItems.size() > 0) ? productGroupToFrontEndItems.size() - 1 : 0;
				/* toto je chybné neboť přidává shopping item po poslední produktivé skupiny, správně by měl přidávat do příslušné produktové skupiny */
				productGroupToFrontEndItems.get(lastProductGropupId).shoppingIcons.add(new ShoppingIcon(1, false, false, shoppingItem));
			} else if (productGroupToFrontEndItem.getPgId() == -1) { /* jedná se o produkt */
				productGroupToFrontEndItems.add(new ProductGroupToFrontEnd(shoppingItem.getPgid(), shoppingItem.getNamePG(), new ArrayList<>()));
				lastProductGropupId = (productGroupToFrontEndItems.size() > 0) ? productGroupToFrontEndItems.size() - 1 : 0;
				productGroupToFrontEndItems.get(lastProductGropupId).shoppingIcons.add(new ShoppingIcon(1, false, false, shoppingItem));
			} else {
				System.out.println("neidentifikovaný stav pro:" + shoppingItem.toString());
			}
			System.out.println("finish:"+shoppingItem);
		}

		System.out.println("productGroupsToFrontEnd - nonOrderedInput");
		System.out.println("---------------------------------------------------------------------------------");
		for (ProductGroupToFrontEnd productGroupToFrontEnd : productGroupToFrontEndItems) {
			System.out.println(productGroupToFrontEnd.getPgId() + ", " + productGroupToFrontEnd.getNamePG());
			for (ShoppingIcon shoppingIcon : productGroupToFrontEnd.shoppingIcons) {
				System.out.println("     " + shoppingIcon.toString());

			}
		}

	}

}
