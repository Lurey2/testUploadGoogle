package com.maven.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingProjectApplication.class, args);
	}

}

@RestController
class HelloWorldController {
  @GetMapping("/")
  public String hello() {
    return "hello world!";
  }
}