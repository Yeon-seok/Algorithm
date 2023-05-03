package solveproblem;

import java.io.*;
import java.util.*;

class SelectionSort {
	//	선택 정렬
	public static void main(String[] args) {
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		int index = 0;
		
		for(int i = 0; i < 10; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = i; j < 10; j++) {
				if(arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			//swap
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
/*	가장 작은 것을 선택해서 제일 앞으로 보내면 어떨까?
	배열의 처음부터 시작해서 가장 작은 수를 그 자리에 위치하고
	그 다음자리는 그 다음 작은 수를 찾아서 위치하는 식을 구현하는 정렬 방식
	한 번의 싸이클이 끝나면 가장 작은 수가 배열의 앞쪽에 위치.
	1, 10, 5, 8, 7, 6, 4, 3, 2, 9
	1, 2, 5, 8, 7, 6, 4, 3, 10, 9
	1, 2, 3, 8, 7, 6, 4, 5, 10, 9
	...
	계산 속도는 등차수열의 공식을 사용하면 10 * ( 10 + 1) / 2 = 55
	N * (N + 1) / 2 
	따라서 결국 O(N^2)이라는 시간 복잡도를 가짐.
	정렬 알고리즘 중 좋지 못한 실행 속도를 가짐.
	*/
	
	
}
