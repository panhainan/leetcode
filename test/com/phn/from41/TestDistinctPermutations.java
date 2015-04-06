package com.phn.from41;

import java.util.List;


/**
 * @author phn TODO 全排列
 * @date 2015年4月6日
 */
public class TestDistinctPermutations {
	public static void main(String[] args) {
		DistinctPermutation permutation = new DistinctPermutation();
		int[] num = {3,3,0,0,2,3,2};
		List<List<Integer>> permutations = permutation.permuteUnique(num);
        System.out.println(permutations);
	}
}
