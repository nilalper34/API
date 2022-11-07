package get_request;

import base_url.RestfulBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Get05 extends RestfulBaseUrl {
    /*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends get request to the URL
    Then
        Status code is 200
And
   Among the data there should be someone whose firstname is "Johhny" and lastname is "Dear"
 */

    @Test
    public void get01() {
        //1 set the URL
        spec.pathParam("first","booking").queryParams("firstname","Johhny","lastname","Dear");
        //2 set the Expected Data

        //3 send the Reguest and get the Response
        Response response=given().spec(spec).when().get("/{first}");
        response.prettyPrint();
     // Do Asertion

        assertEquals(200,response.getStatusCode());
        assertTrue(response.asString().contains("bookingid"));

    }
}
