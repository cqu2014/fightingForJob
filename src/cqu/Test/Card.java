package cqu.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Card {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int group = Integer.parseInt(scan.nextLine());
		for(int i =0;i<group;i++){
			int m = Integer.parseInt(scan.nextLine());
			
			List<String> name = new ArrayList<>();
			Map<String, Integer> score = new HashMap<>();
			
			for(int j=0;j<m;j++){
				String[] info = scan.nextLine().split(" ");
				name.add(info[0]);
				if (score.containsKey(info[0])) {
					score.put(info[0], score.get(info[0])+Integer.parseInt(info[1]));
				}else {
					score.put(info[0], Integer.parseInt(info[1]));
				}
			}
			
			List<String> winners = new ArrayList<>();
			int maxScore = 0;
			for(String ss:score.keySet()){
				if(score.get(ss) > maxScore){
					maxScore = score.get(ss);
					winners.clear();
					winners.add(ss);
				}else if(score.get(ss)==maxScore) {
					winners.add(ss);
				}
			}
			
			if (winners.size() == 1) {
				System.out.println(winners.get(0));
			}else {
				for(int k=name.size()-1;k>0;k--){
						if (winners.size()==1) {
							System.out.println(winners.get(0));
						}
						winners.remove(name.get(k));
				}
			}
			
		}
	}
	
}
