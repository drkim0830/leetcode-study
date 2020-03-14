package week1;

import java.util.StringTokenizer;

public class Leet1108 {
	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
	/*
	 * Runtime : 0ms, Memory : 37.3 MB
	 */
	public static String defangIPaddr(String address) {
//		ans = address.replaceAll("\\.", "[.]");	//Time Limit Exceeded
		String ans = "";
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(address, ".");
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
			if(st.hasMoreTokens()) {
				sb.append("[.]");
			}
		}
		ans = sb.toString();
		return ans;
    }
}
