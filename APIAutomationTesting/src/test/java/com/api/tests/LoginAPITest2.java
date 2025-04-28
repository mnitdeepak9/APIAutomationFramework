package com.api.tests;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

public class LoginAPITest2 {
    @Test(description = "Verify if Login API is working fine")
    public void loginTest(){

        Response response = given().
                baseUri("https://dmssb.asite.com").
                header("Content-Type", "application/xml").
                body("{\"emailId\":\"dgupta@asite.com\",\"password\":\"P@ssw0rd/88\"}").
                post("/apilogin/");

        System.out.println("Here is the Login API Response:- \n"+ response.asString());

        Assert.assertEquals(response.statusCode(),200);
    }
}
