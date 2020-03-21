package week2;

import java.util.ArrayList;
import java.util.List;

public class Leet118 {
	public static void main(String[] args) {
		List<List<Integer>> ans = generate(5);
		for(int i = 0 ; i < ans.size(); i++){
			System.out.println(ans.get(i).toString());
		}
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(numRows == 0) {
			return ans;
		}
		List<Integer> init = new ArrayList<Integer>();
		init.add(1);
		ans.add(init);
		for(int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			for(int j = 1; j < ans.get(i-1).size(); j++) {
				List<Integer> beforeRow = ans.get(i-1);
				row.add(beforeRow.get(j-1) + beforeRow.get(j));
			}
			row.add(1);
			ans.add(row);
		}
		return ans;
	}
}
