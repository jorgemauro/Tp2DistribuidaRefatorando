import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;

public class Client implements Runnable {
    int ip;
    Listener ear;
    Printer mouth;
    HashMap<String,Client> Brothers;
    boolean canTalk;
    int port;
    public Client(int port, int ip){
        this.ip=ip;
        this.canTalk=false;
        this.port=port;
    }

    @Override
    public void run() {
        try {
            this.ear=new Listener(this.ip, this.port);
            this.mouth= new Printer(this.ip,this.port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while(true) {
                Socket session = this.ear.listener.accept();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
