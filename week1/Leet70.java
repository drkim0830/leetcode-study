package day0308;

public class Leet70 {
	public static void main(String[] args) {
		System.out.println(climbStairs(6));
	}
	/*
	 * 1, 2, 3, 5, 8, ... n의 범위는?
	 * Runtime : 0 ms, Memory : 37.7MB
	 */
	public static int climbStairs(int n) {
		if(n < 2) {
			return n;
		}
		else {
			int ans = 0;
			int step_1 = 1;
			int step_2 = 1;
			for(int i = 2; i <= n; i++) {
				ans = step_1 + step_2;
				step_1 = step_2;
				step_2 = ans;
			}
			return ans;			
		}
	}
}
