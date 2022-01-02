package dk.jesperronn.springboot26.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RootController {

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}
