package week2;

import java.util.*;

public class Leet200 {
	public static void main(String[] args) {
		char[][] grid = {
			{'1','1','0','0','0'},
			{'1','1','0','0','0'},
			{'0','0','1','0','0'},
			{'0','0','0','1','1'}};
			
		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int ans = 0;
		int[] di = { 0, 0, 1, -1 };
		int[] dj = { 1, -1, 0, 0 };

		int row = grid.length;
		if(row == 0) {
			return 0;
		}
		int col = grid[0].length;
		boolean[][] visited = new boolean[row][col];

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(!visited[i][j] && grid[i][j] == '1') {
					Queue<Pair> queue = new LinkedList<Pair>();
					queue.add(new Pair(i,j));
					visited[i][j] = true;
					while(!queue.isEmpty()) {
						Pair now = queue.poll();
						int nowi = now.i;
						int nowj = now.j;
						for(int d = 0; d < 4; d++) {
							int nexti = nowi + di[d];
							int nextj = nowj + dj[d];
							if((nexti >= 0 && nexti < row && nextj >=0 && nextj < col) && !visited[nexti][nextj] && grid[nexti][nextj] == '1') {
								queue.add(new Pair(nexti, nextj));
								visited[nexti][nextj] = true;
							}
						}
					}
					ans++;
				}
			}
		}
		return ans;
	}

	public static class Pair {
		int i, j;

		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}

		@Override
		public String toString() {
			return "Pair [i=" + i + ", j=" + j + "]";
		}
		
	}
}
