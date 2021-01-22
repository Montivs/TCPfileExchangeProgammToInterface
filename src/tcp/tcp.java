package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp implements tcpClient, tcpServer, tcpStreams{
    private Socket socket;

    @Override
    public tcpStreams connectToHost(String hostname, int port) throws IOException {
        this.socket = new Socket(hostname,port);
        return this;

    }

    @Override
    public tcpStreams acceptConnection(int port) throws IOException {
        ServerSocket srvSocket = new ServerSocket(port);
        System.out.println("Creating Connection and waiting for client");
        this.socket = srvSocket.accept();
        System.out.println("Server socket accepted");
        return this;

    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.socket.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.socket.getOutputStream();
    }
}
