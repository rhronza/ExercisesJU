package mainpackage;

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

public class Receipts {

	/* pdfBox classes: */
	private PDFParser pdfParser;
	private PDFTextStripper pdfTextStripper;
	private PDDocument pdDoc = null;
	private COSDocument cosDoc = null;;

	/* seznam účtenek */
	private List<String> receiptsNameFiles = new ArrayList<>();

	/* jména obchodů */
	private List<ShopPatern> shopNames = new ArrayList<>();

	class ShopPatern {
		String shopName;
		Pattern nameShopPattern;
		Pattern dataGroupPattern;
		Pattern nameproductPattern;
		Pattern pricePattern;

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

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public void setNameShopPattern(Pattern nameShopPattern) {
			this.nameShopPattern = nameShopPattern;
		}

		public void setDataGroupPattern(Pattern dataGroupPattern) {
			this.dataGroupPattern = dataGroupPattern;
		}

		public void setNameproductPattern(Pattern nameproductPattern) {
			this.nameproductPattern = nameproductPattern;
		}

		public void setPricePattern(Pattern pricePattern) {
			this.pricePattern = pricePattern;
		}

		public ShopPatern(String shopName, Pattern nameShopPattern, Pattern dataGroupPattern, Pattern nameproductPattern, Pattern pricePattern) {
			super();
			this.shopName = shopName;
			this.nameShopPattern = nameShopPattern;
			this.dataGroupPattern = dataGroupPattern;
			this.nameproductPattern = nameproductPattern;
			this.pricePattern = pricePattern;
		}

	}

	public Receipts() {

		initLists();

		runReceiptsProcessing();

	}

