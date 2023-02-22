package winter_hw;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String input;
		System.out.print("영문자 입력 : ");
		input = scan.next();
		System.out.print("반환된 문자 : ");
		for(int i=input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i));
		}
	}
}