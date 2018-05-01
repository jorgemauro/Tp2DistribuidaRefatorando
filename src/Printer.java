import java.io.IOException;
import java.net.ServerSocket;

public class Printer {
    ServerSocket printer;
    public Printer(int ip, int port) throws IOException {
        this.printer=new ServerSocket(ip,port);
    }
}
