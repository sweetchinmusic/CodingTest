package 이건_그냥_코딩테스트.just.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BetaTest {

	public static void main(String[] args) {

		new BetaTest().solution(2000, new String[] { "woni request 09:12:29", "brown request 09:23:11",
				"brown leave 09:23:44", "jason request 09:33:51", "jun request 09:33:56", "cu request 09:34:02" });
	}

	public String solution(int totalTicket, String[] logs) {
		String[] result = {};

		totalTicket = 2000;
		logs = new String[] { "woni request 09:12:29", "brown request 09:23:11", "brown leave 09:23:44",
				"jason request 09:33:51", "jun request 09:33:56", "cu request 09:34:02" };
		
		Map<String, Integer> list = new LinkedHashMap<String, Integer>();
		String[] array1 = {""};
		for(int i = 0; i< logs.length; i++) {
			String[] array = logs[i].split(" ");
			 String[] moonrray = array[2].split(":");
			System.out.println(Arrays.toString(moonrray));
			System.out.println(Arrays.toString(array));
			
			
		}
		
		return null;
		
		}



	
}
