package Session13;

import java.net.*;
import java.io.*;

public class ChatServer {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(6060)) {
            System.out.println("Server is running and waiting for client...");

            // Chấp nhận kết nối từ client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Tạo các luồng đọc và ghi
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Giao tiếp với client
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {
                clientMessage = reader.readLine(); // Đọc tin nhắn từ client
                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + clientMessage);

                // Server trả lời
                System.out.print("Server: ");
                serverMessage = consoleReader.readLine();
                writer.println(serverMessage);
                if (serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Server closed connection.");
                    break;
                }
            }

            // Đóng kết nối
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
