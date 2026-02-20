package decorators;

import core.DataSender;

public class AuthDecorator extends SenderDecorator {
    public AuthDecorator(DataSender wrapper) {
        super(wrapper);
    }

    @Override
    public String send(String data) {
        String authenticatedData = "[TOKEN: POLICE-123] " + data;
        return super.send(authenticatedData);
    }
}
