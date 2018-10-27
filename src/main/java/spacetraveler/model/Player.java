package spacetraveler.model;

import java.util.*;

public class Player {

	public Coordinate coordinate;
	public List<Resource> resourcesGathered;
	public int carburant;

	private static int costMove = 10;

	public Player(int carburant) {
		this.coordinate = new Coordinate();
		this.resourcesGathered = new ArrayList<>();
		this.carburant = carburant;
	}


	public boolean setCoordinate(Coordinate coordinate) {
		int distance = this.coordinate.getDistance(coordinate);
	    if(carburant - (costMove*distance) >= 0){
            carburant -= costMove*distance;
            this.coordinate = coordinate;
            return true;
        }
        return false;
	}


}