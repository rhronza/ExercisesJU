package mainpackage.bills;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.jpeg.JpegParser;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class PdfApacheTika {

	public PdfApacheTika() {
		try {
			runApacheTikaConvertFromPdf();
			// runAppacheTikaConvertFromImage();
		} catch (IOException | SAXException | TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void runAppacheTikaConvertFromImage() throws IOException, SAXException, TikaException {
		
		//detecting the file type
	      BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      FileInputStream inputstream = new FileInputStream(new File("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180716_201550.jpg"));
	      ParseContext pcontext = new ParseContext();
	      
	      //Jpeg Parse
	      JpegParser  JpegParser = new JpegParser();
	      JpegParser.parse(inputstream, handler, metadata,pcontext);
	      System.out.println("Contents of the document:" + handler.toString());
	      System.out.println("Metadata of the document:");
	      String[] metadataNames = metadata.names();
	      
	      for(String name : metadataNames) { 		        
	         System.out.println(name + ": " + metadata.get(name));
	      }
	}
	
	private void runApacheTikaConvertFromPdf() throws IOException, SAXException, TikaException {
		BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      
	      /* jmeno souboru */
	      //FileInputStream inputstream = new FileInputStream(new File("Example.pdf"));
	      /* ============================================================================================================ */
	      FileInputStream inputstream = new FileInputStream(new File("C:\\uctenky\\tenkystextovouvrstvou\\pdf\\Ahold_OK.PDF"));
	      /* ============================================================================================================ */
	      ParseContext pcontext = new ParseContext();
	      
	      //parsing the document using PDF parser
	      PDFParser pdfparser = new PDFParser(); 
	      pdfparser.parse(inputstream, handler, metadata,pcontext);
	      
	      //getting the content of the document
	      System.out.println("Contents of the PDF :" + handler.toString());
	      
	      //getting metadata of the document
	      System.out.println("Metadata of the PDF:");
	      String[] metadataNames = metadata.names();
	      
	      for(String name : metadataNames) {
	         System.out.println(name+ " : " + metadata.get(name));
	      }
		
	}
	
	
}
