package study;

import study.abst.BikeFactory;
import study.abst.Body;
import study.abst.Wheel;
import study.gt.GtFactory;
import study.sam.SamFactory;

public class Main {
    public static void main(String[] args) {

        BikeFactory bikeFactory = new SamFactory();
        Body body = bikeFactory.createBody();
        Wheel wheel = bikeFactory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

        BikeFactory bikeFactory1 = new GtFactory();
        Body body1 = bikeFactory1.createBody();
        Wheel wheel1 = bikeFactory1.createWheel();

        System.out.println(body1.getClass());
        System.out.println(wheel1.getClass());

    }
}
