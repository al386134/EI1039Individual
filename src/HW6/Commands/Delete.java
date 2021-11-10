package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Delete implements Command {
    private BeeBot beeBot;

    public Delete(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        this.beeBot.delete();
    }
}
