package 이건_그냥_코딩테스트.just.coding.test;

import java.util.HashMap;

public class BetaTest {

	public static void main(String[] args) { // 각 알파벳들이 몇 번 나왔는지 확인하는 메소드

		BetaTest fdc = new BetaTest();

		String str = "aabbbbcdeeefgggabcdefg";
		
		BetaTest.AnalysisDuplicateString(str);
	}

	private static void AnalysisDuplicateString(String str) {

		char arr[] = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i], 0);
			}
			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		for (Character ch : hm.keySet()) {
			System.out.println(ch + " : " + hm.get(ch));
		}
	}

//	public int solution() {}
}