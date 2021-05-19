package com.isnaeky.ranking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Programa\\raking.txt"));

	        System.out.println("Cantidad de ranked");
	        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
	        System.out.println("Numeros del ranked en string con espacio");
	        String[] rankedTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> ranked = new ArrayList<>();
	     
	        for (int i = 0; i < rankedCount; i++) {
	            int rankedItem = Integer.parseInt(rankedTemp[i]);
	            ranked.add(rankedItem);
	        }
	        
	        System.out.println("Cantidad de players");
	        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
	        System.out.println("Players en string con espacio");
	        String[] playerTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> player = new ArrayList<>();

	        for (int i = 0; i < playerCount; i++) {
	            int playerItem = Integer.parseInt(playerTemp[i]);
	            player.add(playerItem);
	        }

	        List<Integer> result = RakingTable.climbingLeaderboard(ranked, player);

	        for (int i = 0; i < result.size(); i++) {
	            bufferedWriter.write(String.valueOf(result.get(i)));

	            if (i != result.size() - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}

