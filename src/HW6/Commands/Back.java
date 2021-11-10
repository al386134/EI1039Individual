package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Back implements Command {
    private BeeBot beeBot;
    private String movimiento;

    public Back(BeeBot beeBot) {
        this.beeBot = beeBot;
        this.movimiento = "Hacia atrás";
    }


    @Override
    public void execute() {
        this.beeBot.mover(movimiento);
    }
}
