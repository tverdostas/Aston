import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Tests {
    String paramKey1 = "foo1";
    String paramKey2 = "foo2";
    String paramValue1 = "bar1";
    String paramValue2 = "bar2";
    String paramValue3 = "foo3";
    String paramKey3 = "bar3";
    String paramValue4 = "foo4";
    String paramKey4 = "bar4";
    String paramValue5 = "foo5";
    String paramKey5 = "";
    String paramKey5Replace = "bar5";

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com/";
    }

    @Test
    @DisplayName("Успешное получение существующей записи - метод POST")
    public void TestOneGet() {
        given().get("/get?" + paramKey1 + "=" + paramValue1 + "&" + paramKey2 + "=" + paramValue2)
                .then().statusCode(200)
                .assertThat().body("args." + paramKey1, equalTo(paramValue1))
                .assertThat().body("args." + paramKey2, equalTo(paramValue2));
    }

    @Test
    @DisplayName("Успешное создание записи - метод POST")
    public void TestTwoPost() {
        String json = "{ \"" + paramKey1 + "\": \"" + paramValue1 + "\", \"" + paramKey2 + "\": \"" + paramValue2 + "\"}";

        given().header("Content-type", "application/json")
                .body(json)
                .post("/post")
                .then().statusCode(200)
                .and()
                .assertThat().body("form." + paramKey1, equalTo(paramValue1))
                .assertThat().body("form." + paramKey2, equalTo(paramValue2))
                .assertThat().body("json." + paramKey1, equalTo(paramValue1))
                .assertThat().body("json." + paramKey2, equalTo(paramValue2));
    }

    @Test
    @DisplayName("Ошибка (не задан header) - получение пустого ключа json")
    public void TestTwoPostNegative() {
        String json = "{ \"" + paramKey1 + "\": \"" + paramValue1 + "\", \"" + paramKey2 + "\": \"" + paramValue2 + "\"}";

        given()
                .body(json)
                .post("/post")
                .then().statusCode(200)
                .and()
                .assertThat().body("json", equalTo(null));
    }

    @Test
    @DisplayName("Успешное создание/обновление записи PUT")
    public void TestFreePut() {
        String json = "{ \"" + paramKey3 + "\": \"" + paramValue3 + "\", \"" + paramKey4 + "\": \"" + paramValue4 + "\"}";

        given().header("Content-type", "application/json")
                .body(json)
                .put("/put")
                .then().statusCode(200)
                .assertThat().body("data." + paramKey3, equalTo(paramValue3))
                .assertThat().body("data." + paramKey4, equalTo(paramValue4))
                .assertThat().body("json." + paramKey3, equalTo(paramValue3))
                .assertThat().body("json." + paramKey4, equalTo(paramValue4));
    }

    @Test
    @DisplayName("Успешное обновление записи")
    public void TestFourPatch() {
        String json1 = "{ \"" + paramKey5 + "\": \"" + paramValue5 + "\"}";

        given().header("Content-type", "application/json") // сначала добавляю запись с одним пустым значением
                .body(json1)
                .put("/put")
                .then().statusCode(200);

        String json2 = "{ \"" + paramKey5 + "\": \"" + paramKey5Replace + "\"}";
        given().header("Content-type", "application/json") // затем делаю patch, чтобы "исправить запись"
                .body(json2)
                .patch("/patch")
                .then().statusCode(200);
    }

    @Test
    @DisplayName("Успешное удаление записи")
    public void TestFiveDelete() {
        String json = "{ \"" + paramKey5 + "\": \"" + paramKey5Replace + "\"}";

        given().header("Content-type", "application/json")
                .body(json)
                .delete("/delete")
                .then().statusCode(200);

    }
}
