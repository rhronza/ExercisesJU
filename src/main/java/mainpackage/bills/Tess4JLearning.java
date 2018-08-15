package mainpackage.bills;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Tess4JLearning {

	public Tess4JLearning() {
		Tesseract tesseract = new Tesseract();
		tesseract.setDatapath("C:\\uctenky\\tessdata");
		tesseract.setLanguage("ces");

		List<String> nameFiles = new ArrayList<>();
		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\img\\billa_vojta\\A3.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180717_095126.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180717_095126_portrait.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180716_201550_portrait_small.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180716_201550_portrait.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\TheBest.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180715_163718_portrait.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\img\\IMG_20180712_112339.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180712_112241.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180712_112346.jpg");
//		nameFiles.add("C:\\uctenky\\tenkystextovouvrstvou\\IMG_20180715_163718.jpg");

		try {
			for (String nameFile : nameFiles) {
				System.out.println("start" + nameFile);
				String requiredtext = tesseract.doOCR(new File(nameFile));
				System.out.println(requiredtext);
				System.out.println("finish" + nameFile);
				System.out.println("");
			}
		} catch (TesseractException e) {
			e.printStackTrace();
		}

	}

}
