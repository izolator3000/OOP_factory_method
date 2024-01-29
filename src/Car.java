import java.net.SocketOption;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("I drive down");
    }
}
