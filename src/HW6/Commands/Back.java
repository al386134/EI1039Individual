package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;
import HW6.Historico;

public class Back implements Command {

    private Historico hist;
    private BeeBot beeBot;
    private String movimiento;

    public Back(BeeBot beeBot, Historico hist) {
        this.beeBot = beeBot;
        this.hist = hist;
        this.movimiento = "Hacia atrás";
    }

    @Override
    public String getMovimiento() {
        return movimiento;
    }

    @Override
    public void execute() {
        this.hist.add(this);
    }
}
