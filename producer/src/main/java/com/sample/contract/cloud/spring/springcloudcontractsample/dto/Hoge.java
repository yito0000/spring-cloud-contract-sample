package com.sample.contract.cloud.spring.springcloudcontractsample.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hoge {

    private String id;

    private String value;
}
