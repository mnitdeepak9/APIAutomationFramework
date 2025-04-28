package com.api.base;

import io.restassured.response.Response;

public class AuthService extends BaseService{
    private static final String BASE_PATH = "/apilogin/";

    public Response login(String payload){
        return postRequest(payload, "/apilogin/");
    }


}
