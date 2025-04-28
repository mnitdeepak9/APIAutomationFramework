package com.api.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class LoginAPITest4 {
    @Test(description = "Verify if Login API is working fine")
    public void LoginTest() {
        baseURI="https://dmssb.asite.com";
        HashMap<String, String> loginParam = new HashMap<String, String>();
        loginParam.put("emailId","dgupta@asite.com");
        loginParam.put("password","P@ssw0rd/88");

        Response response = given().formParams(loginParam).post("/apilogin/");


        System.out.println("Here is the Login API Response:- \n"+ response.asString());

        Assert.assertEquals(response.statusCode(),200);
    }
}
