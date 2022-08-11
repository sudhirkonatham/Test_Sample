package com.framework.implementation.api;


import io.restassured.response.Response;
import org.apache.http.HttpHeaders;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class httpRequest {

    public int getHttpResponseCode(String accessToken,String url){
        Response response = given()
                .header(HttpHeaders.AUTHORIZATION, "Bearer "+accessToken)
                .param("layers", "ROAD_GEOM_FC1,LINK_FC1")
                .param("in", "bbox:-97.60115,38.83144,-97.56321,39.05316")
                .when()
                .get(url);
        return response.getStatusCode();
    }

    public int deleteHttpResponseCode(String accessToken,String url) {
        Response response = given()
                .header(HttpHeaders.AUTHORIZATION, "Bearer "+accessToken).when()
                .delete(url);
        return response.getStatusCode();
    }

    public int postHttpResponseCode(String accessToken,String url,String filename){
        Response response = given()
                .header(HttpHeaders.AUTHORIZATION, "Bearer "+accessToken).body(filename).when()
                .post(url);
        return response.getStatusCode();
    }

    public int putHttpResponseCode(String accessToken,String url,String filename){
        Response response = given()
                .header(HttpHeaders.AUTHORIZATION, "Bearer "+accessToken).body(filename).when()
                .put(url);
        return response.getStatusCode();
    }
}