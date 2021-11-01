package HW5.Ej4.Context;

import HW5.Ej4.Classifier.ClassStrategy;

public class ContextSimple {
    private ClassStrategy strat;

    public ContextSimple(ClassStrategy strat) {
        this.strat = strat;
    }

    public void setClassifierStrategy(ClassStrategy strategy){
        this.strat = strategy;
    }

    public ClassStrategy getClassifierStrategy() { return this.strat; }

    public void run(){
        this.strat.execute();
    }
}
