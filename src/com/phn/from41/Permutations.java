package com.phn.from41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phn
 * @TODO 全排列
 * @date 2015年4月6日
 */
public class Permutations {
	List<List<Integer>> permutations = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] num) {
		/* 先把int型数组转成Integer类型数组 */
		Integer[] array = new Integer[num.length];
		for (int i = 0; i < num.length; i++) {
			Integer integer = new Integer(num[i]);
			array[i] = integer;
		}

		/* 再把Integer类型数组转换成集合 */
		List<Integer> list = Arrays.asList(array);
		return recurrenceCountPermutation(list, 0, list.size()-1);
	}

	/**
	 * @TODO 递归计算数字数组num的从0到n的全排列
	 * @param num
	 * @param start
	 * @param end
	 */
	public List<List<Integer>> recurrenceCountPermutation(List<Integer> num,
			int start, int length) {
		List<Integer> permutation = new ArrayList<Integer>();
		if (start == length) {
			// for (int k : num) {
			// System.out.print(k + "\t");
			// }
			// System.out.println();
			permutation.addAll(num);
			permutations.add(permutation);
		} else {
			for (int i = start; i <= length; i++) {
				swap(num, start, i);
				recurrenceCountPermutation(num, start + 1, length);
				swap(num, start, i);
			}
		}
		return permutations;
	}

	/**
	 * @TODO 将数组的两个元素交换位置
	 * @param num数组
	 * @param i数组中的第i元素的位置
	 * @param j数组中的第j元素的位置
	 */
	public void swap(List<Integer> num, int i, int j) {
		int temp;
		temp = num.get(i);
		num.set(i, num.get(j));
		num.set(j, temp);
	}
}