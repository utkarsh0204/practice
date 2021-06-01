package com.codechef.maychallenge21.div3;

import java.util.Scanner;

public class Solubility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X,A,B;
		for (int i = 0; i < T; i++) {
			X=sc.nextInt();
			A=sc.nextInt();
			B=sc.nextInt();
			System.out.println((A+B*(100-X))*10);
		}
		sc.close();
	}
}
