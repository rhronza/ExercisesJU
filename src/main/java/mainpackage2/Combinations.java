package mainpackage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Combinations {

	class ForSelectionItem {
		private Integer idRow;
		private Integer productGroupId;
		private String nameProductGroup;
		private List<ShoppingIcon> shoppingIcons;

		public ForSelectionItem(Integer idRow, Integer productGroupId, String nameProductGroup, List<ShoppingIcon> shoppingIcons) {
			super();
			this.idRow = idRow;
			this.productGroupId = productGroupId;
			this.nameProductGroup = nameProductGroup;
			this.shoppingIcons = shoppingIcons;
		}

		public Integer getIdRow() {
			return idRow;
		}

		public Integer getProductGroupId() {
			return productGroupId;
		}

		public String getNameProductGroup() {
			return nameProductGroup;
		}

		public List<ShoppingIcon> getShoppingIcons() {
			return shoppingIcons;
		}

		public void setIdRow(Integer idRow) {
			this.idRow = idRow;
		}

		public void setProductGroupId(Integer productGroupId) {
			this.productGroupId = productGroupId;
		}

		public void setNameProductGroup(String nameProductGroup) {
			this.nameProductGroup = nameProductGroup;
		}

		public void setShoppingIcons(List<ShoppingIcon> shoppingIcons) {
			this.shoppingIcons = shoppingIcons;
		}

		@Override
		public String toString() {
			return "ForSelectionItem [idRow=" + idRow + ", productGroupId=" + productGroupId + ", nameProductGroup=" + nameProductGroup + ", shoppingIcons=" + shoppingIcons + "]";
		}

	}

	/**
	 * @author roman
	 *
	 */
	class ShoppingIcon {
		private Integer idCol;
		private Integer numberOFProducts;
		private Boolean isItemSelected;
		private Boolean isLarge;
		private ShoppingItem shoppingItem;

		public ShoppingIcon(Integer idCol, Integer numberOFProducts, Boolean isItemSelected, Boolean isLarge, ShoppingItem shoppingItem) {
			this.idCol = idCol;
			this.numberOFProducts = numberOFProducts;
			this.isItemSelected = isItemSelected;
			this.isLarge = isLarge;
			this.shoppingItem = shoppingItem;
		}

		public Integer getIdCol() {
			return idCol;
		}

		public Integer getNumberOFProducts() {
			return numberOFProducts;
		}

		public Boolean getIsItemSelected() {
			return isItemSelected;
		}

		public Boolean getIsLarge() {
			return isLarge;
		}

		public ShoppingItem getShoppingItem() {
			return shoppingItem;
		}

		public void setIdCol(Integer idCol) {
			this.idCol = idCol;
		}

		public void setNumberOFProducts(Integer numberOFProducts) {
			this.numberOFProducts = numberOFProducts;
		}

		public void setIsItemSelected(Boolean isItemSelected) {
			this.isItemSelected = isItemSelected;
		}

		public void setIsLarge(Boolean isLarge) {
			this.isLarge = isLarge;
		}

		public void setShoppingItem(ShoppingItem shoppingItem) {
			this.shoppingItem = shoppingItem;
		}

		@Override
		public String toString() {
			return "ShoppingIcon [idCol=" + idCol + ", numberOFProducts=" + numberOFProducts + ", isItemSelected=" + isItemSelected + ", isLarge=" + isLarge + ", shoppingItem=" + shoppingItem + "]";
		}

	}

	/**
	 * @author roman
	 *
	 */
	class ShoppingItem {
		private Integer productGroupId;
		private String nameProductGroup;
		private Integer productId;
		private String nameProduct;
		private Float volume;
		private Integer volumeUnitId;
		private Integer shopId;
		private Float price;
		private Integer unitId;
		private String imageUrl;

		public ShoppingItem(Integer productGroupId, String nameProductGroup, Integer productId, String nameProduct, Float volume, Integer volumeUnitId, Integer shopId, Float price, Integer unitId, String imageUrl) {
			super();
			this.productGroupId = productGroupId;
			this.nameProductGroup = nameProductGroup;
			this.productId = productId;
			this.nameProduct = nameProduct;
			this.volume = volume;
			this.volumeUnitId = volumeUnitId;
			this.shopId = shopId;
			this.price = price;
			this.unitId = unitId;
			this.imageUrl = imageUrl;
		}

		public Integer getProductGroupId() {
			return productGroupId;
		}

		public String getNameProductGroup() {
			return nameProductGroup;
		}

		public Integer getProductId() {
			return productId;
		}

		public String getNameProduct() {
			return nameProduct;
		}

		public Float getVolume() {
			return volume;
		}

		public Integer getVolumeUnitId() {
			return volumeUnitId;
		}

		public Integer getShopId() {
			return shopId;
		}

		public Float getPrice() {
			return price;
		}

		public Integer getUnitId() {
			return unitId;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setProductGroupId(Integer productGroupId) {
			this.productGroupId = productGroupId;
		}

		public void setNameProductGroup(String nameProductGroup) {
			this.nameProductGroup = nameProductGroup;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public void setNameProduct(String nameProduct) {
			this.nameProduct = nameProduct;
		}

		public void setVolume(Float volume) {
			this.volume = volume;
		}

		public void setVolumeUnitId(Integer volumeUnitId) {
			this.volumeUnitId = volumeUnitId;
		}

		public void setShopId(Integer shopId) {
			this.shopId = shopId;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public void setUnitId(Integer unitId) {
			this.unitId = unitId;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		@Override
		public String toString() {
			return "ShoppingItem [productGroupId=" + productGroupId + ", nameProductGroup=" + nameProductGroup + ", productId=" + productId + ", nameProduct=" + nameProduct + ", volume=" + volume + ", volumeUnitId=" + volumeUnitId
					+ ", shopId=" + shopId + ", price=" + price + ", unitId=" + unitId + ", imageUrl=" + imageUrl + "]";
		}
	}

	class Coordinates {
		private Integer r;
		private Integer c;

		public Integer getR() {
			return r;
		}

		public Integer getC() {
			return c;
		}

		public void setR(Integer r) {
			this.r = r;
		}

		public void setC(Integer c) {
			this.c = c;
		}

		public Coordinates(Integer r, Integer c) {
			this.r = r;
			this.c = c;
		}

		@Override
		public String toString() {
			return ("(" + r + "," + c + ")");
		}
	}

	List<List<String>> inputLists = new ArrayList<>();
	List<String> listChar = new ArrayList<>();
	List<String> result = new ArrayList<>();

	List<ForSelectionItem> forSelectionItems = new ArrayList<>();

	List<List<Coordinates>> coordinatesCombinationResult = new ArrayList();

	int order = 0;

	public Combinations() {

		/* ----------------------------------------------------------------------------- */
		/* Zdrojem je List<List<Character>>, výsledek do List<String> */
		/* ----------------------------------------------------------------------------- */
//		 this.initExampleValues();
//		 String EmptyString = "";
//		 this.GeneratePermutations(inputLists, result, 0, EmptyString);
//		
//		 System.out.println("----------------------------------------------------------------");
//		 System.out.println("KOMBINACE/PERMUTACE:");
//		 System.out.println("----------------------------------------------------------------");
//		 int i = 1;
//		 for (String s : result) {
//		 System.out.println("i=" + i + ": " + s);
//		 i++;
//		 }
//		 System.out.println("----------------------------------------------------------------");
//		 System.out.println("počet kombinací=" + result.size());

		/* ----------------------------------------------------------------------------- */
		/* Zdrojem je ForSelectionItems, výsledek do Stringu */
		/* ----------------------------------------------------------------------------- */
		this.initForSelectionItems();
		String EmptyString = "";
		this.GeneratePermutationsForSelectionItems(forSelectionItems, result, 0, EmptyString);
		System.out.println("----------------------------------------------------------------");
		System.out.println("KOMBINACE/PERMUTACE:");
		System.out.println("----------------------------------------------------------------");
		int i = 1;
		
		List<Coordinates> cheapestPurchaseCoordinates = new ArrayList<>();
		List<Coordinates> currentPurchaseCoordinates  = new ArrayList<>();
		Float cheapestPurchase = null; 
		float currentPurchase; 
		
		for (String s : result) {
			System.out.println(" " + "i=" + i + ": " + s);
			String[] cellCoordinatesExtrated = s.split("\\|");
			/* iterace koordinát */
			currentPurchaseCoordinates.clear();
			currentPurchase = 0f;
			for (String cellCoordinates : cellCoordinatesExtrated) {
				String[] cellCoordinatesSplited = cellCoordinates.split(" ");
				int row = Integer.parseInt(cellCoordinatesSplited[0]);
				int col = Integer.parseInt(cellCoordinatesSplited[1]);
				currentPurchaseCoordinates.add(new Coordinates(row, col));
				currentPurchase = currentPurchase + forSelectionItems.get(row).getShoppingIcons().get(col).numberOFProducts.floatValue() * forSelectionItems.get(row).getShoppingIcons().get(col).shoppingItem.getPrice();
			}
			if (cheapestPurchase == null || currentPurchase < cheapestPurchase) {
				cheapestPurchase = currentPurchase;
				cheapestPurchaseCoordinates.clear();
				cheapestPurchaseCoordinates.addAll(currentPurchaseCoordinates);
			} 
			i++;
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("počet kombinací=" + result.size());
    	System.out.println("");
    	System.out.println("Nejlevnější nákup= "+cheapestPurchase+" Kč");
    	i=1;
		for (Coordinates coordinates : cheapestPurchaseCoordinates) {
			System.out.println(i+":"+forSelectionItems.get(coordinates.getR()).getShoppingIcons().get(coordinates.getC()).toString());
		}
		

		/* ----------------------------------------------------------------------------- */
		/* Zdrojem je ForSelectionItems, výsledek do Coordinates */
		/* ----------------------------------------------------------------------------- */

		// this.initForSelectionItems();
		// List<Coordinates> currentCoordinatesList = new ArrayList<>();
		// this.GeneratePermutationsForSelectionItemsToCoordinates(forSelectionItems, coordinatesCombinationResult, 0, currentCoordinatesList);
		// System.out.println("----------------------------------------------------------------");
		// System.out.println("KOMBINACE/PERMUTACE:");
		// System.out.println("----------------------------------------------------------------");
		// int i=1;
		// for (List<Coordinates> coor : coordinatesCombinationResult) {
		// System.out.println("-------------------------------------");
		// System.out.println("i="+i);
		// System.out.println("-------------------------------------");
		// for (Coordinates coordinates : coor) {
		// System.out.println(" "+coordinates.toString());
		// }
		// System.out.println("-------------------------------------");
		// i++;
		// }
		// System.out.println("----------------------------------------------------------------");
		// System.out.println("počet kombinací="+coordinatesCombinationResult.size());

	}

	private void GeneratePermutations(List<List<String>> Lists, List<String> result, int depth, String current)
	/* depth ovlivňuje počet políček tvořících permutaci, pokud depth = 1, pak začíná od druhého řádku a počet je snížen */

	{
		this.order++;
		System.out.println("");
		System.out.println("+--------------------------------------------------------------------------");
		System.out.println("| Začátek chodu: " + this.order);
		System.out.println("+--------------------------------------------------------------------------");
		System.out.println("size=" + Lists.size() + ", depth=" + depth);
		if (depth == Lists.size()) {
			System.out.println("!!!! je rovno !!!!!");
			System.out.println("current=" + current);
			System.out.println("result před přidáním current=" + result.toString());
			result.add(current);
			System.out.println("result po přidání current   =" + result.toString());
			return;
		} else {
			System.out.println("není rovno");
		}
		System.out.println("před cyklem Lists.get(depth).size()=" + Lists.get(depth).size());
		for (int idx = 0; idx < Lists.get(depth).size(); ++idx) {

			System.out.println("");
			System.out.println("idx=" + idx);
			System.out.println("parametry rekurzivního volání procedury:");
			System.out.println("                     result =" + result.toString());
			System.out.println("                      depth =" + (depth + 1));
			System.out.println("                    current =" + current + "|" + Lists.get(depth).get(idx));
			GeneratePermutations(Lists, result, depth + 1, current + "|" + Lists.get(depth).get(idx));
		}
	}

	private void GeneratePermutationsForSelectionItems(List<ForSelectionItem> Lists, List<String> result, int depth, String current)
	/* depth ovlivňuje počet políček tvořících permutaci, pokud depth = 1, pak začíná od druhého řádku a počet je snížen */
	{
		this.order++;
		System.out.println("");
		System.out.println("+--------------------------------------------------------------------------");
		System.out.println("| Začátek chodu: " + this.order);
		System.out.println("+--------------------------------------------------------------------------");
		System.out.println("size=" + Lists.size() + ", depth=" + depth);
		if (depth == Lists.size()) {
			System.out.println("!!!! je rovno !!!!!");
			System.out.println("current=" + current);
			System.out.println("result před přidáním current=" + result.toString());
			result.add(current);
			System.out.println("result po přidání current   =" + result.toString());
			return;
		}
		System.out.println("před cyklem Lists.get(depth).getShoppingIcons().size()=" + Lists.get(depth).getShoppingIcons().size());
		for (int idx = 0; idx < Lists.get(depth).getShoppingIcons().size(); ++idx) {

			System.out.println("");
			System.out.println("idx=" + idx);
			System.out.println("parametry rekurzivního volání procedury:");
			System.out.println("                     result =" + result.toString());
			System.out.println("                      depth =" + (depth + 1));
			System.out.println("                    current =" + current + Lists.get(depth).getIdRow() + " " + Lists.get(depth).getShoppingIcons().get(idx).getIdCol() + "  ");
			GeneratePermutationsForSelectionItems(Lists, result, depth + 1, current + Lists.get(depth).getIdRow() + " " + Lists.get(depth).getShoppingIcons().get(idx).getIdCol() + "|");

		}
	}

	/* ******************************** */
	/* NEFUNGUJE SPRÁVNĚ !!! */
	/* ******************************** */
	private void GeneratePermutationsForSelectionItemsToCoordinates(List<ForSelectionItem> Lists, List<List<Coordinates>> result, int depth, List<Coordinates> currentList)
	/* depth ovlivňuje počet políček tvořících permutaci, pokud depth = 1, pak začíná od druhého řádku a počet je snížen */
	{
		this.order++;
		System.out.println("");
		System.out.println("+--------------------------------------------------------------------------");
		System.out.println("| Začátek chodu: " + this.order);
		System.out.println("+--------------------------------------------------------------------------");
		System.out.println("size=" + Lists.size() + ", depth=" + depth);
		;
		if (depth == Lists.size()) {
			System.out.println("!!!! je rovno !!!!!");
			System.out.println("currentList=" + currentList);
			System.out.println("result před přidáním currentListu=" + result.toString());
			result.add(currentList);
			System.out.println("result po přidání currentListu   =" + result.toString());
			// currentList.clear();
			return;
		}
		System.out.println("před cyklem Lists.get(depth).getShoppingIcons().size()=" + Lists.get(depth).getShoppingIcons().size());
		for (int idx = 0; idx < Lists.get(depth).getShoppingIcons().size(); ++idx) {

			// currentList.add(new Coordinates(, ));

			System.out.println("");
			System.out.println("idx=" + idx);
			System.out.println("parametry rekurzivního volání procedury:");
			System.out.println("                     result =" + result.toString());
			System.out.println("                      depth =" + (depth + 1));
			System.out.println("                currentList =" + currentList);
			GeneratePermutationsForSelectionItemsToCoordinates(Lists, result, depth + 1, addToListReturnList(currentList, Lists.get(depth).getIdRow(), Lists.get(depth).getShoppingIcons().get(idx).getIdCol()));

		}
	}

	private List<Coordinates> addToListReturnList(List<Coordinates> list, Integer r, Integer c) {
		list.add(new Coordinates(r, c));
		return list;
	}

	private void initForSelectionItems() {
		forSelectionItems.add(new ForSelectionItem(0, 100, "Produktová skupina 100", new ArrayList<>()));
		forSelectionItems.get(0).getShoppingIcons().add(new ShoppingIcon(0, 1, false, false, new ShoppingItem(100, "Produktová skupina 100", 23456, "Produkt 23456", 10f, 1, 1, 33.50f, 1, "")));
		forSelectionItems.get(0).getShoppingIcons().add(new ShoppingIcon(1, 1, false, false, new ShoppingItem(100, "Produktová skupina 100", 23457, "Produkt 23457", 11f, 1, 1, 121.8f, 1, "")));
		forSelectionItems.get(0).getShoppingIcons().add(new ShoppingIcon(2, 3, false, false, new ShoppingItem(100, "Produktová skupina 100", 23458, "Produkt 23458", 5f, 1, 1, 4.8f, 1, "")));

		forSelectionItems.add(new ForSelectionItem(1, 101, "Produktová skupina 101", new ArrayList<>()));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(0, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 33567, "Produkt 33567", 10f, 1, 1, 33.50f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(1, 2, false, false, new ShoppingItem(101, "Produktová skupina 101", 33560, "Produkt 33560", 11f, 1, 1, 11.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(2, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 33564, "Produkt 33564", 50f, 1, 1, 72.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(3, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 33542, "Produkt 33542", 25f, 1, 1, 73.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(4, 2, false, false, new ShoppingItem(101, "Produktová skupina 101", 33528, "Produkt 33528", 39f, 1, 1, 6.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(5, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 11165, "Produkt 11165", 87f, 1, 1, 95.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(6, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 11164, "Produkt 11165", 87f, 1, 1, 95.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(7, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 11163, "Produkt 11165", 87f, 1, 1, 95.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(8, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 11162, "Produkt 11165", 87f, 1, 1, 95.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(9, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 11161, "Produkt 11165", 87f, 1, 1, 95.8f, 1, "")));
		forSelectionItems.get(1).getShoppingIcons().add(new ShoppingIcon(10, 1, false, false, new ShoppingItem(101, "Produktová skupina 101", 11167, "Produkt 11165", 87f, 1, 1, 95.8f, 1, "")));

		forSelectionItems.add(new ForSelectionItem(2, 102, "Produktová skupina 102", new ArrayList<>()));
		forSelectionItems.get(2).getShoppingIcons().add(new ShoppingIcon(0, 1, false, false, new ShoppingItem(102, "Produktová skupina 102", 77567, "Produkt 77567", 10f, 1, 1, 33.50f, 1, "")));
		forSelectionItems.get(2).getShoppingIcons().add(new ShoppingIcon(1, 1, false, false, new ShoppingItem(102, "Produktová skupina 102", 77560, "Produkt 77560", 11f, 1, 1, 11.8f, 1, "")));
		forSelectionItems.get(2).getShoppingIcons().add(new ShoppingIcon(2, 1, false, false, new ShoppingItem(102, "Produktová skupina 102", 77564, "Produkt 77564", 50f, 1, 1, 72.8f, 1, "")));
		forSelectionItems.get(2).getShoppingIcons().add(new ShoppingIcon(3, 1, false, false, new ShoppingItem(102, "Produktová skupina 102", 77542, "Produkt 77542", 25f, 1, 1, 73.8f, 1, "")));
		forSelectionItems.get(2).getShoppingIcons().add(new ShoppingIcon(4, 2, false, false, new ShoppingItem(102, "Produktová skupina 102", 77528, "Produkt 77528", 39f, 1, 1, 3.8f, 1, "")));
		forSelectionItems.get(2).getShoppingIcons().add(new ShoppingIcon(5, 1, false, false, new ShoppingItem(102, "Produktová skupina 102", 77565, "Produkt 77565", 87f, 1, 1, 195.8f, 1, "")));

		forSelectionItems.add(new ForSelectionItem(3, 111, "Produktová skupina 111", new ArrayList<>()));
		forSelectionItems.get(3).getShoppingIcons().add(new ShoppingIcon(0, 5, false, false, new ShoppingItem(111, "Produktová skupina 111", 877542, "Produkt 877542", 25f, 1, 1, 2.8f, 1, "")));
		forSelectionItems.get(3).getShoppingIcons().add(new ShoppingIcon(1, 1, false, false, new ShoppingItem(111, "Produktová skupina 111", 877565, "Produkt 877565", 87f, 1, 1, 333.8f, 1, "")));
		int combinationExpected = 1;
		System.out.println("------------------------------------------------------------");
		System.out.println("forSelectionItems:");
		System.out.println("------------------------------------------------------------");
		for (ForSelectionItem forSelectionItem : forSelectionItems) {
			System.out.println(forSelectionItem.toString());
			combinationExpected = combinationExpected * forSelectionItem.getShoppingIcons().size();
			for (ShoppingIcon si : forSelectionItem.getShoppingIcons()) {
				System.out.println("   " + si.toString());
			}
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("očekáváno kombinací:" + combinationExpected);

	}

	private void initExampleValues() {
		listChar.add("a");
		listChar.add("b");
		listChar.add("c");
		listChar.add("d");
		listChar.add("e");
		inputLists.add(listChar);

		listChar = new ArrayList<>();
		listChar.add("MM");
		listChar.add("n");
		inputLists.add(listChar);

		listChar = new ArrayList<>();
		listChar.add("k");
		listChar.add("l");
		listChar.add("w");
		inputLists.add(listChar);

		listChar = new ArrayList<>();
		listChar.add("1");
		listChar.add("2");
		listChar.add("3");
		listChar.add("4");
		listChar.add("5");
		listChar.add("6");

		inputLists.add(listChar);
		listChar = new ArrayList<>();
		inputLists.add(listChar);

		System.out.println("----------------------------------------------------------------");
		for (List<String> list : inputLists) {
			System.out.println(list);

		}
		System.out.println("----------------------------------------------------------------");
	}

}
