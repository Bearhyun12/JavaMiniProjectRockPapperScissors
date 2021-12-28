package rpsg;

import java.util.Scanner;

import com.framework.TcpApplication;

public class GameTcpClient {	
	public static void main(String[] args) {
		
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
	    //ù��° �޴� ���
		
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
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);	

		default:
			System.out.println("�ٽ� �Է��ϼ���");
			break;
		}
		
		}// while�� ������
		
	

} // ���� ������
	private static void showMenu1() {
	System.out.printf("                                      \n");
	System.out.printf("                                      \n");
    System.out.printf("          �����������������������������\n");
    System.out.printf("          ��                          ��                        ��\n");
    System.out.printf("          ��      <<< CLIENT >>>      ��   <<< 211�� 6�� >>>    ��\n");
    System.out.printf("          ��                          ��                        ��\n");
    System.out.printf("          �����������������������������\n");
    System.out.printf("                                      \n");

    System.out.printf("                                      \n"); 
    System.out.printf("������ ���� �Ͻðڽ��ϱ�?                   \n");
    System.out.printf("                                      \n");
    System.out.printf("          [1] �� yes            ");
    System.out.printf("[0] �� No                     \n");
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
				" ��������������������������������������                                       \r\n" + 
				" ��                          .*           *,           *~                ��     \r\n" + 
				" ��      :;;;;: -@    ,@@@@~ .@   ~:   :  @~    $@@@*  @;    :.    :.    ��     \r\n" + 
				" ��      @@@@@@ -@    @#  *@ .@   $@   @  @~   =@  .@  @;    @,    @-    ��     \r\n" + 
				" ��          @$ -@    @    @ .@   $@   @  @~   #*   @* @;    @#$$$$@-    ��     \r\n" + 
				" ��         .@  -@    #@--@@ .@   $@@@@@  @~   !@:-#@  @;    @$====@-    ��     \r\n" + 
				" ��         @@  -@##   #@@$  .@   $@..,@  @@@.  ~@@@   @;    @,    @-    ��     \r\n" + 
				" ��        =@.  -@;;    .-:;;.@   $@   @  @*;.   .,~;;-@;    @@@@@@@-    ��     \r\n" + 
				" ��       @@-   -@   @@@@@@@#.@   $@..,@  @~  *@@@@@@@:@;       @;       ��     \r\n" + 
				" ��     -@@,    -@      *@   .@   $@@@@@  @~      @.   @;       @;       ��     \r\n" + 
				" ��      *      -@      *@   .@           @~      @.   @;  ~~~~~@*~~~~   ��     \r\n" + 
				" ��             -@      *@   .@           @~      @.   @;  @@@@@@@@@@@   ��     \r\n" + 
				" ��             -@      *@   .@           @~      @.   @;                ��     \r\n" + 
				" ��                                                                      ��     \r\n" + 
				" �������������������������������������� \n");


		
		System.out.printf("                                      \n");	
	}	
	
}


