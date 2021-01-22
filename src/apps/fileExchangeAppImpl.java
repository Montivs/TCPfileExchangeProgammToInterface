package apps;
import tcp.*;
import tcpFileExchange.*;

import java.io.IOException;

public class fileExchangeAppImpl implements fileExchangeApp {

    @Override
    public void sendFile(String fileName, String hostName, int port) throws IOException {
        tcpClient client = new tcp();
        tcpStreams clientStream = client.connectToHost(hostName,port);
        fileExchange sendFile = new fileExchangeImpl();
        sendFile.readFromFile(fileName,clientStream.getOutputStream());
    }

    @Override
    public void receiveFile(String fileName, int port) throws IOException {

        tcpServer server = new tcp();
        tcpStreams serverStream = server.acceptConnection(port);
        fileExchange receiveFile = new fileExchangeImpl();
        receiveFile.writeToFile(fileName, serverStream.getInputStream());

    }
}
