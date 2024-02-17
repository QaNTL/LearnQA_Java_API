import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ParsJsonTest {

    @Test
    public void testParsJSON(){

        Map<String,String> params=new HashMap<>();
        params.put("name","John");
        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();
        String answer=response.get("messages[1].message");
        String answer1=response.get("messages[1].timestamp");
        System.out.println(answer+" "+answer1);
    }
}
