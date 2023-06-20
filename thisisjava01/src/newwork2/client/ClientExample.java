package newwork2.client;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class ClientExample {

	public static void main(String[] args) {
		try {
			Socket  socket = new Socket("localhost", 8085);
			
			System.out.println("[클라이언트] 연결 성공");
			
			 socket.close();
			 System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			
		}catch(IOException e) {

	}

}
}
