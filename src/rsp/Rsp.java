package rsp;

import java.util.Random;
import java.util.Scanner;

public class Rsp {

	String str[] = {"가위", "바위", "보"};
	int win, lose;
	int usrInput;
	int random;
	int playCnt, remainCnt;
	
	public void setCount(int count) {
		this.playCnt = count;
		this.remainCnt = count;
	}
	
	public int getCount() {
		return playCnt;
	}
	
	public boolean isLeft() {
		if(remainCnt == 0) {
			return false;
		}
		return true;
	}
	
	public void init() {
		//컴퓨터 랜덤 생성
		Random r = new Random();
		random = r.nextInt(3)+1;
		
		//초기화 및 사용자 입력
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("===========================");
			System.out.println("숫자로 입력해주세요 1.가위, 2.바위, 3.보: ");
			if(scan.hasNextInt()) {
				usrInput = scan.nextInt();
				if(usrInput <=0  || usrInput > 3) {
					System.out.println("숫자를 다시 입력해주세요");
					continue;
				} else {
					System.out.println("입력한 값은: " + str[usrInput-1] + " vs " + str[random-1]);
					break;
				}
			} else {
				System.out.println("숫자형식이 아닙니다.");
				scan.next();
			}
		}
	}
	
	public void play() {
		for (int i = 0; i < playCnt; i++) {
			init();
			if ((usrInput==1 && random==2) || (usrInput==2 && random==3) || (usrInput==3 && random==1)) {
				System.out.println("이겼습니다.");
				win++;
			} else if (usrInput == random) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("졌습니다.");
				lose++;
			}
			remainCnt--;
		}
	}
	
	public void print() {
		System.out.println("===========================");
		if(win > lose) {
			System.out.println(win +":" + lose + " 사용자 승");
		} else if(win < lose) {
			System.out.println(win +":" + lose + " 컴퓨터 승");
		} else {
			System.out.println(win +":" + lose + " 무승부");
		}
		System.out.println("종료합니다.");
	}
}
