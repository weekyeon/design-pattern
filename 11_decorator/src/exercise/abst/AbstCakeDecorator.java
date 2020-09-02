package exercise.abst;

abstract public class AbstCakeDecorator implements Cake{
    // Decorator
    // 케익에 올라갈 토핑 추상화

    // Equaling
    // Cake 클래스를 implements 해서 Cake 클래스처럼 역할을 함
    // 즉, Decorator 생성자로 Component를 받기 때문에 Decorator의 기능을 덧붙일 수 있게 됨
    private Cake cake;
    public AbstCakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String baseCake() {
        return cake.baseCake();
    }
}
