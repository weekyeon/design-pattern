package exercise.concrete;

import exercise.abst.Cake;

public class ConcreteCake implements Cake {

    // Component 구현체
    @Override
    public String baseCake() {
        return "케이크";
    }

}
