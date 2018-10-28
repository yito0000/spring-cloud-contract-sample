package com.sample.contract.cloud.spring.springcloudcontractsample.api;

import com.sample.contract.cloud.spring.springcloudcontractsample.ProducerTest;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HelloApiControllerTest extends ProducerTest {

    @Test
    public void validate_shouldMarkClientAsHello() {
        MockMvcRequestSpecification request = given();

        ResponseOptions response = given().spec(request).get("/hello");

        assertThat(response.getStatusCode(), is(200));
    }

}