package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
	스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
	같은 이름을 가진 의상은 존재하지 않습니다.
	clothes의 모든 원소는 문자열로 이루어져 있습니다.
	모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
	스파이는 하루에 최소 한 개의 의상은 입습니다.
	결국 종류와는 상관이 없는게 같은 종류 내에서 다른 물품도 안되기 떄문에 이름도 같은 경우만 횟수를 늘린다.
 */

/*
 *                  clothes                                                     return
[[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]	5
[[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]	            3
 * 
 */
class Disguise {
	public static void main(String[] args) {
		// new Disguise().solution(new String[][] {{"yellow_hat", "headgear"},
		// {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
		String[][] a = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		new Disguise().solution(a);
	}

	public int solution(String[][] clothes) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			if (hm.containsKey(clothes[i][1]))
				hm.replace(clothes[i][1], hm.get(clothes[i][1]) + 1);
			else
				hm.put(clothes[i][1], 1);
		}
		System.out.println(hm); // {eyewear=1, headgear=2}

		int answer = 1;
		for (int value : hm.values()) {
			answer *= (value + 1);
		}
		answer -= 1;
		System.out.println(answer);//{5}
		return answer;
	}
}