package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Forward implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Forward(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia delante";
    }

    @Override
    public void execute() {
        this.beeBot.mover(movimiento);
    }
}
