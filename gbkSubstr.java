package tuning;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class gbkSubstr {

	/*public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String s = "��Smartison����";
		System.out.println(s.getBytes("gbk").length);
	
	}*/
	
	  public static final String chineseString = "����testString������";  
      
	    public static void main(String[] args) {  
	        List<String> splitStringList = chineseSplitFunction(chineseString, 3);  
	        for (String split:splitStringList) {  
	            System.out.println(split);  
	        }  
	    }  
	  
	    public static List<String> chineseSplitFunction(String src, int bytes){  
	        try {  
	            if(src == null){  
	                return null;  
	            }  
	            List<String> splitList = new ArrayList<String>();  
	            int startIndex = 0;    //�ַ�����ȡ��ʼλ��  
	            int endIndex = bytes > src.length() ? src.length() : bytes;  //�ַ�����ȡ����λ��   
	            while(startIndex < src.length()){  
	                String subString = src.substring(startIndex,endIndex);  
	                //��ȡ���ַ������ֽڳ��ȴ�����Ҫ��ȡ�ĳ���ʱ��˵�����������ַ�  
	                //��GBK�����У�һ�������ַ�ռ2���ֽڣ�UTF-8�����ʽ��һ�������ַ�ռ3���ֽڡ�  
	                while (subString.getBytes("GBK").length > bytes) {  
	                    --endIndex;  
	                    subString = src.substring(startIndex,endIndex);  
	                }  
	                splitList.add(src.substring(startIndex,endIndex));  
	                startIndex = endIndex;  
	                //�жϽ���λ��ʱҪ���ַ������ȱȽ�(src.length())��֮ǰ���ַ�����bytes���ȱȽ��ˣ�����Խ���쳣��  
	                endIndex = (startIndex + bytes) > src.length() ?   
	                        src.length()  : startIndex+bytes ;  
	                  
	            }  
	            return splitList;  
	              
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return null;  
	          
	    }  

}
