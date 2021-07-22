package com.sparta.ms.restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;


public class RestAssuredTests {

    @Test
    @DisplayName("checkThatResponseCodeForBBCIs200")
    void checkThatResponseCodeForBBCIs200() {
        Response response = RestAssured.get("https://www.bbc.co.uk");

        given().response()
                .when().get("https://www.bbc.co.uk").then().assertThat().statusCode(200);
    }

    @Test
    @DisplayName("checkHeaders")
    void checkHeaders() {
        given().response().when().get("https://www.spartaglobal.com").getHeader("X-Powered-By").equals("ASP.NET");
    }

    @Test
    @DisplayName("jsonPathTest")
    void jsonPathTest() {
        File json = new File("src/test/resources/newStudent.json");
        JsonPath jsonPath = new JsonPath(json);
        System.out.println(jsonPath.getString("Courses"));
        System.out.println(jsonPath.get("Courses").getClass());
    }

}
