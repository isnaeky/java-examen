package com.isnaeky.beautiful;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Programa\\beutiful.txt"));

        System.out.println("Numero i");
        int i = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("Numero j");
        int j = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("Numero k");
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int resultado =  Beautiful.beautifulDays(i, j, k);
        
        
        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
}
