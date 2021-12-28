package rpsg;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

import com.framework.TcpApplication;

public class Game extends GameAppClient  {			
	
public static void play() {	         

        //입력 메서드 객체화
        Scanner sc = new Scanner(System.in);        
        //컴퓨터와 유저가 무었을 내었는지 확인
        String comStr="",userStr="";        
        //결과
        int win=0,lose=0,draw=0,fail=0;

//        //10이상일 경우 프로그램 종료
//        if(coin > 10) {
//            System.out.println("10회 이상 사용할 수 없습니다.");
//            return;
//        }
        
        //게임 시작
        System.out.println("\r\n" + 
                "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\r\n" +
                "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\r\n" +
                "\r\n"+
        		"   _____   ___  ___  ___ _____   _____  _____   ___  ______  _____ \r\n" + 
        		"  |  __ \\ / _ \\ |  \\/  ||  ___| /  ___||_   _| / _ \\ | ___ \\|_   _|\r\n" + 
        		"  | |  \\// /_\\ \\| .  . || |__   \\ `--.   | |  / /_\\ \\| |_/ /  | |  \r\n" + 
        		"  | | __ |  _  || |\\/| ||  __|   `--. \\  | |  |  _  ||    /   | |  \r\n" + 
        		"  | |_\\ \\| | | || |  | || |___  /\\__/ /  | |  | | | || |\\ \\   | |  \r\n" + 
        		"   \\____/\\_| |_/\\_|  |_/\\____/  \\____/   \\_/  \\_| |_/\\_| \\_|  \\_/  \r\n" + 
        		"                                                                 \r\n" + 
        		"                                                                 \r\n" + 
        		  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\r\n" +
        		  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\r\n" +
        		"");
        System.out.println();
        System.out.println("잔여코인: " + coin);
        System.out.println();
        System.out.println();
        System.out.println("가위[1] 바위[2] 보[3] 나가기[0]");
        System.out.println();

        for(int i = 0;i < coin;i++) {
            //1~3의 랜덤 숫자
            int computer =(int)(Math.random()*3)+1;
            //사용자 입력값
            int user = sc.nextInt();
            //컴퓨터 값
            if(computer == 1) {
                comStr="가위";
            }else if(computer == 2) {
                comStr="바위";
            }else if(computer == 3) {
                comStr="보";
            }else {
                comStr="시스템 오류";
            }
            //유저의 값
            if(user == 1) {
                userStr="가위";
            }else if(user == 2) {
                userStr="바위";
            }else if(user == 3) {
                userStr="보";
            }else {
                userStr="손가락 오류";
            }if(user == 0) { // 게임 나오기
            	
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
        			System.out.println("프로그램을 종료합니다.");
        			System.exit(0);  
        			
        		}   

            }
            
            System.out.println("[유저] "+userStr+"  =VS= "+comStr+" [컴퓨터]");
            if(user >= 1 && user <= 3) {
                if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
                    win++;
                    coin++;
                    System.out.println("[승리] 잔여코인: " + coin);
                }else if(computer == user) {
                    lose++;                    
                    System.out.println("[무승부] 잔여코인: " + coin);
                }else {
                    draw++;
                    coin--;
                    System.out.println("[패배] 잔여코인: " + coin);
                }
            }else {
                fail++;
                System.out.println("값을 잘못 입력 하였습니다.");    
            }
            System.out.println("=========================================");
        }
        // 승리 / (총 경기) x 100
        float odds = ((float)win/(float)(coin))*100;
        
        System.out.println("[결과] 게임 횟수 : " +coin);
        System.out.println("[전적] win:"+win+"번, lose:"+lose+"번, draw:"+draw+"번, 무효:"+fail+"번");
        System.out.printf("[승률] %.2f%% \n",odds);
        System.out.println("================GAME END=================");
        sc.close();
        
    }
}
 

	


