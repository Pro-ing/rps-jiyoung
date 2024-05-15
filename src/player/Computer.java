package player;

import java.util.Random;

public class Computer {

	private String name; // 컴퓨터 이름
	private String result; // 컴퓨터 결과
	
	public Computer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getResult() {
		
		// 컴퓨터 랜덤 생성
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
