package decorators;

import core.Smartwatch;

public class LeatherStrap extends SmartWatchDecorator {
    public LeatherStrap(Smartwatch wrapper) {
        super(wrapper);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Premium Leather Strap";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 80;
    }
}
