package HW3.Store;

import HW3.Creator.KnifeStore;
import HW3.Product.Knife;
import HW3.ConcreteProducts.EuropeChefKnife;
import HW3.ConcreteProducts.EuropeSteakKnife;

public class EuropeKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        } else if (type.equals("steak")) {
            return new EuropeSteakKnife();
        } else return null;
    }
}
