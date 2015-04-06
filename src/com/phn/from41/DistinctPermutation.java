package com.phn.from41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phn
 * @TODO 全排列(去除重复排列)
 * @date 2015年4月6日
 */
public class DistinctPermutation {
	List<List<Integer>> permutations = new ArrayList<List<Integer>>();

	public List<List<Integer>> permuteUnique(int[] num) {
		/* 先把int型数组转成Integer类型数组 */
		Integer[] array = new Integer[num.length];
		for (int i = 0; i < num.length; i++) {
			Integer integer = new Integer(num[i]);
			array[i] = integer;
		}

		/* 再把Integer类型数组转换成集合 */
		List<Integer> list = Arrays.asList(array);
		return recurrenceCountPermutation(list, 0, list.size() - 1);
	}

	/**
	 * @TODO 递归计算数字数组num的从1到n的全排列
	 * @param num
	 * @param start
	 * @param end
	 */
	public List<List<Integer>> recurrenceCountPermutation(List<Integer> num,
			int start, int end) {
		List<Integer> permutation = new ArrayList<Integer>();
		if (start == end) {
			for (int k : num) {
				System.out.print(k + "\t");
			}
			System.out.println();
			permutation.addAll(num);
			permutations.add(permutation);
		} else {
			for (int i = start; i <= end; i++) {
				// 去除重复的排列
				if (!hasDuplicate(num, start, i)) {
					swap(num, start, i);
					recurrenceCountPermutation(num, start + 1, end);
					swap(num, start, i);
				}

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

	/**
	 * @TODO 是否有重复的，能不能交换，就是说交换数字中间不能出现与后面交换的重复数字
	 * @param num
	 * @param i
	 * @param j
	 * @return
	 */
	public boolean hasDuplicate(List<Integer> num, int start, int end) {
		for (int index = start; index < end; index++) {
			if (num.get(index).equals(num.get(end)))
				return true;
		}
		return false;
	}
}
