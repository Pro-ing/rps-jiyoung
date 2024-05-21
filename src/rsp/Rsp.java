package rsp;

import java.util.ArrayList;

import player.Computer;
import player.PlayerManager;
import player.User;

public class Rsp implements IRsp{

	@Override
	public void game(PlayerManager player) {
		
		ArrayList<User> userList = player.getUserList();
		ArrayList<Computer> comList = player.getCompList();
		ArrayList<String> winner = new ArrayList<>();
		
		ResultType result;
		
		String com = comList.get(0).getResult();
		
		System.out.println("참여자 수 : " + userList.size());
		for(int i = 0; i < userList.size(); i++) {
			System.out.println("===========================");
			System.out.println(userList.get(i).getName());
			System.out.println("===========================");
			System.out.println(comList.get(0).getName() + ":  " + com);
			System.out.println(userList.get(i).getName() + " : " +userList.get(i).getResult());
			
			if (("가위").equals(com)) {
				if(("바위").equals(userList.get(i).getResult())) {
					result = ResultType.WIN;
					winner.add(userList.get(i).getName());
				} else if(("가위").equals(userList.get(i).getResult())) {
					result = ResultType.DRAW;
				} else {
					result = ResultType.LOSE;
				}
			} else if(("바위").equals(com)) {
				if(("보").equals(userList.get(i).getResult())) {
					result = ResultType.WIN;
					winner.add(userList.get(i).getName());
				} else if(("바위").equals(userList.get(i).getResult())) {
					result = ResultType.DRAW;
				} else {
					result = ResultType.LOSE;
				}
			} else if(("보").equals(com)) {
				if(("가위").equals(userList.get(i).getResult())) {
					result = ResultType.WIN;
					winner.add(userList.get(i).getName());
				} else if(("보").equals(userList.get(i).getResult())) {
					result = ResultType.DRAW;
				} else {
					result = ResultType.LOSE;
				}
			} else {
				result =  ResultType.LOSE;
			}
			
			print(result);
		}
		
		for(String win : winner) {
			System.out.println("===========================");
			System.out.println("[우승자 : " + win + "]");
		}
	}
	
	public void print(ResultType result) {
		System.out.println(result);
	}
}
