package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface tcpStreams {

    /**
     * @return InputStream
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;


    /**
     * @return OutputStream
     * @throws IOException
     */
    OutputStream getOutputStream() throws IOException;

}
