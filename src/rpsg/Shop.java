package rpsg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop extends GameAppClient {
	
	String bookName = "책이름";
	int bookCoin = 0;

      public static void shopIn() { // 메소드로 묶어주었다 (호출하면 반복하게)   
    	  
       Scanner sc = new Scanner(System.in);   
    	
    	shopMain();
    	shopManu();
     	  
      while(true) {   
    	  
      int select2 = sc.nextInt();             
      switch (select2) {
      case 1 : menuSwitch("혼자 공부하는 자바", 10); break;
      case 2 : menuSwitch("자바스크립트 + 제이쿼리 입문", 10); break;
      case 3 : menuSwitch("점프 투 파이썬", 20); break;      
      case 4 : menuSwitch("스프링 퀵 스타트", 20); break;
      case 5 : menuSwitch("개발자", 99); break;
      case 0 :     	  
    	  GameAppClient.showMenu2();    	  

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
  			
  		default:
  			System.out.println("다시 입력하세요");
  		    break;		
  		}      
    	  
    	  break;                     
      default : System.out.println("메뉴에 없는 항목입니다 다시 선택하세요");
                System.out.print("   > ");      
                continue;             
      }
  }// while 스코프    
      
    
 
 } //shopIn() 스코프     
  
   public static void shopMain() { 
	     System.out.println(" ──────────────────────────────────────────────────────────────────────── ");
         System.out.println("                                                      ");
         System.out.println("                                                     \r\n" + 
               "    ______             ____      _____  _   _  _____ ______    \r\n" + 
               "    | ___ \\           / ___|    /  ___|| | | ||  _  || ___ \\   \r\n" + 
               "    | |_/ /  ______  / /___     \\ `--. | |_| || | | || |_/ /   \r\n" + 
               "    | ___ \\ |______| | ___ \\     `--. \\|  _  || | | ||  __/    \r\n" + 
               "    | |_/ /          | \\_/ |    /\\__/ /| | | |\\ \\_/ /| |       \r\n" + 
               "    \\____/           \\_____/    \\____/ \\_| |_/ \\___/ \\_|       \r\n" + 
               "                                                               \r\n" + 
               "                                                               " );
         System.out.println(" ──────────────────────────────────────────────────────────────────────── ");      
      }
      
   public static void shopManu() {    
       System.out.println();

       System.out.println("\r\n" + 
             "\r\n" + 
             "		___  ___ _____  _   _  _   _ \r\n" + 
             "		|  \\/  ||  ___|| \\ | || | | |\r\n" + 
             "		| .  . || |__  |  \\| || | | |\r\n" + 
             "		| |\\/| ||  __| | . ` || | | |\r\n" + 
             "		| |  | || |___ | |\\  || |_| |\r\n" + 
             "		\\_|  |_/\\____/ \\_| \\_/ \\___/ \r\n" + 
             "                             \r\n" + 
             "                             \r\n" + 
             "" 
             );
//       System.out.println(" ──────────────────────────────────────────────────────────────────── ");
       System.out.println();
       System.out.println("    1. 혼자 공부하는 자바  …………………………… (10코인)");
       System.out.println("    2. 자바스크립트 + 제이쿼리 입문   …………… (10코인)");
       System.out.println("    3. 점프 투 파이썬   ………………………………… (20코인)");
       System.out.println("    4. 스프링 퀵 스타트   ……………………………… (20코인)");
       System.out.println("    5. 개발자   …………………………………………… (99코인)");
       System.out.println();
       System.out.println();
       System.out.println(" …………………………………………………………………………………  ");
       System.out.println();
       System.out.println("    0. 메인화면으로 ");
       System.out.println();
       System.out.println();
       System.out.println(" ──────────────────────────────────────────────────────────────────── ");
       System.out.println();
       System.out.println("   ● [" + id +"님의 현재 코인 : " + coin + "]");
       System.out.println("   구매하실 상품의 번호를 입력하세요.");
       System.out.println();
       System.out.print("   > ");         
   }   
   
   static void menuSwitch(String bookName, int bookCoin) {
   
   System.out.println();
   System.out.println(" > [" + bookName + "]은(는) [" + bookCoin + "코인]입니다. 구입할까요? ");
   System.out.println("   ● (" + id + "님의 현재 코인 :" + coin + ")");
   System.out.println();
   System.out.println("      ☞ 1. YES      ☞ 2. NO      ");
   System.out.print("   > ");
   System.out.println();
   
   int select2 = sc.nextInt();
   
   switch (select2) {
   
   case 1 :
	   coin = coin-bookCoin;
	   System.out.println(bookName + "구매했습니다.");
	   System.out.println(id+"님의 잔여 코인: " + (coin) );
	   break;
	   
   case 2 :
	   System.out.println();
	   System.out.println(bookName + "구매를 취소 하였습니다.");
	   System.out.println();	
	   System.out.println("3초후에 메뉴로 돌아 갑니다.");
	   
	   try {
		Thread.sleep(1000);
		System.out.println();
		System.out.println(" 3");
	} catch (InterruptedException e) {		
		e.printStackTrace();
	}
	   try {
		   Thread.sleep(1000);
		   System.out.println();
		   System.out.println(" 2");
	   } catch (InterruptedException e) {		
		   e.printStackTrace();
	   }
	   try {
		   Thread.sleep(1000);
		   System.out.println();
		   System.out.println(" 1");
	   } catch (InterruptedException e) {		
		   e.printStackTrace();
	   }	   
	   
	   shopManu();
   
	   break;
   }
   
   

   }
}
