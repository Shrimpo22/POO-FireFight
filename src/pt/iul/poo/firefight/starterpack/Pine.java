package pt.iul.poo.firefight.starterpack;

import pt.iul.ista.poo.utils.Point2D;

public class Pine extends Terrain {
	private static final int BURN_TURNS = 10;
	private static final double PROBABILITY = 1;

	public Pine(Point2D position) {
		super(position, BURN_TURNS, PROBABILITY);
	}

	@Override
	public String getName() {
		if(burnt() == 0) {
			return "pine";
		}else {
			return "burntpine";
		}
	}

	
}
