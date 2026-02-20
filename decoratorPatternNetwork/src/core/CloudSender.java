package core;

import java.util.Random;

public class CloudSender implements DataSender {
    private static final Random random = new Random();

    @Override
    public String send(String data) {
        double chance = random.nextDouble();

        if(chance < 0.3) {
            throw new RuntimeException("Network timeout!");
        }

        return "200 OK: Received: " + data;
    }
}
