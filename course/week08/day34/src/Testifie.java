import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现多线程，网络编程，IO流
 */
public class Testifie {

    public static void main(String[] args) {
        new Thread(new Server()).start();
        new Thread(new Client()).start();
    }
}

class Server implements Runnable {
    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started on port 8080");
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            System.out.println("Received from client: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Client implements Runnable {
    @Override
    public void run() {
        try (Socket socket = new Socket("localhost", 8080)) {
            OutputStream out = socket.getOutputStream();
            out.write("Hello, Server!\n".getBytes());
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}