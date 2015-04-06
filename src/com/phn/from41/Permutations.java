package com.phn.from41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phn
 * @TODO ȫ����
 * @date 2015��4��6��
 */
public class Permutations {
	List<List<Integer>> permutations = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] num) {
		/* �Ȱ�int������ת��Integer�������� */
		Integer[] array = new Integer[num.length];
		for (int i = 0; i < num.length; i++) {
			Integer integer = new Integer(num[i]);
			array[i] = integer;
		}

		/* �ٰ�Integer��������ת���ɼ��� */
		List<Integer> list = Arrays.asList(array);
		return recurrenceCountPermutation(list, 0, list.size()-1);
	}

	/**
	 * @TODO �ݹ������������num�Ĵ�0��n��ȫ����
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
	 * @TODO �����������Ԫ�ؽ���λ��
	 * @param num����
	 * @param i�����еĵ�iԪ�ص�λ��
	 * @param j�����еĵ�jԪ�ص�λ��
	 */
	public void swap(List<Integer> num, int i, int j) {
		int temp;
		temp = num.get(i);
		num.set(i, num.get(j));
		num.set(j, temp);
	}
}