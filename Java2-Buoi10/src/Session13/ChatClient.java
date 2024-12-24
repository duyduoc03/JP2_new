package Session13;

import java.io.*;
import java.net.*;
public class ChatClient {
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 6060)) {
            System.out.println("Connected to the server!");

            // Tạo các luồng đọc và ghi
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Giao tiếp với server
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {
                // Gửi tin nhắn đến server
                System.out.print("Client: ");
                clientMessage = consoleReader.readLine();
                writer.println(clientMessage);
                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client closed connection.");
                    break;
                }

                // Nhận tin nhắn từ server
                serverMessage = reader.readLine();
                System.out.println("Server: " + serverMessage);
                if (serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Server disconnected.");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
