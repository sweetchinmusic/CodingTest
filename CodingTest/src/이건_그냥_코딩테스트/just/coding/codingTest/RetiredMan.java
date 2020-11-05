package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.HashMap;
import java.util.Map.Entry;

public class RetiredMan {

	public class Hash {

		public void main(String[] args) { // 완주하지 못한 남자. 결국엔 중복되는 이름이 있는지 없는지 배열에 있는 요소들을 확인한 다음에 제거해 나가는 것.

			System.out.println(solution(new String[] { "mislav", "stanko", "mislav", "ana" },
					new String[] { "stanko", "ana", "mislav" }));
		}

		/* 해시 - 완주하지 못한 선수 */
		public String solution(String[] participant, String[] completion) {

			String answer = "";
			HashMap<String, Integer> map = new HashMap<>();

			// participant 배열의 모든 값을 해시 맵에 넣어줌
			for (String part : participant) {

				// key = 문자열, value = 현재 맵에 저장된 문자열 갯수에 + 1
				map.put(part, map.getOrDefault(part, 0) + 1);
			}

			// completion 배열의 모든 값을 해시 맵에 넣어줌
			for (String comp : completion) {

				// 같은 문자열을 찾아 value의 값을 -1해줌
				map.put(comp, map.get(comp) - 1);
			}

			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() > 0) {
					answer = entry.getKey();
					break;
				}
			}
			return answer;
		}
	}
}