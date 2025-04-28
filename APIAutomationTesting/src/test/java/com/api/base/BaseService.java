package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    //BASE URI
    //Creating the REQUEST
    //Handling the RESPONSE

    private static final String BASE_URL = "https://dmssb.asite.com";
    private RequestSpecification requestSpecification;

    public BaseService(){
        requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    protected Response postRequest(String payload, String endPoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
    }
}
