package java8features;

public abstract class HorseSpecies implements Animal {
	
	public abstract boolean tailType(boolean test);
	public int noOfLeg(int leg){
		return leg*4;
	}

}
