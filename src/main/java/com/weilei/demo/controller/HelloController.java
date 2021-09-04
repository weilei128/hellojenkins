package com.weilei.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/hello")
  public String index(){
      return "hello jenkins";
  }

  @RequestMapping("/hello2")
  public String index2(){
      return "hello jenkins2";
  }

}
