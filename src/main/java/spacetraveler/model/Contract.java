package spacetraveler.model;

import java.util.*;

public class Contract {

	private List<ResourceSimple> resources;

	public Contract(List<ResourceSimple> resources) {
		this.resources = resources;
	}

	public List<ResourceSimple> getResources() {
		return resources;
	}
}