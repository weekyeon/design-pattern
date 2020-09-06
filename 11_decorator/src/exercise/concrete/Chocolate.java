package exercise.concrete;

import exercise.abst.AbstCakeDecorator;
import exercise.abst.Cake;

public class Chocolate extends AbstCakeDecorator {

    public Chocolate(Cake cake) {
        super(cake);
    }

    public String addChocolate(){
        return " + 초콜릿";
    }

    @Override
    public String baseCake() {
        return super.baseCake()+addChocolate();
    }
}
