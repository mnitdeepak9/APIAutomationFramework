package com.api.tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginAPITest {

    @Test(description = "Verify if Login API is working fine")
    public void loginTest(){
        baseURI="https://dmssb.asite.com";
        RequestSpecification x = given();  //Specify How Request will going to look
        RequestSpecification y = x.header("Content-Type", "application/xml");
        RequestSpecification z = y.body("{\"emailId\":\"dgupta@asite.com\",\"password\":\"P@ssw0rd/88\"}");

       /* HashMap<String,String> loginParam=new HashMap<String,String>();
        loginParam.put("emailId","dgupta@asite.com");
        loginParam.put("password", "P@ssw0rd/88");

        Response response = given().formParams(loginParam).post("/apilogin/");*/

        Response response = z.post("/apilogin/");

        /*Response response = given().
                baseUri("https://dmssb.asite.com").
                header("Content-Type", "application/xml").
                body("{\"emailId\":\"dgupta@asite.com\",\"password\":\"P@ssw0rd/88\"}").
                post("/apilogin/");*/

        System.out.println("Here is the Login API Response:- \n"+ response);

        Assert.assertEquals(response.statusCode(),200);
    }

}
