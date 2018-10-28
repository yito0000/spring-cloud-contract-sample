package com.sample.contract.cloud.spring.springcloudcontractsample;

import com.sample.contract.cloud.spring.springcloudcontractsample.api.HelloApiController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

public class ProducerTest {

    @Before
    public void contextLoads() {
        RestAssuredMockMvc.standaloneSetup(new HelloApiController());
    }

}