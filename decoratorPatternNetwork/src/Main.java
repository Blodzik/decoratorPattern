import core.CloudSender;
import core.DataSender;
import decorators.AuthDecorator;
import decorators.RetryDecorator;
import decorators.TimeDecorator;

public class Main {
    public static void main(String[] args) {
        DataSender sender = new RetryDecorator(
                new TimeDecorator(
                        new AuthDecorator(
                                new CloudSender()
                        )
                )
        );

        try {
            System.out.println(sender.send("video.mp4"));
        } catch(RuntimeException e) {
            System.out.println("Gave up " + e.getMessage());
        }
    }
}