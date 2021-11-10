package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Left implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Left(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Giro a la izquierda";
    }

    @Override
    public void execute() {
        this.beeBot.mover(movimiento);
    }
}
