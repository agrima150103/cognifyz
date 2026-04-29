import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String messageFromClient, messageToClient;
            while ((messageFromClient = in.readLine()) != null) {
                System.out.println("Client: " + messageFromClient);
                System.out.print("Server: ");
                messageToClient = userInput.readLine();
                out.println(messageToClient);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
