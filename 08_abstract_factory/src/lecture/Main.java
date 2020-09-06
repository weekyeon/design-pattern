package lecture;

import lecture.Sam.SamFactory;
import lecture.abst.BikeFactory;
import lecture.abst.Body;
import lecture.abst.Wheel;
import lecture.gt.GtBikeFactory;

public class Main {

	public static void main(String[] args) {
		
		BikeFactory factory = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.creatWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}
