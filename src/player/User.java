package player;

public class User {
	
	private String name; // 사용자 이름
	private String result; // 사용자 결과
	
	public User(String name){
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
