package tcpFileExchange;

import java.io.*;

import tcp.*;

public class fileExchangeImpl implements fileExchange{

    @Override
    public void writeToFile(String fileName, InputStream is) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        this.dataStream(is, fos);

    }

    @Override
    public void readFromFile(String fileName, OutputStream os) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        this.dataStream(fis,os);
    }

    private void dataStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        int read = 0;
        do{
            read = inputStream.read();
            if(read != -1){
                outputStream.write(read);
            }
        }while(read!=-1);
    }
}
