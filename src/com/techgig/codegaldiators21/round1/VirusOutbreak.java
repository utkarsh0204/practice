package com.techgig.codegaldiators21.round1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VirusOutbreak {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String V = br.readLine();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			identify(V, br.readLine());
		}
		br.close();
	}

	public static void identify(String V, String B) {
		int i = 0, j = 0;
		StringBuffer sb = new StringBuffer();
		int vLen = V.length();
		int bLen = B.length();
		char vChar, bChar;
		while (i < vLen && j < bLen) {
			vChar = V.charAt(i);
			bChar = B.charAt(j);
			if (vChar == bChar) {
				j++;
				sb.append(bChar);
			}
			i++;
		}
		if (sb.toString().equals(B)) {
			System.out.println("POSITIVE");
		} else {
			System.out.println("NEGATIVE");
		}
	}
}
