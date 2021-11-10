package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Go implements Command {
    private BeeBot beeBot;

    public Go(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        this.beeBot.go();
    }
}
