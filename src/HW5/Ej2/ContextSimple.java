package HW5.Ej2;

public class ContextSimple {
    private Strategy strat;

    public ContextSimple(Strategy strat) {
        this.strat = strat;
    }

    public void setClassifierStrategy(Strategy strategy){
        this.strat = strategy;
    }

    public void run(){
        System.out.println(this.strat.execute() + " executed");
    }
}
