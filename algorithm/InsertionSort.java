package solveproblem;

import java.util.*;
import java.io.*;

public class InsertionSort {
	//삽입 정렬
	public static void main(String[] args) {
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		for (int i = 0; i < 9; i++) {
			int j = i;
			int temp = 0;
			while(j >= 0 && arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
/*	삽입 정렬은 두 번째 수부터 그 앞의 수들과 비교해서 삽입을 하는 것처럼 정렬을 하는 알고리즘이다.
	1 10 5 8 7 6 4 3 2 9
	1 5 10 8 7 6 4 3 2 9
	1 5 8 10 7 6 4 3 2 9
	...
	삽입 정렬도 최악의 순간에는 O(N^2)의 시간 복잡도를 가져 효율이 좋은 정렬 알고리즘은 아니다.
	하지만 꼭 정렬이 필요한 순간만 SWAP을 수행하기 때문에 시간복잡도 O(N^2)을 가지는 버블정렬과 선택 정렬, 삽입 정렬 중 가장 빠르다.
	예를 들어 2 3 4 5 6 7 8 9 10 1과 같은 특별한 경우의 수라면(거의 정렬 된 상태)
	한 싸이클 당 1번씩만 연산을 하면 정렬을 할 수 있어 매우 효율적이고 심지어
	힙정렬, 퀵정렬, 병합 정렬보다 더 빠르게 정렬 할 수 있다!
	하지만 이는 어디까지나 특별한 경우일 때만 해당된다.*/
}
