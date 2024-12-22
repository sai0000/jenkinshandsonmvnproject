package org.ravi.devops;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
            try{
                 ServerSocket serverSocket = new ServerSocket(9000,50,InetAddress.getByName("0.0.0.0"));
                 System.out.println("Server started on port 9000");
                 System.out.println("Hello World!");
        // keep application runningw
                 while(true){
                         serverSocket.accept(); // wait for connection
                         System.out.println("connection received");
                         try{
                             Thread.sleep(1000);
                           }
                         catch(InterruptedException e) {
                                 e.printStackTrace();
                         }
                 }
            }
            catch(IOException e){
                    e.printStackTrace();
                  }
        }
}