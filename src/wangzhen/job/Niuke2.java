package wangzhen.job;

public class Niuke2 {
	
	public static String replaceSpace(StringBuffer str) {
		/*String[] arrStr = str.toString().split(" ");
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < arrStr.length-1; i++) {
			result.append(arrStr[i]+"%20");
		}
		result.append(arrStr[arrStr.length-1]);
	    	return result.toString();*/
		String ss = str.toString();
		return ss.replaceAll(" ", "%20");
	    }

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("   Hello,");
		stringBuffer.append(" we  ");
		stringBuffer.append("are  ");
		stringBuffer.append("family");
		System.out.println(replaceSpace(stringBuffer));
	}

}
