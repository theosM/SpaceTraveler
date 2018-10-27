package spacetraveler.model;

public class Game {

	private Universe universeGame;
	private Contract contrat;
	private Player player;

	public Game(Universe universeGame, Contract contrat, Player player) {
		this.universeGame = universeGame;
		this.contrat = contrat;
		this.player = player;
	}

	public void movePlayer(Coordinate coordinate) {
		if(player.setCoordinate(coordinate)){
			System.out.print("succeed");
		}else{
			System.out.print("failed");
		}
		System.out.println(" : Move to " + coordinate.toString());
	}

	public void exploitResource() {
		// TODO - implement Game.exploitResource
		throw new UnsupportedOperationException();
	}

	public void explorePlanet() {
		// TODO - implement Game.explorePlanet
		throw new UnsupportedOperationException();
	}

	public Coordinate getCoorPlayer(){
		return player.coordinate;
	}
	public int getCarburantPlayer(){
		return player.carburant;
	}


}