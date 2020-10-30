package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.HashMap;
import java.util.Map;

public class RetiMan {

	class Solution {
		public String solution1(String[] participant, String[] completion) {
			Map<String, Integer> hash = new HashMap<>();

			for (String arg : participant) {
				hash.put(arg, hash.getOrDefault(arg, 0) + 1);
			}
			for (String arg : completion) {
				hash.put(arg, hash.get(arg) - 1);
			}
			for (String key : hash.keySet()) {
				if (hash.get(key) != 0) {
					System.out.println(hash.keySet());
					return key;
				}
			}
			return null;
		}
	}

	public static void main(String[] args) {

		String[] a = new String[] { "Fillpa", "Josipa", "Marina", "Nikola" };
		String[] b = new String[] { "Fillpa", "Josipa", "Marina", "Nikola", "Vinko" };
//		new RetiMan().solution1(a,b); // 아니 왜 부르고 싶은데 부를 수가 없
	}

	class AnotherSolution {
		public String solution2(String[] participant, String[] completion) {
			String answer = "";
			HashMap<String, Integer> hm = new HashMap<>();
			for (String player : participant)
				hm.put(player, hm.getOrDefault(player, 0) + 1);// player라는 키가 존재하면 해당 값을 준다. 없으면 0
			// value에 getOrDefault를 한 이유는 중복체크 동명이인이면 2로 되기 때문
			for (String player : completion)
				hm.put(player, hm.get(player) - 1);

			for (String key : hm.keySet()) {
				if (hm.get(key) != 0) {
					answer = key;
				}
			}
			return answer;
		}
	}

}
