package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 6, 1, 2, 3, 5, 9 };

		int temp = num[5];
		num[5] = num[0];
		num[0] = temp;
		print(num);
	}

	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));

	}

	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));

	}

}
