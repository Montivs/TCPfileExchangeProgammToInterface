package tcp;

import java.io.IOException;

public interface tcpClient {
    /**
     * connectToHost : creats client socket that connects to server, if server is on, else connection break.
     * @param hostname hostname
     * @param port port
     * @return
     * @throws IOException
     */
    tcpStreams connectToHost(String hostname, int port) throws IOException;


}
