package 이건_그냥_코딩테스트.just.coding.test;

public class HeartCounter {

    // static 변수로 실행했을 때와 일반 변수로 실행했을 때의 차이점 깨닫기!
    int count;
    //static int count;

    public HeartCounter() {
        this.count ++;
        System.out.println("좋아요 갯수 : " + this.count);
    }

    public static void main(String[] args) {
        HeartCounter hc1 = new HeartCounter();
        HeartCounter hc2 = new HeartCounter();
    }
}