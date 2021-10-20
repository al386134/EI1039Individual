package HW3.Store;

import HW3.ConcreteProducts.ChefKnife;
import HW3.ConcreteProducts.SteakKnife;
import HW3.Creator.KnifeStore;
import HW3.Product.Knife;

public class USKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new ChefKnife();
        } else if (type.equals("steak")) {
            return new SteakKnife();
        } else return null;
    }
}
