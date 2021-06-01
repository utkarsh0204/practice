package com.techgig.codegaldiators21.round1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int L, R, P1, P2, j, k;
		String inpArr[];
		for (int i = 0; i < T; i++) {
			P1 = P2 = -1;
			inpArr = br.readLine().split("\\s");
			L = Integer.parseInt(inpArr[0]);
			R = Integer.parseInt(inpArr[1]);
			j = L;
			k = R;
			while (j <= R) {
				if (checkPrime(j)) {
					P1 = j;
					break;
				}
				j++;
			}
			if (P1 == R) {
				System.out.println(0);
			} else if (P1 == -1) {
				System.out.println(-1);
			} else {
				while (k >= j) {
					if (checkPrime(k)) {
						P2 = k;
						break;
					}
					k--;
				}
				System.out.println(P2 - P1);
			}
		}
		br.close();
	}

	public static boolean checkPrime(int N) {
		for (int i = 2; i <= (N + 1) / 2; i++) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}
}
