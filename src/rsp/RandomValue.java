package rsp;

import java.util.Random;

public class RandomValue {
	
	private String result;
	
	public String getResult() {
		
		// 랜덤 생성
		Random r = new Random();
		int random = r.nextInt(3)+1;
		
		if (random == 1) {
			result = "가위";
		} else if(random ==  2) {
			result = "바위";
		} else if(random ==  3){
			result = "보";
		}
		
		return result;
	}
}
