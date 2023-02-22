package winter_hw;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num[] = new int [5];
		int total=0;
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1) + "번째 수 : ");
			num[i]=scan.nextInt();
			total+=num[i];
		}
		double avg = (double) total/num.length;
		System.out.printf("평균 : %.2f", avg);
	}
}
