package HW3.Creator;

import HW3.Product.Knife;

public abstract class KnifeStore {
    public Knife orderKnife(String type) {
        Knife knife = null;

        knife = createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.wrapp();

        return knife;
    }
    public abstract Knife createKnife(String type);
}