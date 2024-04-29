package rsp;

import java.util.Random;
import java.util.Scanner;

public class Rsp {

   String str[] = {"����", "����", "��"};
   int win, lose;
   int usrInput;
   int playCnt;
   
   Rsp(int cnt) {
      this.playCnt = cnt;
   }
   
   public void init() {
      //�ʱ�ȭ �� ����� �Է�
      Scanner scan = new Scanner(System.in);
      System.out.println("���ڷ� �Է����ּ��� 1.����, 2.����, 3.��: ");
      usrInput = scan.nextInt();

      while(true) {
         if(usrInput == 0 || usrInput > 3) {
            System.out.println("���ڸ� �ٽ� �Է����ּ���: ");
            usrInput = scan.nextInt();
         } else {
            System.out.println("�Է��� ����: " + str[usrInput-1]);
            break;
         }
      }
//      scan.close();
   }
   
   public int gameStart() {
      //��ǻ�� ���� ����
      Random r = new Random();
      int random = r.nextInt(3)+1;
      
      return random;
   }
   
   public void play(int random) {
      for (int i= 0; i < 3; i++) {
         init();
         if ((usrInput==1 && random==2) || (usrInput==2 && random==3) || (usrInput==3 && random==1)) {
            win++;
            System.out.println("�̱�");
         } else if (usrInput == random) {
            System.out.println("���");
         } else {
            System.out.println("��");
            lose++;
         }
//         System.out.println(i+1 + "�� ����");
      }
      print(win, lose);
   }
   
   public void print(int win, int lose) {
      //���
      System.out.println(win + "�� �̰���ϴ�.");
      System.out.println(lose + "�� �����ϴ�.");
      System.out.println("����");
   }
   
   public static void main(String[] args) {
      Rsp rsc = new Rsp(3);  // 3�� �̱�� ����� �ɷ� �ٲ㺸��
      
      int com = rsc.gameStart();
      rsc.play(com);
   }

}