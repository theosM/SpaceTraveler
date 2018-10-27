package spacetraveler.model;

import java.util.Objects;

public class Coordinates {

	private int posX;
	private int posY;

	public Coordinates(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	public Coordinates(){
		this.posX = 0;
		this.posY = 0;
	}

	public double getDistance(Coordinates coordinate) {
		return  Math.sqrt(Math.pow((coordinate.posX - this.posX),2)+Math.pow((coordinate.posY - this.posY),2));
	}

	@Override
	public String toString() {
		return "Coordinates{" +
				"X : " + posX +
				", Y :" + posY +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Coordinates that = (Coordinates) o;
		return posX == that.posX &&
				posY == that.posY;
	}

	@Override
	public int hashCode() {
		return Objects.hash(posX, posY);
	}
}