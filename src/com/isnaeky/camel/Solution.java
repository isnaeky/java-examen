package com.isnaeky.camel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	/*
	 * Complete the 'camelcase' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */
	public static int camelcase(String s) {
		System.out.println("Cadena: " + s);
		int palabrasTotal = 1;
		Matcher matN;
		Pattern patN = Pattern.compile("^[A-Z]");
		for (int i = 0; i < s.length(); i++) {
			int coun = 0;
			matN = patN.matcher(String.valueOf(s.charAt(i)));
			if (matN.find()) {
				coun = coun + 1;
			}
			palabrasTotal += coun;
		}
		System.out.println("El total de palabras: " + palabrasTotal);
		return palabrasTotal;

	}
}