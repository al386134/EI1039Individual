package HW5.Ej4.Context;

import HW5.Ej4.Classifier.ClassStrategy;
import HW5.Ej4.Distance.DistStrategy;

public class ContextSimple {
    private ClassStrategy strat;
    private DistStrategy dist;

    public ContextSimple(ClassStrategy strat, DistStrategy dist) {
        this.strat = strat;
        this.dist = dist;
    }

    public void setClassifierStrategy(ClassStrategy strategy){
        this.strat = strategy;
    }

    public void setDistStrategy(DistStrategy dist) {
        this.dist = dist;
    }

    public void run(){
        this.dist.calculate();
        this.strat.execute();
    }
}
