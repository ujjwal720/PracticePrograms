package server;



import java.io.*;
import java.net.*;

class ServeOneJabber extends Thread {
  private Socket socket;
  private BufferedReader in;
  private PrintWriter out;

  public ServeOneJabber(Socket s) throws IOException {
    socket = s;
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    // Enable auto-flush:
    out = new PrintWriter(socket.getOutputStream(), true);
    // If any of the above calls throw an exception, the caller is responsible for
    // closing the socket. Otherwise, the thread will close it.
    start(); // Calls run()
  }

  public void run() {
    try {
      String str;
      while ((str = in.readLine()) != null) {
        if (str.equals("END"))
          break;
        System.out.println("Echoing: " + str);
        out.println(str);
      }
      System.out.println("closing...");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

public class MultiJabberServer {
  static final int PORT = 8080;

  public static void main(String[] args) throws IOException {
    ServerSocket s = new ServerSocket(PORT);
    System.out.println("Server Started");
    try {
      while (true) {
        // Blocks until a connection occurs:
        Socket socket = s.accept();
        System.out.println("Client Connected");
        try {
          new ServeOneJabber(socket);
        } catch (IOException e) {
          // If it fails, close the socket,
          // otherwise the thread will close it:
          socket.close();
        }
      }
    } finally {
      s.close();
    }
  }
}
