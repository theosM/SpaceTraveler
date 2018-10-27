package spacetraveler.model;

import spacetraveler.model.resources.Resources;

import java.util.*;

public class Player {

	public Coordinates coordinate;
	public ArrayList<QuantityResource> resourcesGathered;
	public int carburant;

	private static int costMove = 10;

	public Player(int carburant) {
		this.coordinate = new Coordinates();
		this.resourcesGathered = new ArrayList<>();
		this.carburant = carburant;
	}


	public boolean setCoordinate(Coordinates coordinate) {
		double distance = Math.ceil(this.coordinate.getDistance(coordinate));
	    if(carburant - (costMove*distance) >= 0){
            carburant -= costMove*distance;
            this.coordinate = coordinate;
            return true;
        }
        return false;
	}

	public void addResources(Resources resources, int quantity){
		if(resourcesGathered.contains(resources)){
			resourcesGathered.get(resourcesGathered.indexOf(resources)).addQuantity(quantity);
		}else {
		    resourcesGathered.add(new QuantityResource(resources,quantity));
        }
	}


}