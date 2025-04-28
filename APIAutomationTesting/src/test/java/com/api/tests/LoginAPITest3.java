package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest3 {
    @Test(description = "Verify if Login API is working fine")
    public void loginTest(){
        AuthService authService = new AuthService();
        Response response = authService.login("{\"emailId\":\"dgupta@asite.com\",\"password\":\"P@ssw0rd/88\"}");
        System.out.println("Here is the Login API Response:- \n"+ response.asString());
        Assert.assertEquals(response.statusCode(),200);
    }
}
