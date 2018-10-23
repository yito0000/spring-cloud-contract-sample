package com.sample.contract.cloud.spring.springcloudcontractsample.api;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloApiController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {

        return "hello";
    }
}
