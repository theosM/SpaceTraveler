package spacetraveler.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {
    private Game game;

    @Before
    public void setUp() throws Exception {

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet(new Coordinate(0,1),"terre"));
        Universe universe = new Universe(planets);

        List<ResourceSimple> resources = new ArrayList<>();
        resources.add(new ResourceSimple(TypeResourceSimple.DIRT));
        Contract contract = new Contract(resources);

        game = new Game(universe,contract,new Player(15));
    }

    @Test
    public void movePlayer() {

        Coordinate moveTo = new Coordinate(1,1);
        game.movePlayer(moveTo);
        assertEquals(moveTo,game.getCoorPlayer());
        assertEquals(5,game.getCarburantPlayer());

        // carburant insuffisant
        moveTo = new Coordinate(0,1);
        game.movePlayer(moveTo);
        assertFalse(moveTo.equals(game.getCoorPlayer()));
        assertEquals(5,game.getCarburantPlayer());


    }

    @Test
    public void exploitResource() {
    }

    @Test
    public void explorePlanet() {
    }
}