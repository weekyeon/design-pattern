package study.abst;

public interface BikeFactory {

    // 관련있는 부품들을 생성하는 곳
    public Body createBody();
    public Wheel createWheel();
}
