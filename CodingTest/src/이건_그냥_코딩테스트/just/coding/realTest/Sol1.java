package 이건_그냥_코딩테스트.just.coding.realTest;

import java.util.HashMap;
import java.util.Map;

class Sol1 {
	public static void main(String[] args) {
		System.out.println(new Sol1().solution(new String[]{"A+","D+","F","C0"},new int[]{2,5,10,3},50));
	}
    public int solution(String[] grades, int[] weights, int threshold) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] gr = {"A+","A0","B+","B","C+","C0","D+","D","F"};
        int[] val = {10,9,8,7,6,5,4,3,0};
        
        for(int i=0; i<gr.length;i++) {
        	map.put(gr[i], val[i]);
        }
        System.out.println("map : "+map);
        System.out.println(map.get(grades[0]));
        for(int j=0; j < grades.length; j++) {
        answer += ((map.get(grades[j]))*weights[j]);
        System.out.println("곱하기 : " + answer);
        }
        answer = answer - threshold;
        System.out.println("빼기 : "+answer);
        
        return answer;
    }
}