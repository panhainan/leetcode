package com.phn.from41;

import java.util.List;

import com.phn.from41.DistinctPermutation;


/**
 * @author phn 
 * @TODO ����ȫ���У�ȥ���ظ��У�
 * @date 2015��4��6��
 */
public class TestDistinctPermutations {
	public static void main(String[] args) {
		DistinctPermutation permutation = new DistinctPermutation();
		int[] num = {3,3,0,0,2,3,2};
		List<List<Integer>> permutations = permutation.permuteUnique(num);
        System.out.println(permutations);
	}
}
