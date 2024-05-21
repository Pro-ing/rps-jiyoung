package rsp;

import player.Computer;
import player.PlayerManager;
import player.User;

public class RspMain {

	public static void main(String[] args) {
		User user  = new User("지영");
		User user2 = new User("지영2");
		
		user.setResult("가위");
		user2.setResult("바위");
		
		Computer com = new Computer("컴퓨터");
		
		PlayerManager player = new PlayerManager();
		player.addUser(user);
		player.addUser(user2);
		player.addComputer(com);
		
		Rsp rsp = new Rsp();
		rsp.game(player);
	}

}