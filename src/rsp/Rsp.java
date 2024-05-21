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
		boolean flag = true;
		
		int cnt = 0;
		
		RandomValue random = new RandomValue();
		comList.get(0).setResult(random.getResult()); //컴퓨터 수 다시 생각
		
		String com = comList.get(0).getResult();
		
		System.out.println("참여자 수 : " + userList.size());
		
		while(flag) {
			cnt++;
			for(int i = 0; i < userList.size(); i++) {
				System.out.println("===========================");
				System.out.println("-" + cnt+ "라운드-");
				System.out.println(userList.get(i).getName());
				System.out.println(comList.get(0).getName() + ":  " + com + " vs " +userList.get(i).getName() + " : " +userList.get(i).getResult());
				
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
				printResult(result); // 게임 결과 출력
			}
	
			userList.clear();
			
			if(winner.size() > 1) {
				for(int i = 0; i < winner.size(); i++) {
					userList.add(new User(winner.get(i)));
					userList.get(i).setResult(random.getResult());
				}
				winner.clear();
			}
			if (userList.size() <= 1) {
				flag = false;
			}
		}
		printWinner(winner); // 우승자 출력
	}
	
	public void printResult(ResultType result) {
		if(result == ResultType.WIN) {
			System.out.println("이겼어요!!!");
		} else if(result == ResultType.DRAW) {
			System.out.println("비겼어요");
		} else if(result == ResultType.LOSE) {
			System.out.println("졌습니다");
		}
	}

	public void printWinner(ArrayList<String> winner) {
			System.out.println("===========================");
			System.out.print("우승자는 : ");
			if(winner.size() == 0) {
				System.out.println("없습니다");
			} else {
				for(String win : winner) {
					System.out.print(win);
				}
			}
		}
}
