package com.isnaeky.ranking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RakingTable {
	/*
	 * Complete the 'climbingLeaderboard' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY ranked 2. INTEGER_ARRAY player
	 */

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		List<Integer> result = new ArrayList<>();
		List<Integer> score = new ArrayList<>(ranked);
		for (int i = 0; i < player.size(); i++) {
			score.add(player.get(i));
			score.sort(Collections.reverseOrder());
			Set<Integer> set = new LinkedHashSet<>(score);
			score.clear();
			score.addAll(set);
			System.out.println(score.indexOf(player.get(i)) + 1);
			result.add(score.indexOf(player.get(i)) + 1); 
		}
		
		System.out.println("FinalScore "+score);
		return result;
	}

}
