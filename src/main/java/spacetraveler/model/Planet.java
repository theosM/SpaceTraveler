package spacetraveler.model;

import java.util.*;

public class Planet {

	private Universe universe;
	private List<QuantityResource> veins;
	private Coordinates coordinates;
	private String name;

	public Planet(Coordinates coordinates, String name) {
		this.universe = null;
		this.veins = new ArrayList<>();
		this.coordinates = coordinates;
		this.name = name;
	}

	public Universe getUniverse() {
		return universe;
	}

	public void setUniverse(Universe universe) {
		this.universe = universe;
	}
}