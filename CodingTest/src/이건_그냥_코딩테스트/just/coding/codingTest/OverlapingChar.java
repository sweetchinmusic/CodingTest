package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.HashMap;

public class OverlapingChar { // 해쉬 맵으로 스트링에 문장을 글자씩 배열에 담아서 확인하는 방법.

	public static void main(String[] args) {

		OverlapingChar fdc = new OverlapingChar();

		String str = "qkakdsask";
		
		fdc.AnalysisDuplicateString(str);

	}

	private void AnalysisDuplicateString(String str) {

		char arr[] = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println("nothing : " + hm);
		for (int i = 0; i < arr.length; i++) {
			if (!hm.containsKey(arr[i])) { // 안에 있는지 없는지 없다!
				System.out.println("key : "+arr[i]); //
				hm.put(arr[i], 0); // 만들어줌
				System.out.println("hm1 : "+ hm);
			}
			hm.put(arr[i], hm.get(arr[i]) + 1); // hm에다가 갱신해서 집어 넣는 중. (arr[i], hm.get(arr[i] + 1);
			System.out.println("hm2 : " + hm); // {q=1, a=2, s=2, d=1, k=3}
		}
			System.out.println("setlizeBefore : "+hm); // {q=1, a=2, s=2, d=1, k=3}
		for (Character ch : hm.keySet()) {
			System.out.println("setlizeAfter : "+hm.keySet()); // [q, a, s, d, k]
			System.out.println(ch + " : " + hm.get(ch)); // q : 1
		
		}
	}

//	public int solution() {}
}