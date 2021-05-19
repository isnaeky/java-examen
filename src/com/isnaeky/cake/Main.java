package com.isnaeky.cake;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Clase Main de Cake 
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Programa\\cake.txt"));
		System.out.println("Clase Main Cake");
		//Lee las lineas de codigo en la consola
		//String s = bufferedReader.readLine();
		
		final int arr[]= {1,4,2,4,1,3,4,5,1};
		
		int result = CakeCandles.birthdayCakeCandles(arr);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
