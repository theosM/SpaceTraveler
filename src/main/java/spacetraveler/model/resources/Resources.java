package spacetraveler.model.resources;

import java.util.List;
import java.util.Objects;

public class Resources {

    public ResourcesEnum resources;

    public Resources(ResourcesEnum resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resources resources1 = (Resources) o;
        return resources == resources1.resources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
}