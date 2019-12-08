package com.internet2.programming.contract.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class Test {
    @GetMapping("/1")
    public String test() {
        return "FUNCIONOU";
    }
}