	private String toText(String nameFile) {
		File file;
		String receiptContent = "";
		file = new File(nameFile);
		List<String> listOFRows = new ArrayList<>();
		try {
			this.pdfParser = new PDFParser(new RandomAccessFile(file, "r"));
			pdfParser.parse();
			cosDoc = pdfParser.getDocument();
			pdfTextStripper = new PDFTextStripper();

			pdDoc = new PDDocument(cosDoc);
			pdDoc.getNumberOfPages();

			pdfTextStripper.setStartPage(1);
			pdfTextStripper.setEndPage(pdDoc.getNumberOfPages());

			receiptContent = pdfTextStripper.getText(pdDoc);
			// listOFRows = pdfTextStripper.get

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // update for PDFBox V 2.0
		return receiptContent;
	}

	private void initLists() {
		// receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180712_112241.PDF");
		// receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180712_112339.PDF");
		// receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180712_112346.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180715_163718.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180715_163718_portrait.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180716_201550.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180716_201550_portrait.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180716_201550_portrait_small.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180717_095109.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180717_095126.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\IMG_20180717_095126_portrait.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\TheBest.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Ahold_OK.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Albert1.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Albert2.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\Billa_Crumpled.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\IMG_20180716_201550_portrait_small.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\OK2.PDF");
		// receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\trojica1.PDF");
		// receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\trojica2.PDF");
		// receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\history\\trojica3.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\20180712_143649.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\20180712_143652.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\20180712_143656.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\IMG_20180717_120440.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\IMG_20180717_120444.PDF");
		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\billa_vojta\\IMG_20180717_120448.PDF");

		// shopNames.add(new ShopPatern("AHOLD", Pattern.compile("AHOLD CZECH REPUBLIC a.s."), Pattern.compile(""), Pattern.compile("")));
		// shopNames.add(new ShopPatern("BILLA", Pattern.compile("BILLA, SPOL. S R.O."), Pattern.compile(""), Pattern.compile("")));

		shopNames.add(new ShopPatern("AHOLD", 	Pattern.compile("ahold", Pattern.DOTALL), null, null, null));
		
		shopNames.add(new ShopPatern("ALBERT", 	Pattern.compile("albert", Pattern.DOTALL), 
												Pattern.compile("Zbozi CZK/Jed Hnoz Suma CZK(.*?)Cena celkem", Pattern.DOTALL), 
												Pattern.compile("\\d{2}\\.\\d(.*?)\\d*\\s-?\\d+\\.\\d{2}$"), 
												Pattern.compile("\\s+(-?\\d+\\.\\d{2}$)")));
		
		shopNames.add(new ShopPatern("BILLA", 	Pattern.compile("billa", Pattern.DOTALL), 
												Pattern.compile("Čas:\\s\\d\\d:\\d\\d:\\d\\d(.*?)Celkem", Pattern.DOTALL), 
												Pattern.compile("(.*?)\\s[BC]\\s+-?\\d+\\.\\d{2}$"),
												Pattern.compile("\\s+(-?\\d+\\.\\d{2}$)")));
		
		shopNames.add(new ShopPatern("BEO", Pattern.compile("beo restaurace", Pattern.DOTALL), null, null, null));
		
		shopNames.add(new ShopPatern("rohlik.cz", Pattern.compile("rohlik", Pattern.DOTALL), null, null, null));

	}

	private void runReceiptsProcessing() {
		String contentCurrenReceipt = "";

		List<String> currentReceiptList = new ArrayList<>();
		Matcher m;

		int idx = 0;
		int finded = 0;
		/* procházení seznamu souborů */
		for (String receiptNameFile : receiptsNameFiles) {
			idx++;
			System.out.println("=====================================================================");
			System.out.println("   " + idx + ":" + receiptNameFile);
			System.out.println("=====================================================================");
			contentCurrenReceipt = toText(receiptNameFile);

			/* procházím seznam obchodů */
			overloop: for (ShopPatern shopPatern : shopNames) {
				// m = shopPatern.getPatternNameShop().matcher(receiptRow);
				m = shopPatern.getNameShopPattern().matcher(contentCurrenReceipt.toLowerCase());
				if (m.find()) {
					finded++;
					System.out.println("    +--------------------------------------------------------");
					System.out.println("    |  Účtenka je z:" + shopPatern.getShopName());
					System.out.println("    +--------------------------------------------------------");
					if (shopPatern.getDataGroupPattern() != null) {
						Matcher dataGroupMatcher = shopPatern.getDataGroupPattern().matcher(contentCurrenReceipt);
						if (dataGroupMatcher.find()) {
							String receiptDataGroup = dataGroupMatcher.group(1);
							System.out.println("");
							System.out.println("*****  DataGroup start *****");
							System.out.println(receiptDataGroup);
							System.out.println("*****  DataGroup konec *****");
							System.out.println("");
							List<String> receiptRows = new ArrayList<>(Arrays.asList(receiptDataGroup.split("\\r?\\n")));
							System.out.println("");
							System.out.println("******************* Vytěžená data start ****************************");
							for (String receiptRow : receiptRows) {
								Matcher productNameMatcher = shopPatern.getNameproductPattern().matcher(receiptRow);
								Matcher priceMatcher = shopPatern.getPricePattern().matcher(receiptRow);
								if (productNameMatcher.find() && priceMatcher.find()) {
									String nameProduct = productNameMatcher.group(1);
									String priceString = priceMatcher.group(1);
									if (!priceString.isEmpty()) {
										Float price = Float.parseFloat(priceString);
										Float priceMultiplied = price * 1.1f;
										System.out.println("     Název produktu="+nameProduct+", cena="+price+", cena x 1,1="+priceMultiplied);
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
			System.out.println(contentCurrenReceipt);
			System.out.println("-------------------  DATOVÁ VRSTVA KONEC ------------------------------------");
			System.out.println("");
		}
		System.out.println("");
		System.out.println("*******************************************");
		System.out.println("*  Zpracováno účtenek:" + idx);
		System.out.println("*  Zjištěn obchod    :" + finded);
		System.out.println("*******************************************");

	}
}
