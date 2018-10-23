package com.sample.contract.cloud.spring.springcloudcontractsample.api;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class HelloApiControllerTest {

    @Before
    public void contextLoads() {
        RestAssuredMockMvc.standaloneSetup(new HelloApiController());
    }

    @Test
    public void validate_shouldMarkClientAsHello() {
        MockMvcRequestSpecification request = given()
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .body("");

        ResponseOptions response = given().spec(request).get("/hello");

        assertThat(response.getStatusCode(), is(200));
    }

}