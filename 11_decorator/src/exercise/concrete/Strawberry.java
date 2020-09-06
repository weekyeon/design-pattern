package exercise.apple;

import exercise.abst.AbstCakeDecorator;
import exercise.abst.Cake;

public class Strawberry extends AbstCakeDecorator {
    // ConcreteDecorator
    // 케익에 올릴 토핑(장식) 구현체

    public Strawberry(Cake cake) {
        // Component의 baseCake() 메소드를 먼저 수행
        super(cake);
    }

    public String addStrawberry(){
        return " + 딸기";
    }

    @Override
    public String baseCake() {
        // AbstCakeDecorator 기능 덧붙임
        return super.baseCake() + addStrawberry();
    }
}
