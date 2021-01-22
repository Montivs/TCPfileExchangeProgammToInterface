package apps;

import java.io.IOException;

public interface fileExchangeApp {

    /**
     * sendFile : Reads File and sends content to remote host
     * @param fileName
     * @param hostName
     * @param port
     * @throws IOException
     */
    void sendFile(String fileName, String hostName, int port) throws IOException;

    /**
     * receiveFile: receives content and writes to new File
     * @param fileName
     * @param port
     * @throws IOException
     */
    void receiveFile(String fileName, int port) throws IOException;
}
