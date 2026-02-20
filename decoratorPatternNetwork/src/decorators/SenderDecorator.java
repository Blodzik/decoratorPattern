package decorators;

import core.DataSender;

public abstract class SenderDecorator implements DataSender {
    private DataSender wrapper;

    public SenderDecorator(DataSender wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String send(String data) {
        return wrapper.send(data);
    }
}
