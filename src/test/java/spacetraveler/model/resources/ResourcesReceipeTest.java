package spacetraveler.model.resources;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResourcesReceipeTest {

    private ResourcesReceipe resources;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void resourcesReceipeTest(){
        List<RawResources> receipe = new ArrayList<>();
        receipe.add(RawResources.GAS);
        this.resources = new ResourcesReceipe(ResourcesEnum.FUEL,receipe);
        assertEquals(RawResources.GAS,resources.receipe.get(0));
    }


}