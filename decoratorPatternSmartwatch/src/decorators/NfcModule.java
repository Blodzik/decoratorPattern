package decorators;

import core.Smartwatch;

public class NfcModule extends SmartWatchDecorator {
    public NfcModule(Smartwatch wrapper) {
        super(wrapper);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " NFC payment";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}
