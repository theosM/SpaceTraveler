package spacetraveler.model;

import org.junit.Test;
import spacetraveler.model.resources.Resources;
import spacetraveler.model.resources.ResourcesEnum;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ContractTest {
    private Player player;
    private Contract contract;

    @Test
    public void countResourceValidate() {
        player = new Player(50);
        player.addResources(new Resources(ResourcesEnum.DIRT),5);
        player.addResources(new Resources(ResourcesEnum.STEAL),50);
        player.addResources(new Resources(ResourcesEnum.WOOD),499);

        ArrayList<QuantityResource> resources = new ArrayList<>();
        resources.add( new QuantityResource(new Resources(ResourcesEnum.DIRT),5));
        resources.add( new QuantityResource(new Resources(ResourcesEnum.STEAL),50));
        resources.add( new QuantityResource(new Resources(ResourcesEnum.WOOD),500));
        contract = new Contract(resources);

        assertEquals(2,contract.countResourceValidate(player));
    }
}