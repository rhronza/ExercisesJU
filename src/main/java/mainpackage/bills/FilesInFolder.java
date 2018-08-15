package mainpackage.bills;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilesInFolder {

	public FilesInFolder() {
		
		getAllFiles(new File("C:\\uctenky\\\\tenkystextovouvrstvou\\pdf\\"));

	}

	private static void getAllFiles(File curDir) {

		File[] filesList = curDir.listFiles();
		for (File f : filesList) {
			if (f.isDirectory())
				getAllFiles(f);
			if (f.isFile()) {
				Pattern pdfPattern = Pattern.compile("(.*?)\\.pdf$");
				Pattern txtPattern = Pattern.compile("(.*?)\\.txt$");
				
				Matcher pdfMatcher = pdfPattern.matcher(f.getName().toLowerCase());
				Matcher txtMatcher = txtPattern.matcher(f.getName().toLowerCase());
				
				if (pdfMatcher.find() || txtMatcher.find()) {
//					String nameFile = f.getName(); 
//					if (nameFile.toLowerCase().lastIndexOf(".pdf")> - 1 || nameFile.toLowerCase().lastIndexOf(".txt") >-1 ) {
						System.out.println(f.getName());
//				}
					
				}
			}
		}
	}
}