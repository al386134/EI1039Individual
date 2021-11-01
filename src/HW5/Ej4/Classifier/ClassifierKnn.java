package HW5.Ej4.Classifier;

import HW5.Ej4.Distance.DistStrategy;

public class ClassifierKnn implements ClassStrategy {
    private DistStrategy distStrategy;

    public ClassifierKnn(DistStrategy distStrategy) {
        this.distStrategy = distStrategy;
    }

    public void setDistStrategy(DistStrategy distStrategy){
        this.distStrategy = distStrategy;
    }

    @Override
    public void execute(){
        this.distStrategy.calculate();
        System.out.println("ClassifierKnn executed");
    }
}
