package rpsg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.framework.TcpApplication;

public class GameAppClient extends TcpApplication {
	
	public static PrintWriter pw = null;
	public static BufferedReader keyboard = null;
	public static BufferedReader br = null;
	public static Socket sSock = null;
	static Scanner sc = new Scanner(System.in);
	
	//�⺻ ���� �Ҵ�		   
	static int coin = 100;
	
	// ���� IP �ּ�
	private static String sAddr = null;
	
	// Ŭ���̾�Ʈ ID
	static String id = null;	
	
	// ���ø����̼� �ʱ�ȭ
	@Override
	public void init() {		
		super.init();
	}
	
	//���ø����̼� ����
	@Override
	public void start() {		
		
		try {
			// 1. ��������			
			sSock = new Socket(TcpApplication.IP, TcpApplication.PORT);
			sAddr = sSock.getInetAddress().getHostAddress();
			
		   // 2.1 �۽� ��Ʈ�� ���			
		   pw = new PrintWriter(new OutputStreamWriter(sSock.getOutputStream()));

		   // 2.2 ���� ��Ʈ�� ���
		   br = new BufferedReader(new InputStreamReader(sSock.getInputStream()));
		   
		   // 2.3 Ű���� ��Ʈ�� ���
		   keyboard = new BufferedReader(new InputStreamReader(System.in));
		   			
		   // 3. Ŭ���̾�Ʈ�� id�� �����Ѵ�.
		   System.out.println("������ �����ϼ̽��ϴ�.");
		   System.out.println("ID�� �����ϼ���");
		   System.out.print("ID: ");

		   // id ������ ���ۿ� ����� �Է� �� ����
		   id = keyboard.readLine();
		   // ������ id ����
		   pw.println(id);	 
		   pw.flush();
		   
		   
		  //�ι�° �޴� ���
				showMenu2();
//				while(true) {
					
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
					String line = null;
					System.out.println(line);
					while((line = br.readLine()) != null) {
						// �����ϴ� ���
						if(line.equalsIgnoreCase("/quit")) {
							// �������� ��ε�ĳ����
							GameTcpServerHandler.broadCast("[" + id + "] ���� �����̽��ϴ�..");
							break;
						}
						
					}	
					
					
					
				default:
					System.out.println("�ٽ� �Է��ϼ���");
				    break;		
				    
			}
//		} // while�� ������
				// 4. ������ ������ ������ ������ ����� �����带 �����Ͽ� ����
				Thread thread = new Thread(new GameTcpClientHandler());
				thread.start();		
		   
			
		}catch (IOException ex) {
			ex.printStackTrace();
		}		
		   
	}
	public static void showMenu2() {
		  System.out.printf("					          		 \n");
		   System.out.printf("������ ��Ҹ� �����ϼ��� .          		 \n");
		   System.out.printf("                   			     \n");
		   System.out.printf("          [1] �� Game Play            ");
	       System.out.printf("[2] �� Market Entrance                 ");
	       System.out.printf("[0] �� Exit                    \n");
	       System.out.printf("                   			     \n");		
	       
	       
	         int select2 = sc.nextInt();

	  		switch (select2) {	
	  		
	  		case 1:			           
	  			TcpApplication app = new GameAppClient();	
	  			Game.play();
	  			break;            	
	  			
	  		case 2:
	  			Shop.shopIn();
	 				break;		
	  			
	  		case 0:
	  			System.out.println("���α׷��� �����մϴ�.");
	  			//System.exit(0);
	  			pw.println("0");
			    pw.flush();
	  			break;
	  		}   
	          
	          
		}
	}

