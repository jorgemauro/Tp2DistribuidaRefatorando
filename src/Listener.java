import java.io.IOException;
import java.net.ServerSocket;

public class Listener {
    ServerSocket listener;
public Listener(int ip, int port) throws IOException {
    listener = new ServerSocket(ip, port);
}

}
