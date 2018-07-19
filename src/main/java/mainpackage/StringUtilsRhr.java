package mainpackage;
import org.apache.commons.lang.StringUtils;
public class StringUtilsRhr {

	public StringUtilsRhr() {
		String s="";
		System.out.println("start");
		for (Integer j = 0; j < 10; j++) {
			s="nk"+StringUtils.leftPad(j.toString(), 10, '0');
			System.out.println(s);
		}
		s="nk"+StringUtils.leftPad(" " , 10, '0');
		System.out.println(s);
	}

}
