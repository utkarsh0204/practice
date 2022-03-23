package com.codechef.maychallenge21.div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Golf {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt(br.readLine());
		int N, x, k;
		String s;
		String arr[];
		for (int i = 0; i < T; i++) {
			s=br.readLine();
			arr=s.split("\\s");
			N = Integer.parseInt(arr[0]);
			x = Integer.parseInt(arr[1]);
			k = Integer.parseInt(arr[2]);
			if (x % k == 0) {
				System.out.println("YES");
			} else if ((N - x + 1) % k == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		br.close();
		System.out.println("done");
	}
}
