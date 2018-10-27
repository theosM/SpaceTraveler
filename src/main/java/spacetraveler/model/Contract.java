package spacetraveler.model;

import java.util.ArrayList;

public class Contract {

    public ArrayList<QuantityResource> resources;

    public Contract(ArrayList<QuantityResource> resources) {
        this.resources = resources;
    }

    public int countResourceValidate(Player player) {
        int count = 0;
        for (QuantityResource r : resources) {
            int index = player.resourcesGathered.indexOf(r);
            if (index > -1 && player.resourcesGathered.get(index).quantity >= r.quantity)
                count++;
        }

		return count;
    }
}