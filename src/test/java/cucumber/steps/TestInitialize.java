package cucumber.steps;

import com.samucatezu.consultafreteapi.utils.RestAssuredExtension;
import io.cucumber.java.Before;

public class TestInitialize {
    @Before
    public void TestSetup(){
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
    }
}
