package com.phn.from41;


/**
 * @author phn TODO 全排列
 * @date 2015年4月6日
 */
public class Permutations {
	/**
	 * TODO 递归计算数字数组num的从0到n的全排列
	 * @param num
	 * @param start
	 * @param end
	 */
	public void recurrenceCountPermutation(int[] num, int start, int length) {
		if (length <= 1) {
			for (int k : num) {
				System.out.print(k + "\t");
			}
			System.out.println();
			return;
		}
		for (int i = start; i < start + length; i++) {
			swap(num, i, start);
			recurrenceCountPermutation(num, start + 1, length - 1);
			swap(num, i, start);
		}
	}

	/**
	 * TODO 将数组的两个元素交换位置
	 * @param num数组
	 * @param i数组中的第i元素的位置
	 * @param j数组中的第j元素的位置
	 */
	public void swap(int[] num, int i, int j) {
		int temp;
		// System.out.println("Before Sort："+array[i]+" "+array[j]);
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		// System.out.println("After Sort："+array[i]+" "+array[j]);
	}
}
