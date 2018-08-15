package mainpackage.bills;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
// TAK TUTO NE : import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Bill {

	/* pdfBox classes: */
	private PDFParser pdfParser;
	private PDFTextStripper pdfTextStripper;
	private PDDocument pdDoc = null;
	private COSDocument cosDoc = null;;

	/* seznam účtenek */
	private List<String> billsNameFiles = new ArrayList<>();

	/* paterny obchodů */
	private List<ShopPaterns> shopPaternsList = new ArrayList<>();

	/* adresy obchodů */
	List<String> shopAddresses = new ArrayList<>();

	/* názvy obchodů */
	List<String> shopNameList = new ArrayList<>();

	class ShopPaterns {
		String shopName;
		Pattern nameShopPattern;
		Pattern dataGroupPattern;
		Pattern nameproductPattern;
		Pattern pricePattern;
		Pattern addressPatern;

		
		public ShopPaterns(String shopName, Pattern nameShopPattern, Pattern dataGroupPattern, Pattern nameproductPattern, Pattern pricePattern, Pattern addressPatern) {
			super();
			this.shopName = shopName;
			this.nameShopPattern = nameShopPattern;
			this.dataGroupPattern = dataGroupPattern;
			this.nameproductPattern = nameproductPattern;
			this.pricePattern = pricePattern;
			this.addressPatern = addressPatern;
		}

		public String getShopName() {
			return shopName;
		}

		public Pattern getNameShopPattern() {
			return nameShopPattern;
		}

		public Pattern getDataGroupPattern() {
			return dataGroupPattern;
		}

		public Pattern getNameproductPattern() {
			return nameproductPattern;
		}

		public Pattern getPricePattern() {
			return pricePattern;
		}


		public Pattern getAddressPatern() {
			return addressPatern;
		}



	}

	public Bill() {

		initLists();

		runBillsProcessing();

	}

	private String pdfToText(String nameFile) {
		File file;
		String billContent = "";
		file = new File(nameFile);
		//List<String> listOFRows = new ArrayList<>();
		try {
			this.pdfParser = new PDFParser(new RandomAccessFile(file, "r"));
			pdfParser.parse();
			cosDoc = pdfParser.getDocument();
			pdfTextStripper = new PDFTextStripper();

			pdDoc = new PDDocument(cosDoc);
			pdDoc.getNumberOfPages();

			pdfTextStripper.setStartPage(1);
			pdfTextStripper.setEndPage(pdDoc.getNumberOfPages());

			billContent = pdfTextStripper.getText(pdDoc);
			// listOFRows = pdfTextStripper.get

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // update for PDFBox V 2.0
		return billContent;
	}

	private void runBillsProcessing() {
		String contentCurrenBill = "";

		//List<String> currentBillList = new ArrayList<>();
		Matcher m;

		int idx = 0;
		int finded = 0;
		/* procházení seznamu souborů */
		for (String billNameFile : billsNameFiles) {
			idx++;
			System.out.println("=====================================================================");
			System.out.println("   " + idx + ":" + billNameFile);
			System.out.println("=====================================================================");
			contentCurrenBill = pdfToText(billNameFile);

			/* procházím seznam obchodů */
			overloop: for (ShopPaterns shopPatern : shopPaternsList) {
				System.out.println("aktuálně kontrolovaný obchod:"+shopPatern.getShopName());
				// m = shopPatern.getPatternNameShop().matcher(billRow);
				m = shopPatern.getNameShopPattern().matcher(contentCurrenBill.toLowerCase());
				if (m.find()) {
					finded++;
					System.out.println("    +--------------------------------------------------------");
					System.out.println("    |  Účtenka je z:" + shopPatern.getShopName());
					System.out.println("    +--------------------------------------------------------");

					if (shopPatern.getAddressPatern() != null) {
						Matcher mAddress = shopPatern.getAddressPatern().matcher(contentCurrenBill);
						if (mAddress.find()) {
							System.out.println("Adresa shopu je:" + mAddress.group(1));
						} else
							System.out.println("Adresa nenalazena");
					}

					if (shopPatern.getDataGroupPattern() != null) {
						Matcher dataGroupMatcher = shopPatern.getDataGroupPattern().matcher(contentCurrenBill);
						if (dataGroupMatcher.find()) {
							String billtDataGroup = dataGroupMatcher.group(1);
							System.out.println("");
							System.out.println("*****  DataGroup start *****");
							System.out.println(billtDataGroup);
							System.out.println("*****  DataGroup konec *****");
							System.out.println("");
							List<String> billRows = new ArrayList<>(Arrays.asList(billtDataGroup.split("\\r?\\n")));
							System.out.println("");
							System.out.println("******************* Vytěžená data start ****************************");
							for (String billRow : billRows) {
								Matcher productNameMatcher = shopPatern.getNameproductPattern().matcher(billRow);
								Matcher priceMatcher = shopPatern.getPricePattern().matcher(billRow);
								if (productNameMatcher.find() && priceMatcher.find()) {
									String nameProduct = productNameMatcher.group(1);
									String priceString = priceMatcher.group(1);
									if (!priceString.isEmpty()) {
										Float price = Float.parseFloat(priceString);
										Float priceMultiplied = price * 1.1f;
										System.out.println("     Název produktu=" + nameProduct + ", cena=" + price + ", cena x 1,1=" + priceMultiplied);
									}
								}
							}
							System.out.println("******************* Vytěžená data konec ****************************");
						}
					}
					break overloop;
				}
			}
			System.out.println("");
			System.out.println("-------------------  DATOVÁ VRSTVA START ------------------------------------");
			System.out.println(contentCurrenBill);
			System.out.println("-------------------  DATOVÁ VRSTVA KONEC ------------------------------------");
			System.out.println("");
		}
		System.out.println("");
		System.out.println("*******************************************");
		System.out.println("*  Zpracováno účtenek:" + idx);
		System.out.println("*  Zjištěn obchod    :" + finded);
		System.out.println("*******************************************");

	}

	private void initLists() {
		
		
		// billNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180712_112241.PDF");
		// billNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180712_112339.PDF");
		// billNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180712_112346.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180715_163718.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180715_163718_portrait.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180716_201550.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180716_201550_portrait.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180716_201550_portrait_small.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180717_095109.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180717_095126.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180717_095126_portrait.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\TheBest.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Ahold_OK.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Albert1.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Albert2.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Billa_Crumpled.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\IMG_20180716_201550_portrait_small.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\OK2.PDF");
		// billNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\trojica1.PDF");
		// billNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\trojica2.PDF");
		// billNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\trojica3.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\20180712_143649.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\20180712_143652.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\20180712_143656.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\IMG_20180717_120440.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\IMG_20180717_120444.PDF");
//		billsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\IMG_20180717_120448.PDF");
		billsNameFiles.add("C:\\Users\\roman\\Disk Google\\104_Srovnavač hladu\\99_uctenky\\01_new jpg\\naskenováno_20180720-1303.pdf");

		// shopNames.add(new ShopPatern("AHOLD", Pattern.compile("AHOLD CZECH REPUBLIC a.s."), Pattern.compile(""), Pattern.compile("")));
		// shopNames.add(new ShopPatern("BILLA", Pattern.compile("BILLA, SPOL. S R.O."), Pattern.compile(""), Pattern.compile("")));

		shopPaternsList.add(new ShopPaterns("AHOLD", Pattern.compile("ahold", Pattern.DOTALL), null, null, null, null));

		shopPaternsList.add(new ShopPaterns("ALBERT", Pattern.compile("albert", Pattern.DOTALL), Pattern.compile("Zbozi CZK/Jed Hnoz Suma CZK(.*?)Cena celkem", Pattern.DOTALL), Pattern.compile("\\d{2}\\.\\d(.*?)\\d*\\s-?\\d+\\.\\d{2}$"),
				Pattern.compile("\\s+(-?\\d+\\.\\d{2}$)"), Pattern.compile("S.dlo pl.tce dan.\\s:(.*?)DIC\\s:\\sCZ", Pattern.DOTALL)));

		shopPaternsList.add(new ShopPaterns("BILLA", Pattern.compile("billa", Pattern.DOTALL), Pattern.compile("Čas:\\s\\d\\d:\\d\\d:\\d\\d(.*?)Celkem", Pattern.DOTALL), Pattern.compile("(.*?)\\s[BC]\\s+-?\\d+\\.\\d{2}$"),
				Pattern.compile("\\s+(-?\\d+\\.\\d{2}$)"), null));

		shopPaternsList.add(new ShopPaterns("BEO", Pattern.compile("beo restaurace", Pattern.DOTALL), null, null, null, null));

		shopPaternsList.add(new ShopPaterns("rohlik.cz", Pattern.compile("rohlik", Pattern.DOTALL), null, null, null, null));

	}

}
