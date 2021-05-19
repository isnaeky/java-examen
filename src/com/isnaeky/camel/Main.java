package com.isnaeky.camel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Clase main para saber cuantas palabras contiene con camelCase
 */
class Main {
		
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Programa\\camel.txt"));
		System.out.println("Entro a clase main");
		System.out.println("Escriba la cadena de texto");
		String s = bufferedReader.readLine();
		int result = Solution.camelcase(s);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
