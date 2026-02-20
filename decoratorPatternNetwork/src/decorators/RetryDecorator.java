package decorators;

import core.DataSender;

public class RetryDecorator extends SenderDecorator {
    public RetryDecorator(DataSender wrapper) {
        super(wrapper);
    }

    @Override
    public String send(String data) {
        int attempts = 0;
        int maxAttempts = 3;
        while(true) {
            try {
                return super.send(data);
            } catch(RuntimeException e) {
                attempts++;
                System.out.println("Connection failed (Attempt " + attempts + "), retrying...");

                if(attempts >= maxAttempts) {
                    System.out.println("Max attempts reached. Throwing error upwards.");
                    throw e;
                }
            }
        }
    }
}
