import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

public class Test01 {

    @Test
    public void apitest() {
        Response response = RestAssured.get("https://postman-echo.com/ip");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        ValidatableResponse validation = response.then();
        validation.statusCode(200);
        validation.contentType(ContentType.JSON);

    }

}
