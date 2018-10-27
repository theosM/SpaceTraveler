package spacetraveler.model;

import java.util.*;

public class Planet {

	private Universe universe;
	private List<Vein> veins;
	private Coordinate coordinate;
	private String name;

	public Planet( Coordinate coordinate, String name) {
		this.universe = null;
		this.veins = new ArrayList<>();
		this.coordinate = coordinate;
		this.name = name;
	}

	public Universe getUniverse() {
		return universe;
	}

	public void setUniverse(Universe universe) {
		this.universe = universe;
	}
}