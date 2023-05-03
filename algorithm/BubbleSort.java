package solveproblem;

import java.util.*;
import java.io.*;

public class BubbleSort {
	//버블 정렬
	public static void main(String[] args) {
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 9 - i; j++) {
				if(arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
/*	옆에 있는 값과 비교해서 더 작은 값을 앞으로 보내면 어떨까?
	버블 정렬은 배열의 첫 부분부터 시작해서 끝까지 바로 옆의 수와 비교를 한다
	만약 바로 옆의 수가 더 작은 수이면 위치를 바꾼다. 이를 반복하면 한 싸이클이
	끝났을 때 가장 큰 수가 가장 뒤에 위치하게 된다.
	1, 10, 5, 8, 7, 6, 4, 3, 2, 9
	1, 5, 8, 7, 6, 4, 3, 2, 9, 10
	1, 5, 7, 6, 4, 3, 2, 8, 9, 10
	...
	연산 횟수를 구해보면 9, 8, 7, 6 ... 으로 등차 수열 공식에 의해
	n(n+1) / 2이다. 이는 O(N^2)의 시간 복잡도를 가지고
	선택 정렬과 같다.
	하지만 선택 정렬보다 실행 속도는 더 떨어지는데 그 이유는 한 싸이클마다
	가장 작은 수를 찾아서 수를 SWAP 하는 선택정렬과 달리 버블 정렬은 매번 SWAP을
	진행하기 때문이다.
	따라서 정렬 알고리즘 중 가장 최악의 속도를 가진다.
	하지만 구현은 간단하다는 장점이 있다.*/
	
}
