package study.gt;

import study.abst.BikeFactory;
import study.abst.Body;
import study.abst.Wheel;

public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
