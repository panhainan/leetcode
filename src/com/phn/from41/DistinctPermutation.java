package com.phn.from41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phn
 * @TODO ȫ����(ȥ���ظ�����)
 * @date 2015��4��6��
 */
public class DistinctPermutation {
	List<List<Integer>> permutations = new ArrayList<List<Integer>>();

	public List<List<Integer>> permuteUnique(int[] num) {
		/* �Ȱ�int������ת��Integer�������� */
		Integer[] array = new Integer[num.length];
		for (int i = 0; i < num.length; i++) {
			Integer integer = new Integer(num[i]);
			array[i] = integer;
		}

		/* �ٰ�Integer��������ת���ɼ��� */
		List<Integer> list = Arrays.asList(array);
		return recurrenceCountPermutation(list, 0, list.size() - 1);
	}

	/**
	 * @TODO �ݹ������������num�Ĵ�1��n��ȫ����
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
				// ȥ���ظ�������
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

	/**
	 * @TODO �Ƿ����ظ��ģ��ܲ��ܽ���������˵���������м䲻�ܳ�������潻�����ظ�����
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
