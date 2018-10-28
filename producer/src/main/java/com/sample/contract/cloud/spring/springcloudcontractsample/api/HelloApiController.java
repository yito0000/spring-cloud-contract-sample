package com.sample.contract.cloud.spring.springcloudcontractsample.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.contract.cloud.spring.springcloudcontractsample.dto.Hoge;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloApiController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(Hoge.builder().id("id").value("value").build());

    }
}
