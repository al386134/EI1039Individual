package HW5.Ej2;

import HW5.Ej2.Classifier.ClassifierKmeans;
import HW5.Ej2.Classifier.ClassifierKnn;
import HW5.Ej2.Classifier.ClassifierSOM;
import HW5.Ej2.Context.ContextSimple;

public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println("--- KNN ---");
        ContextSimple context = new ContextSimple(new ClassifierKnn());
        context.run();

        System.out.println("--- K-means ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.run();

        System.out.println("--- SOM ---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.run();
    }
}
