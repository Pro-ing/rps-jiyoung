package rsp;

public class RspMain {

	public static void main(String[] args) {
		Rsp rsc = new Rsp();
		
		rsc.setCount(3);
		
		boolean state = rsc.isLeft();
		
		if (state) {
			System.out.println("게임을 시작합니다.");
			System.out.println("게임은 " + rsc.getCount() + "번 진행합니다.");
			
			rsc.play();
		}
		
		if(rsc.isLeft()) {
			System.out.println("실행횟수 남아있음");
		} else {
			rsc.print();
		}
	}

}