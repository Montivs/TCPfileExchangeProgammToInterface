package tcp;

import java.io.IOException;

public interface tcpServer {
    /**
     * creates server socket and waits till client joins to the same port.
     * @param port port
     * @return
     * @throws IOException
     */

    tcpStreams acceptConnection(int port) throws IOException;
}
