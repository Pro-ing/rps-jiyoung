package rsp;

import java.util.ArrayList;

import player.Computer;
import player.Player;
import player.User;

public class Rsp implements IRsp{

	@Override
	public void game(Player player) {
		
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
			if ((com=="가위" && userList.get(i).getResult()=="바위") || (com=="바위" && userList.get(i).getResult() =="보") || (com=="보" && userList.get(i).getResult() =="가위")) {
				result = ResultType.WIN;
				winner.add(userList.get(i).getName());
			} else if (com == userList.get(i).getResult()) {
				result = ResultType.DRAW;
			} else {
				result = ResultType.LOSE;
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
