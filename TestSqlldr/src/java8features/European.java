package java8features;

public class European extends HumanSpecies{

	
	@Override
	public int noOfLeg(int leg) {
		return leg;
	}

	@Override
	public String moveable(String state) {
		return "moveable";
	}

	@Override
	public String eyeColor(String color) {
		return "green";
	}

}
