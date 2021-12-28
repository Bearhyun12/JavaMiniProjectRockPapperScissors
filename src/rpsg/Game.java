package rpsg;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

import com.framework.TcpApplication;

public class Game extends GameAppClient  {			
	
public static void play() {	         

        //�Է� �޼��� ��üȭ
        Scanner sc = new Scanner(System.in);        
        //��ǻ�Ϳ� ������ ������ �������� Ȯ��
        String comStr="",userStr="";        
        //���
        int win=0,lose=0,draw=0,fail=0;

//        //10�̻��� ��� ���α׷� ����
//        if(coin > 10) {
//            System.out.println("10ȸ �̻� ����� �� �����ϴ�.");
//            return;
//        }
        
        //���� ����
        System.out.println("\r\n" + 
                "������������������������������������\r\n" +
                "������������������������������������\r\n" +
                "\r\n"+
        		"   _____   ___  ___  ___ _____   _____  _____   ___  ______  _____ \r\n" + 
        		"  |  __ \\ / _ \\ |  \\/  ||  ___| /  ___||_   _| / _ \\ | ___ \\|_   _|\r\n" + 
        		"  | |  \\// /_\\ \\| .  . || |__   \\ `--.   | |  / /_\\ \\| |_/ /  | |  \r\n" + 
        		"  | | __ |  _  || |\\/| ||  __|   `--. \\  | |  |  _  ||    /   | |  \r\n" + 
        		"  | |_\\ \\| | | || |  | || |___  /\\__/ /  | |  | | | || |\\ \\   | |  \r\n" + 
        		"   \\____/\\_| |_/\\_|  |_/\\____/  \\____/   \\_/  \\_| |_/\\_| \\_|  \\_/  \r\n" + 
        		"                                                                 \r\n" + 
        		"                                                                 \r\n" + 
        		  "������������������������������������\r\n" +
        		  "������������������������������������\r\n" +
        		"");
        System.out.println();
        System.out.println("�ܿ�����: " + coin);
        System.out.println();
        System.out.println();
        System.out.println("����[1] ����[2] ��[3] ������[0]");
        System.out.println();

        for(int i = 0;i < coin;i++) {
            //1~3�� ���� ����
            int computer =(int)(Math.random()*3)+1;
            //����� �Է°�
            int user = sc.nextInt();
            //��ǻ�� ��
            if(computer == 1) {
                comStr="����";
            }else if(computer == 2) {
                comStr="����";
            }else if(computer == 3) {
                comStr="��";
            }else {
                comStr="�ý��� ����";
            }
            //������ ��
            if(user == 1) {
                userStr="����";
            }else if(user == 2) {
                userStr="����";
            }else if(user == 3) {
                userStr="��";
            }else {
                userStr="�հ��� ����";
            }if(user == 0) { // ���� ������
            	
            	GameAppClient.showMenu2();
            	
            	int select2 = sc.nextInt();

        		switch (select2) {	
        		
        		case 1:        			
        			Game.play();
        			break;            	
        			
        		case 2:
        			Shop.shopIn();
					break;		
        			
        		case 0:
        			System.out.println("���α׷��� �����մϴ�.");
        			System.exit(0);  
        			
        		}   

            }
            
            System.out.println("[����] "+userStr+"  =VS= "+comStr+" [��ǻ��]");
            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                    win++;
                    coin++;
                    System.out.println("[�¸�] �ܿ�����: " + coin);
                }else if(computer == user) {
                    lose++;                    
                    System.out.println("[���º�] �ܿ�����: " + coin);
                }else {
                    draw++;
                    coin--;
                    System.out.println("[�й�] �ܿ�����: " + coin);
                }
            }else {
                fail++;
                System.out.println("���� �߸� �Է� �Ͽ����ϴ�.");    
            }
            System.out.println("=========================================");
        }
        // �¸� / (�� ���) x 100
        float odds = ((float)win/(float)(coin))*100;
        
        System.out.println("[���] ���� Ƚ�� : " +coin);
        System.out.println("[����] win:"+win+"��, lose:"+lose+"��, draw:"+draw+"��, ��ȿ:"+fail+"��");
        System.out.printf("[�·�] %.2f%% \n",odds);
        System.out.println("================GAME END=================");
        sc.close();
        
    }
}
 

	


