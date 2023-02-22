package winter_hw;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int arr [] = new int [10];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("가장 큰 수 : "+  arr[arr.length-1]);
	}
}
