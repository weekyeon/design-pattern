package lecture.gt;

import lecture.abst.BikeFactory;
import lecture.abst.Body;
import lecture.abst.Wheel;

public class GtBikeFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel creatWheel() {
		return new GtWheel();
	}

}
