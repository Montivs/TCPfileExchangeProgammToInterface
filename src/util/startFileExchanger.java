package util;
import apps.*;


import java.io.IOException;

public class startFileExchanger {
    /**
     *
     * @param args server: args[0]= port ,args[1]= fileName // CMD: java -jar 4400 copy.txt / SERVER
     * @param args client: args[0]= host ,args[1]= port ,args[2]= fileName // java -jar localhost 4400 test.txt / CLIENT
     * @throws IOException
     */
    public static void main(String []args) throws IOException {

        String filename;
        fileExchangeApp fileExchange = new fileExchangeAppImpl();

        if(args.length==3){
            String host = args[0];
            int port = Integer.parseInt(args[1]);
            filename = args[2];
            fileExchange.sendFile(filename,host,port);
        }
        else if(args.length==2) {
            int hostPort = Integer.parseInt(args[0]);
            filename = args[1];
            fileExchange.receiveFile(filename, hostPort);
        }
        else{
            System.out.println("Parameters missing!");
            System.out.println("Server: port, fileName");
            System.out.println("Client: hostname, port, fileName");
        }

        /**
         *  Erstens: Eine Text Datei in Ordner erstellen.
         *  Die Daten, die sich in der Datei befinden, werden zum Server geschickt.
         *  Dabei wird ein neue Datei enstehen, die man bei args[1] definiert.
         *
         *  CMD: java -jar 4400 copy.txt / SERVER
         *  CMD: java -jar localhost 4400 test.txt / CLIENT
         */
    }
}
