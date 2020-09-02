package study.concrete;

import study.abst.AbstAddCustom;
import study.abst.Coffee;

public class Espresso extends AbstAddCustom {

    public Espresso(Coffee coffee) {
        super(coffee);
    }

    public int price() {
        return 700;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+price();
    }
}
