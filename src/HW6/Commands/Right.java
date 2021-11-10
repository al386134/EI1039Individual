package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Right implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Right(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la derecha";
    }

    @Override
    public void execute() {
        this.beeBot.mover(movimiento);
    }
}
