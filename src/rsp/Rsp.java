package rsp;

import java.util.ArrayList;

import player.Computer;
import player.Multi;
import player.User;

public class Rsp implements IRsp{
	
	// 사용자 이름
	public void getUser(Multi multi) {
		ArrayList<User> userList = multi.getUserList();
		
		for(User user : userList) {
			System.out.println("===========================");
			System.out.println(user.getName() + " 참여합니다.");
			System.out.println("===========================");
			game(user);
		}
	}

	// 게임 시작
	@Override
	public void game(User user) {
		Computer com = new Computer();
		System.out.println("컴퓨터 결과: " + com.getResult());
		
		System.out.println(user.getName() + " 결과: " + user.getResult());
		
	}
}
