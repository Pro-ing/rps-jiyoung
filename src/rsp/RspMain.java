package rsp;

import player.Multi;
import player.User;

public class RspMain {

	public static void main(String[] args) {
		User user  = new User("지영");
		User user2 = new User("지영2");

		user.setResult("가위");
		user2.setResult("바위");
		
		Multi multi = new Multi();
		multi.addUser(user);
		multi.addUser(user2);
		
		Rsp rps = new Rsp();
		rps.getUser(multi);
		
	}

}