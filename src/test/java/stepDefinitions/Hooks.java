package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario() throws IOException
    {		//execute this code only when place id is null
        //write a code that will give you place id
        StepDefinition m=new StepDefinition();
        if(StepDefinition.place_id==null) {
            m.addPlacePayloadWith("Müb", "Deniz", "Amsterdam");
            m.user_calls_with_http_request("AddPlaceAPI", "POST");
            m.verifyPlace_IdCreatedMapsToUsing("Müb", "getPlaceAPI");
        }

    }
}
