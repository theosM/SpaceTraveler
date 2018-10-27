package spacetraveler.model.resources;

import java.util.List;

public class ResourcesReceipe extends Resources {

    public List<RawResources> receipe;

    public ResourcesReceipe(ResourcesEnum resources, List<RawResources> receipe) {
        super(resources);
        this.receipe = receipe;
    }
}
