package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RetiMan {

	public static void main(String[] args) {

		String[] a = new String[] { "Fillpa", "Josipa", "Marina", "Nikola", "Vinko" };
		String[] b = new String[] { "Fillpa", "Josipa", "Marina", "Nikola" };
		new RetiMan().solution3(a,b); // 아니 왜 부르고 싶은데 부를 수가 없
	}

	public String solution1(String[] participant, String[] completion) { // 솔 2와 같다 하지만 얘는 바로 리턴 해버리고 
		// 솔2는 맨 위에 String answer에 자신의 key값을 담고 밖에서 리턴을 해버린다.
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

	public String solution3(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i; // i를 바깥에 넣는 이유 completion 과 participant 순서가 같을 때 ( 마지막일 때 ) 처리를 하려고.
		for (i = 0; i < completion.length; i++) {// 완주한 사람 만큼 돌꺼고,

			if (!participant[i].equals(completion[i])) { // 이렇게만 확인해도 되나?
				return participant[i];
			}
		}
		return participant[i];
	}

	
}
