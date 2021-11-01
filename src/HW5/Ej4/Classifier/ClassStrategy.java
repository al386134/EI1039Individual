package HW5.Ej4.Classifier;

import HW5.Ej4.Distance.DistStrategy;

public interface ClassStrategy {
    void execute();
    void setDistStrategy(DistStrategy strategy);
}
