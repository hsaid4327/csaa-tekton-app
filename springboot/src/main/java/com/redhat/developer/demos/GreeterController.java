package com.redhat.developer.demos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @RequestMapping("/")
  public String hello() {
    return "Hello CSAA from planet tekton version 1";
  }
}
