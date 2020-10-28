/*
	점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
	학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
	예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
	체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
	전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
	여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
	체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	전체 학생의 수는 2명 이상 30명 이하입니다.
	체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
	여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 */
package 이건_그냥_코딩테스트.just.coding.codingTest;

public class Adidas {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; // return 값
        int exist = 0;  // 잃어버려도 난 있응께
        int count = 0;	// 빌려준 갯수
        
        //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
        for(int i=0; i<lost.length; i++) { // 잃어버린 사람 배열 안에 수
            for(int j=0; j<reserve.length; j++) { // 줄 수 있는 사람 즉 여유분
                if(lost[i]==reserve[j]) { // 이게 같다 ? 그럼 빌려 줄 수가 없지
                    exist++; // 자기꺼는 하나 있지
                    lost[i] = -1; // 배열에 표시해두는거야 -1로
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) { 
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                    count++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        //answer은 전체 학생수에서 잃어버린 학생 수를 뺀다.
        //후에 여벌옷을 가진 학생이 도난 당했으면 그 수만큼 더해주고 옷을 빌려준 학생 수 만큼 다시 더해준다.
        answer = n - lost.length + exist + count;
        // 학생 수 - 잃어버린 수 + 내가 도둑 맞아도 내꺼 하나는 있지 + 니 빌려줄꺼는 하나 있지
        return answer;
    }
}