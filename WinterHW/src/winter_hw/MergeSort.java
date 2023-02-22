package winter_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int arrA[] = new int [5];
		int arrB[] = new int [5];
		int temp[] = new int [10];
		ArrayList <Integer> result = new ArrayList <Integer>();
		int length=0;
		System.out.print("첫번째 배열의 데이타 : ");
		for(int i=0; i<arrA.length; i++) {
			arrA[i]=scan.nextInt();
			temp[i]=arrA[i];
		}
		System.out.print("두번재 배열의 데이타 : ");
		for(int i=0; i<arrB.length; i++) {
			arrB[i]=scan.nextInt();
			temp[i+5]=arrB[i];
		}
		Arrays.sort(temp);
		for(int i=0; i<temp.length; i++) {
			if(i==0 || temp[i]!=temp[i-1]) {
				result.add(temp[i]);
				length++;
			}
		}
		System.out.print("병합된 배열의 데이타 : ");
		for(int i=0; i<result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}
	}
}
