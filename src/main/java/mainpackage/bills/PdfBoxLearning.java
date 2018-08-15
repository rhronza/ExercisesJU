package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
// TAK TUTO NE : import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.contentstream.operator.state.Concatenate;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfBoxLearning {

	/* pdfBox classes: */
	private PDFParser pdfParser;
	private PDFTextStripper pdfTextStripper;
	private PDDocument pdDoc = null;
	private COSDocument cosDoc = null;;

	/* seznam účtenek */
	private List<String> receiptsNameFiles = new ArrayList<>();
	
	public PdfBoxLearning() {

		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\Ahold_OK.PDF");
//		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\Billa_Crumpled.PDF");
//		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\OK2 (2).PDF");
//		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\trojica1.PDF");
//		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\trojica2.PDF");
//		receiptsNameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\trojica3.PDF");
//		

		String contentCurrenReceipt = "";

		for (String receiptNameFile : receiptsNameFiles) {
			System.out.println("=====================================================================");
			System.out.println(receiptNameFile);
			System.out.println("=====================================================================");
			contentCurrenReceipt = this.toText(receiptNameFile);
			System.out.println(contentCurrenReceipt);
			

		}
	}

	private String toText(String nameFile) {
		File file;
		String receiptContent = "";
		file = new File(nameFile);
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

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // update for PDFBox V 2.0
		return receiptContent;
	}
}
