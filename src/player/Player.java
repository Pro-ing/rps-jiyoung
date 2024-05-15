package player;

import java.util.ArrayList;

public class Player {

	private ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Computer> compList =new ArrayList<Computer>();
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public void addComputer(Computer com) {
		compList.add(com);
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public ArrayList<Computer> getCompList() {
		return compList;
	}

	public void setCompList(ArrayList<Computer> compList) {
		this.compList = compList;
	}
	
}
