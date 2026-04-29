import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String messageFromServer, messageToServer;
            while (true) {
                System.out.print("Client: ");
                messageToServer = userInput.readLine();
                out.println(messageToServer);

                messageFromServer = in.readLine();
                if (messageFromServer == null) {
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + messageFromServer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
