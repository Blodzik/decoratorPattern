package decorators;

import core.DataSender;

public class TimeDecorator extends SenderDecorator {
    public TimeDecorator(DataSender wrapper) {
        super(wrapper);
    }

    @Override
    public String send(String data) {
        long startTime = System.nanoTime();
        String result = super.send(data);
        long endTime = System.nanoTime();
        return "Execution took " + (endTime - startTime) + "ms " + result;
    }
}
