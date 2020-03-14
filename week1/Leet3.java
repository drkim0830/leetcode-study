package day0308;

public class Leet3 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(i));
			for(int j = i + 1; j < s.length(); j++) {
				boolean chk = true;
				String substring = sb.toString();
				for(int k = 0; k < substring.length(); k++) {
					if(s.charAt(j) == substring.charAt(k)) {
						chk = false;
						break;
					}
				}
				if(chk) {
					sb.append(s.charAt(j));
				}else {
					break;
				}
			}
			if(max < sb.length()) {
				max = sb.length();
			}
		}
		return max;
	}
}
