package dk.jesperronn.springboot26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RootController {

  @Autowired
  private Environment env;

  @GetMapping("/")
  public String index() {
    return String.format("Greetings from Spring Boot, home: %s", env.getProperty("HOME"));
  }

}
