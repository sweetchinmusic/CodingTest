package 이건_그냥_코딩테스트.just.coding.edu;

import java.util.Scanner;

public class PutInArray {

	Scanner	sc = new Scanner(System.in);
	public static void main(String[] args) {
		new PutInArray().solution2();
	}
	
		public void solution1() { 
		// 키보드를 통해 원하는 것을 입력 받아 나중에 출력
		
		int[] arr= new int[3];
		
		for( int i = 0; i< arr.length; i++) {
			System.out.println("원하는 숫자를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		for(int k : arr) {
			System.out.println(k);
		}
		
	}
		public void solution2() {
		
			System.out.println("몇 번 실행할까요?");
			int b = sc.nextInt();
			int[] arr2 = new int[b];
			int count = 0;
			
			for(int i = 0; i<arr2.length; i++) {
				System.out.println("원하는 숫자를 입력하세요");
				arr2[i] = sc.nextInt();
			}
			
			for(int l : arr2) {
				System.out.println(l);
			}
			
			
		}

}
