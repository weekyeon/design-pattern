package lecture.Sam;

import lecture.abst.BikeFactory;
import lecture.abst.Body;
import lecture.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel creatWheel() {
		return new SamWheel();
	}

}
