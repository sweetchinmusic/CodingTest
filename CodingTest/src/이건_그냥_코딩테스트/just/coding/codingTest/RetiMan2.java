package 이건_그냥_코딩테스트.just.coding.codingTest;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
// RetiMan의 솔3 과 똑같지만 출력하는 방법에서 넘나 다른 방식이라 일단 두기로 했습니다.

public class RetiMan2 {
	static String[] participant = { "leo", "kiki", "eden" };
	static String[] completion = { "eden", "kiki" };
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(solution(participant, completion));
		bw.flush();
		bw.close();
	}

	static String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer += participant[i];
				return answer;
			}
		}
		answer += participant[participant.length - 1];
		return answer;
	}
}