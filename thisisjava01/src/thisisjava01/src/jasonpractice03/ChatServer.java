package jasonpractice03;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {

	
	
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
	
	
	
	public void start() throws IOException {
		serverSocket =  new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
	}
	
	Thread thread = new Thread(() -> {
		try {
			while(true) {
				Socket socket = serverSocket.accept();
				SocketClient sc = new SocketClient(this, socket);
			} catch(IOException e) {
			}
			});
		thread.start();
	}
	
	public void addSocketclient(SocketClient sockerClient) {
		String key = socketClient.chatName = "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수: " + charRoom.size() + "\n");
	}
	
	
	public void sendToAll
	
	
	
	
