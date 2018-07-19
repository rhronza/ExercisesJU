package mainpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListRhr {

	class PriceInShop {
		float price;
		int shop;

		public PriceInShop(float price, int shop) {
			super();
			this.price = price;
			this.shop = shop;
		}

		public float getPrice() {
			return price;
		}

		public int getShop() {
			return shop;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public void setShop(int shop) {
			this.shop = shop;
		}

		@Override
		public String toString() {
			return "priceInShop [price=" + price + ", shop=" + shop + "]";
		}
	}

	class ShoppingItemForSelection {
		String nameProduct;
		List<PriceInShop> listPrices;

		public ShoppingItemForSelection(String nameProduct, List<PriceInShop> listPrices) {
			super();
			this.nameProduct = nameProduct;
			this.listPrices = listPrices;
		}

		public String getNameProduct() {
			return nameProduct;
		}

		public List<PriceInShop> getListPrices() {
			return listPrices;
		}

		public void setNameProduct(String nameProduct) {
			this.nameProduct = nameProduct;
		}

		public void setListPrices(List<PriceInShop> listPrices) {
			this.listPrices = listPrices;
		}

		@Override
		public String toString() {
			return "ShoppingListForSelection [nameProduct=" + nameProduct + ", listPrices=" + listPrices + "]";
		}

	}

	class ShoppigItemfromWhispere {
		String nameProduct;
		float price;
		int shop;

		public ShoppigItemfromWhispere(String nameProduct, float price, int shop) {
			super();
			this.nameProduct = nameProduct;
			this.price = price;
			this.shop = shop;
		}

		public String getNameProduct() {
			return nameProduct;
		}

		public float getPrice() {
			return price;
		}

		public int getShop() {
			return shop;
		}

		public void setNameProduct(String nameProduct) {
			this.nameProduct = nameProduct;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public void setShop(int shop) {
			this.shop = shop;
		}

		@Override
		public String toString() {
			return "ShoppigItemfromWhispere [nameProduct=" + nameProduct + ", price=" + price + ", shop=" + shop + "]";
		}

	}

	List<ShoppigItemfromWhispere> listInput = new ArrayList<>();
	List<ShoppingItemForSelection> listOutput = new ArrayList<>();
	List<PriceInShop> listPrices = new ArrayList<>();

	public ListRhr() {

		listInput.add(new ShoppigItemfromWhispere("Produkt A", 111f, 5));
		listInput.add(new ShoppigItemfromWhispere("Produkt A", 222f, 6));
		listInput.add(new ShoppigItemfromWhispere("Produkt A", 333f, 7));
		listInput.add(new ShoppigItemfromWhispere("Produkt B", 666f, 5));
		listInput.add(new ShoppigItemfromWhispere("Produkt B", 667f, 7));
		listInput.add(new ShoppigItemfromWhispere("Produkt C", 10f, 0));
		listInput.add(new ShoppigItemfromWhispere("Produkt C", 150f, 0));
		listInput.add(new ShoppigItemfromWhispere("Produkt C", 154f, 0));
		listInput.add(new ShoppigItemfromWhispere("Produkt C", 254f, 0));

		String productBefore = listInput.get(0).getNameProduct();

		for (int i = 0; i < listInput.size(); i++) {
			if (listInput.get(i).getNameProduct().equals(productBefore)) {
				listPrices.add(new PriceInShop(listInput.get(i).getPrice(), listInput.get(i).getShop()));
			} else {
				listOutput.add(new ShoppingItemForSelection(productBefore, listPrices));
				listPrices = new ArrayList<>();
				listPrices.add(new PriceInShop(listInput.get(i).getPrice(), listInput.get(i).getShop()));
			}
			if (i + 1 == listInput.size()) {
				listOutput.add(new ShoppingItemForSelection(listInput.get(i).getNameProduct(), listPrices));
				break;
			}
			productBefore = listInput.get(i).getNameProduct();
		}
		System.out.println("výsledek:");
		for (ShoppingItemForSelection sifs : listOutput) {
			System.out.println(sifs.nameProduct + "," + sifs.getListPrices().toString());

		}

	}

}
