package mainpackage2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.util.SystemInfo;

public class SystemInfoRhr {
	private static String OS = null;
	private static String JAVA = null;
	private static String JAVA_VENDOR = null;
	List<String> prms = new ArrayList<>();

	public SystemInfoRhr() {
		
		System.out.println("==========================================================");
		System.out.println("getJavaVendor="+SystemInfo.getJavaVendor());
		System.out.println("getenv"+System.getenv());
		// System.getProperties().list(System.out);
		System.out.println("==========================================================");
		OS = System.getProperty("os.name");
		System.out.println("OS:"+OS);
		System.out.println(System.getProperty("os.version"));
		JAVA = System.getProperty("java.home");
		System.out.println("java.home:"+JAVA);
		JAVA_VENDOR = System.getProperty("java.vm.specification.vendor");
		System.out.println(JAVA_VENDOR);
		System.out.println(System.getProperty("java.version"));
		System.out.println("==========================================================");
		
//		InetAddress ip;
		String ipAddress="";
		
		try {
//			ip=InetAddress.getLocalHost();
			ipAddress = InetAddress.getLocalHost().getHostName();
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			ipAddress = e.toString();
		}
		System.out.println("ip:"+ipAddress);
		System.out.println("==========================================================");
		
		
		
	
		
	}

}
