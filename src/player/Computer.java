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
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
