package io.bolek;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testCarsEndpoint() {
        given()
          .when().get("/cars")
          .then()
             .statusCode(200)
             .body(notNullValue());
    }

}