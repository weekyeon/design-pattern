package study.concrete;

import study.abst.AbstAddCustom;
import study.abst.Coffee;

public class VanillaSyrup extends AbstAddCustom {

    public VanillaSyrup(Coffee coffee) {
        super(coffee);
    }

    public int price(){
        return 500;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+price();
    }
}
