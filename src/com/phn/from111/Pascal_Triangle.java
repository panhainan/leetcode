package com.phn.from111;

import java.util.ArrayList;
import java.util.List;
/*
Problem 118:
Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
Solution£º
Here my answer is the reference of others named chennan.
two loops, one go through the row, one go through the column
database: pretty straight forward, ArrayList
calculate element value: K(i)(j)=K(i-1)(j-1)+K(i-1)(j) except for the first and last element
 */
/**
 * @author phn
 * @date 2015Äê3ÔÂ21ÈÕ
 */
public class Pascal_Triangle {
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <=0){
            return triangle;
        }
        for (int i=0; i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
