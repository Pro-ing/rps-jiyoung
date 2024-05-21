package rsp;

import java.util.Random;

public class RandomValue {
	
	public String getResult() {
		
		// 랜덤 생성
		Random r = new Random();
		int random = r.nextInt(3)+1;
		
		if (random == 1) {
			return "가위";
		} else if(random ==  2) {
			return "바위";
		} else {
			return "보";
		}
	}
}
