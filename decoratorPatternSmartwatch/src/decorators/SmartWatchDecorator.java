package decorators;

import core.Smartwatch;

public abstract class SmartWatchDecorator implements Smartwatch {
    private Smartwatch wrapper;

    public SmartWatchDecorator(Smartwatch wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String getDescription() {
        return wrapper.getDescription();
    }

    @Override
    public double getPrice() {
        return wrapper.getPrice();
    }


}
