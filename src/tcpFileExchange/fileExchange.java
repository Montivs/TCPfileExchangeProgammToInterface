package tcpFileExchange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface fileExchange {

    /**
     * writeToFile : writes from inputStream to selected file
     * @param fileName name of File, where content should be written exp. copy.txt
     * @param inputStream
     * @throws IOException
     */
    void writeToFile(String fileName, InputStream inputStream) throws IOException;


    /**
     *readFromFile : reads File and puts to OutputStream
     * @param fileName name of File, where the content should be taken
     * @param outputStream
     * @throws FileNotFoundException
     * @throws IOException
     */
    void readFromFile(String fileName, OutputStream outputStream) throws FileNotFoundException, IOException;

}
