package spacetraveler.model;

import java.util.Objects;

public class Coordinate {

	private int posX;
	private int posY;

	public Coordinate(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	public Coordinate(){
		this.posX = 0;
		this.posY = 0;
	}

	public int getDistance(Coordinate coordinate) {
		return (int) Math.sqrt(Math.pow((coordinate.posX - this.posX),2)+Math.pow((coordinate.posY - this.posY),2));
	}

	@Override
	public String toString() {
		return "Coordinate{" +
				"X : " + posX +
				", Y :" + posY +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Coordinate that = (Coordinate) o;
		return posX == that.posX &&
				posY == that.posY;
	}

	@Override
	public int hashCode() {
		return Objects.hash(posX, posY);
	}
}