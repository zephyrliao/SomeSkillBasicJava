package tuning;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		
		String str = "www.baidu.com";
		StringTokenizer st = new StringTokenizer(str,".");
		System.out.println(st.countTokens());
		
		List<String>strArray = new ArrayList<String>();
		while (st.hasMoreElements()) {
			strArray.add((String)st.nextElement());
		}
		
		System.out.println(strArray);
	}
}
