package com.phn.from41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.phn.from41.Permutations;

/**
 * @author phn
 * @TODO ����ȫ����
 * @date 2015��4��6��
 */
public class TestPermutations {
	public static void main(String[] args) {
		Permutations permutation = new Permutations();
		int[] num = { 1, 2, 1 };
		List<List<Integer>> permutations = permutation.permute(num);
		/* �Ȱ�int������ת��Integer�������� */
		// Integer[] array = new Integer[num.length];
		// for(int i=0; i<num.length; i++)
		// {
		// Integer integer = new Integer(num[i]);
		// array[i] = integer;
		// }
		/* �ٰ�Integer��������ת���ɼ��� */
		// List<Integer> list = Arrays.asList(array);
		// List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		// permutations.addAll(permutation.recurrenceCountPermutation(list, 0,
		// list.size()));
		System.out.println(permutations);
	}
}
