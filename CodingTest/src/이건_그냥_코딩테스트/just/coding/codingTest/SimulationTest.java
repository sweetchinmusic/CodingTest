/*수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
*/
package 이건_그냥_코딩테스트.just.coding.codingTest;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int first[] = {1,2,3,4,5}; //규칙 반복(이하 동일)
        int second[] = {2,1,2,3,2,4,2,5};
        int third[] = {3,3,1,1,2,2,4,4,5,5};
        
        int all[] = new int[3]; //3명 비교
        
        for(int i = 0; i < answers.length; i++){ //정답과 비교하여 맞은 것이 있다면 ++
            if(answers[i] == first[i%first.length]){all[0]++;} // 5번이면 그게 0번이기 때문에 나머지 값으로 한다.
            if(answers[i] == second[i%second.length]){all[1]++;}
            if(answers[i] == third[i%third.length]){all[2]++;}
        }
        
        List<Integer> clearPerson = new ArrayList<Integer>(); // List만들어주고 최대값 비교  // integer인 이유는 숫자값으로 비교하려고
        int max = Math.max(Math.max(all[0], all[1]),all[2]); // 3개가 안되더라구?
                // 여태 all에 값이 추가 되었을꺼 아냐? 그럼 그 값중 맥스가 max값에 있겠지 그거 찾는거야
        if(max == all[0]){clearPerson.add(1);} 
        if(max == all[1]){clearPerson.add(2);}
        if(max == all[2]){clearPerson.add(3);}
        // 혹~시나 해당 값이 같을 수도 있잖아? 그래서 그 list에 2, 3 이렇게 들어갈 수도 있고? 그럼 ?
        Collections.sort(clearPerson); //가장 높은 점수를 받은 사람이 여러명일 경우 오름차순
        // answer = new int[];
        answer = new int[clearPerson.size()]; // 위에 int [] answer = {} ; 와 연계 , 동급인 애가 몇 개 있는거야?
        
        
        for(int i = 0; i < answer.length; i++){ // 그 갯수 만큼 for문을 돌려. answer안에 숫자가 들어가겠지
            answer[i] = clearPerson.get(i);
        }
                   
        
        return answer;
    }
}