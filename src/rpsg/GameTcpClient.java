package rpsg;

import java.util.Scanner;

import com.framework.TcpApplication;

public class GameTcpClient {	
	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
	    //첫번째 메뉴 출력
		
		showMenu3();
		showMenu1();	
		
		while(true) {
		int select = sc.nextInt();
		
		switch (select) {
	
		case 1:				
			TcpApplication app = new GameAppClient();
			app.init();		
			app.start();			
			sc.close();			
			break;			

		case 0:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);	

		default:
			System.out.println("다시 입력하세요");
			break;
		}
		
		}// while문 스코프
		
	

} // 메인 스코프
	private static void showMenu1() {
	System.out.printf("                                      \n");
	System.out.printf("                                      \n");
    System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
    System.out.printf("          ■                          ■                        ■\n");
    System.out.printf("          ■      <<< CLIENT >>>      ■   <<< 211기 6조 >>>    ■\n");
    System.out.printf("          ■                          ■                        ■\n");
    System.out.printf("          ■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
    System.out.printf("                                      \n");

    System.out.printf("                                      \n"); 
    System.out.printf("서버에 접속 하시겠습니까?                   \n");
    System.out.printf("                                      \n");
    System.out.printf("          [1] → yes            ");
    System.out.printf("[0] → No                     \n");
    System.out.printf("                                      \n");
    System.out.printf("                                      \n");		
	
}
	
	public static void showMenu3() {
		System.out.printf("                                      \n");
		System.out.printf("                                      \n");
		System.out.printf("\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■                                       \r\n" + 
				" ■                          .*           *,           *~                ■     \r\n" + 
				" ■      :;;;;: -@    ,@@@@~ .@   ~:   :  @~    $@@@*  @;    :.    :.    ■     \r\n" + 
				" ■      @@@@@@ -@    @#  *@ .@   $@   @  @~   =@  .@  @;    @,    @-    ■     \r\n" + 
				" ■          @$ -@    @    @ .@   $@   @  @~   #*   @* @;    @#$$$$@-    ■     \r\n" + 
				" ■         .@  -@    #@--@@ .@   $@@@@@  @~   !@:-#@  @;    @$====@-    ■     \r\n" + 
				" ■         @@  -@##   #@@$  .@   $@..,@  @@@.  ~@@@   @;    @,    @-    ■     \r\n" + 
				" ■        =@.  -@;;    .-:;;.@   $@   @  @*;.   .,~;;-@;    @@@@@@@-    ■     \r\n" + 
				" ■       @@-   -@   @@@@@@@#.@   $@..,@  @~  *@@@@@@@:@;       @;       ■     \r\n" + 
				" ■     -@@,    -@      *@   .@   $@@@@@  @~      @.   @;       @;       ■     \r\n" + 
				" ■      *      -@      *@   .@           @~      @.   @;  ~~~~~@*~~~~   ■     \r\n" + 
				" ■             -@      *@   .@           @~      @.   @;  @@@@@@@@@@@   ■     \r\n" + 
				" ■             -@      *@   .@           @~      @.   @;                ■     \r\n" + 
				" ■                                                                      ■     \r\n" + 
				" ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ \n");


		
		System.out.printf("                                      \n");	
	}	
	
}


