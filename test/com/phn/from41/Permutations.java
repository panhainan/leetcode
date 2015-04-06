package com.phn.from41;


/**
 * @author phn TODO ȫ����
 * @date 2015��4��6��
 */
public class Permutations {
	/**
	 * TODO �ݹ������������num�Ĵ�0��n��ȫ����
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
	 * TODO �����������Ԫ�ؽ���λ��
	 * @param num����
	 * @param i�����еĵ�iԪ�ص�λ��
	 * @param j�����еĵ�jԪ�ص�λ��
	 */
	public void swap(int[] num, int i, int j) {
		int temp;
		// System.out.println("Before Sort��"+array[i]+" "+array[j]);
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		// System.out.println("After Sort��"+array[i]+" "+array[j]);
	}
}
