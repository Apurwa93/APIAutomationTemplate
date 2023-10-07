package com.testingacademy.tests.fullcrud;

import com.testingacademy.endpoints.APIConstants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequestTest {
    @Test
    public void test_get() {

        RequestSpecification r = RestAssured.given();
        r.baseUri(APIConstants.BASE_URL);
        r.basePath(APIConstants.CREATE_GET_POST_URL_BOOKING);
        r.when().get();
        r.then().statusCode(200);

    }
}
