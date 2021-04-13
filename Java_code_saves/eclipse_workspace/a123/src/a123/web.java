package a123;


public class SocketClient extends Thread {
	private Socket socket;
	private int port = 10020;
	private String hostIp = "127.0.0.9";
	public SocketClient(byte[] b){
		try {
			BufferedReader in = null;
			PrintWriter out = null;
			socket = new Socket(hostIp, port);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			System.out.println(Arrays.toString(b));
			out.println(Arrays.toString(b)); //���͵������
			System.out.println("Back�ؿͻ������� message from server:[" + in.readLine() + "]");
			out.close();
			in.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //���ǿͻ�������ˣ���
}
//���Ƿ����
public class SocketServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private int port = 10020;
	private ExecutorService executeService = Executors.newFixedThreadPool(10); //�̳߳�
	public SocketServer(){
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("SocketServer have been started.[" + serverSocket + "]");
			while(true){
				socket = serverSocket.accept();
				executeService.submit(new Runnable(){
					public void run(){
						try{
							BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
							PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
							String s1 = in.readLine();
							System.out.println("Server Received:[" + s1 + "]"); //���
							out.println("Server Received:[" + s1 + "]"); //�Żص��ͻ��˵�
							out.close();
							in.close();
						}catch (Exception e) {
						}finally{
							try {
								System.out.println("�ر�����");
								socket.close();
							} catch (IOException e) {
								System.out.println("close socket error.");
								e.printStackTrace();
							}
						}
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(null != serverSocket){
					serverSocket.close();
					System.out.println("���ӳعر� ");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
