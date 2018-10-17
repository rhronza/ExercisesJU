package mainpackage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mainpackage2.Combinations.ForSelectionItem;
import mainpackage2.Combinations.ShoppingIcon;
import mainpackage2.Combinations.ShoppingItem;

public class CombinationsShops {

	/* ************************************************************************************************************************************************* */
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
	/* ************************************************************************************************************************************************* */
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
	/* ************************************************************************************************************************************************* */
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

	/* ************************************************************************************************************************************************* */
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

	/* ************************************************************************************************************************************************* */
	Integer[] inputStoneShopsArray = { 1, 2, 3};
	int maxStoneShops = 1;
	Integer inputOnlineShopsArray[] = {};
	int maxOnLineShops = 0;

	List<List<Integer>> resultStoneShops = new ArrayList<>();
	List<List<Integer>> resultOnlineShops = new ArrayList<>();
	List<List<Integer>> resultShopsCombinations = new ArrayList<>();
	List<Integer> resultShopsCombination = new ArrayList<>();
	List<ForSelectionItem> forSelectionItems = new  ArrayList<>();

	boolean[] booleanStoneShops = new boolean[inputStoneShopsArray.length];
	boolean[] booleanOnlineShops = new boolean[inputOnlineShopsArray.length];
	/* ************************************************************************************************************************************************* */

	public CombinationsShops() {
	
		// this.createCombinatins();
		this.findShopInForselectionproductItem();

	}

	/* ============================================================================================================================================================= */
	private void findShopInForselectionproductItem() {
		this.initForSelectionItems();
		List<Integer> inputStoneShopsList  = new ArrayList<>(Arrays.asList(inputStoneShopsArray));
		
		
		for (ForSelectionItem row: forSelectionItems) {
			for( ShoppingIcon si: row.getShoppingIcons()) {
			//	si.shoppingItem.getShopId().
				
			}
		}
		
		
	}
	
	
	
	private List<ForSelectionItem> initForSelectionItems() {
		List<ForSelectionItem> forSelectionItems = new  ArrayList<>();
		forSelectionItems.add(new ForSelectionItem(0, 100, "Produktová skupina 100", new ArrayList<>()));
		forSelectionItems.get(0).getShoppingIcons().add(new ShoppingIcon(0, 1, false, false, new ShoppingItem(100, "Produktová skupina 100", 23456, "Produkt 23456", 10f, 1, 1, 33.50f, 1, "")));
		forSelectionItems.get(0).getShoppingIcons().add(new ShoppingIcon(1, 1, false, false, new ShoppingItem(100, "Produktová skupina 100", 23457, "Produkt 23457", 11f, 1, 6, 121.8f, 1, "")));
		forSelectionItems.get(0).getShoppingIcons().add(new ShoppingIcon(2, 100, false, false, new ShoppingItem(100, "Produktová skupina 100", 23458, "Produkt 23458", 5f, 1, 4, 4.8f, 1, "")));

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
		return forSelectionItems;
	}


	/* ============================================================================================================================================================= */
	private void createCombinatins() {

		System.out.println("");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("resultStoneShops");
		System.out.println("---------------------------------------------------------------------");
		resultStoneShops = this.subset(inputStoneShopsArray, maxStoneShops, 0, 0, booleanStoneShops, resultStoneShops);
		for (List<Integer> list : resultStoneShops) {
			System.out.println(list);
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("počet=" + resultStoneShops.size());

		System.out.println("");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("resultOnlineShops");
		System.out.println("---------------------------------------------------------------------");
		resultOnlineShops = this.subset(inputOnlineShopsArray, maxOnLineShops, 0, 0, booleanOnlineShops, resultOnlineShops);
		for (List<Integer> list : resultOnlineShops) {
			System.out.println(list);
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("počet=" + resultOnlineShops.size());
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Kartézský součin");
		System.out.println("---------------------------------------------------------------------");
		for (List<Integer> combStoneShops : resultStoneShops) {
			for (List<Integer> combOnlineShopShops : resultOnlineShops) {
				for (Integer shops : combStoneShops) {
					resultShopsCombination.add(shops);
				}
				for (Integer shops : combOnlineShopShops) {
					resultShopsCombination.add(shops);
				}
				resultShopsCombinations.add(resultShopsCombination);
				resultShopsCombination = new ArrayList<>();
			}
		}
		for (List<Integer> comb : resultShopsCombinations) {
			System.out.println("   " + comb.toString());
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("počet=" + resultShopsCombinations.size());
	}

	/* ============================================================================================================================================================= */
	private List<List<Integer>> subset(Integer[] shopsArray, int k, int start, int currLen, boolean[] used, List<List<Integer>> resultCombinationList) {

		List<Integer> combination = new ArrayList<>();

		if (currLen == k) {
			for (int i = 0; i < shopsArray.length; i++) {
				if (used[i] == true) {
					// System.out.print(shopsArray[i] + "|");
					combination.add(new Integer(shopsArray[i]));
				}
			}

			// System.out.println();
			// int idx = (combinationList.size()>0)?combinationList.size()-1:0;
			// System.out.println(" idx="+idx);
			// combinationList.get(idx).addAll(combination);
			resultCombinationList.add(combination);
			combination = new ArrayList<>();
			return resultCombinationList;
		}
		if (start == shopsArray.length) {
			return resultCombinationList;
		}
		// For every index we have two options,
		// 1.. Either we select it, means put true in used[] and make currLen+1
		used[start] = true;
		subset(shopsArray, k, start + 1, currLen + 1, used, resultCombinationList);
		// 2.. OR we dont select it, means put false in used[] and dont increase
		// currLen
		used[start] = false;
		subset(shopsArray, k, start + 1, currLen, used, resultCombinationList);
		return resultCombinationList;
	}

}
