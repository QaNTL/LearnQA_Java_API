import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class GetTest {
    @Test
    public void testAPI(){
        Response response=RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
