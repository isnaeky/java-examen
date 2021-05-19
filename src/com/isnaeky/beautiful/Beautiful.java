package com.isnaeky.beautiful;

public class Beautiful {
	public static int beautifulDays(int i, int j, int k) {
		int coun = 0;
		for (int a = i; a <= j; a++) {
			int numRevert = invertir(a);
			float resultRest = Math.abs(a - numRevert);
			if (resultRest % k == 0) {
				coun++;
			}
		}
		System.out.println("Total de dias hermosos: " + coun);
		return coun;
	}

	public static int invertir(int n) {
		int num = 0;
		while (n > 0) {
			num = num * 10 + n % 10;
			n /= 10;
		}
		return num;
	}
}
