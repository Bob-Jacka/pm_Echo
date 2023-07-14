package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class pm_echoTest {

    @Test
    public void shouldPost() {


        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")

                .then()
                .body("data", equalTo("some data"))
                .body("headers.host", equalTo("postman-echo.com"))

                .statusCode(200);

    }
}
