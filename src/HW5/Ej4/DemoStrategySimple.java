package HW5.Ej4;

import HW5.Ej4.Classifier.ClassifierKmeans;
import HW5.Ej4.Classifier.ClassifierKnn;
import HW5.Ej4.Classifier.ClassifierSOM;
import HW5.Ej4.Context.ContextSimple;
import HW5.Ej4.Distance.DistanceEuclidean;
import HW5.Ej4.Distance.DistanceManhattan;

public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println("\n--- KNN with Euclidean distance ---");
        ContextSimple context = new ContextSimple(new ClassifierKnn(new DistanceEuclidean()));
        context.run();
        System.out.println("\n--- KNN with Manhattan distance ---");
        context.getClassifierStrategy().setDistStrategy(new DistanceManhattan());
        context.run();

        System.out.println("\n--- K-means with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierKmeans(new DistanceEuclidean()));
        context.run();
        System.out.println("\n--- K-means with Manhattan distance ---");
        context.getClassifierStrategy().setDistStrategy(new DistanceManhattan());
        context.run();

        System.out.println("\n--- SOM with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOM(new DistanceEuclidean()));
        context.run();
        System.out.println("\n--- SOM with Manhattan distance ---");
        context.getClassifierStrategy().setDistStrategy(new DistanceManhattan());
        context.run();
    }
}
