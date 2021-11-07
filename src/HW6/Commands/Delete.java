package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;
import HW6.Historico;

public class Delete implements Command {
    private Historico hist;
    private BeeBot beeBot;
    private String movimiento;

    public Delete(BeeBot beeBot, Historico hist) {
        this.hist = hist;
        this.beeBot = beeBot;
        this.movimiento = "";
    }

    @Override
    public String getMovimiento() {
        return movimiento;
    }

    @Override
    public void execute() {
        this.hist.delete();
    }
}
