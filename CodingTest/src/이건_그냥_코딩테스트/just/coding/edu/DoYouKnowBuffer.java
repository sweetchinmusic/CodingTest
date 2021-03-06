package 이건_그냥_코딩테스트.just.coding.edu;

import java.io.*;
import java.util.StringTokenizer;

public class DoYouKnowBuffer { // 해괴망측한 토크나이저는 코딩 때 안 나올 겁니다.

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
			bw.newLine();
			
			bw.flush();
			
		}
		
	}
	
}