package HW5.Ej2.Context;

import HW5.Ej2.Classifier.ClassStrategy;

public class ContextSimple {
    private ClassStrategy strat;

    public ContextSimple(ClassStrategy strat) {
        this.strat = strat;
    }

    public void setClassifierStrategy(ClassStrategy strategy){
        this.strat = strategy;
    }

    public void run(){
        this.strat.execute();
    }
}
