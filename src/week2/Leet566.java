package week2;

public class Leet566 {
	public static void main(String[] args) {
		int[][] input = { { 1, 2 }, { 3, 4 } };
		int[][] answer = matrixReshape(input, 4, 1);
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] ans = new int[r][c];
		int original_r = nums.length;
		int original_c = nums[0].length;
		if (original_r * original_c != r * c) {
			return nums;
		}
		int input_r = 0, input_c = 0;
		for (int i = 0; i < original_r; i++) {
			for (int j = 0; j < original_c; j++) {
				ans[input_r][input_c++] = nums[i][j];
				if (input_c == c) {
					input_r++;
					input_c = 0;
				}
			}
		}
		return ans;
	}
}
