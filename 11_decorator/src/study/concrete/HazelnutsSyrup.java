package study.concrete;

import study.abst.AbstAddCustom;
import study.abst.Coffee;

public class HazelnutsSyrup extends AbstAddCustom {

    public HazelnutsSyrup(Coffee coffee) {
        super(coffee);
    }

    public int price(){
        return 300;
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+price();
    }
}
