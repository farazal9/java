package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class controller{

@GetMapping("/get")
public String doGet(){
    return"hello iam ur get mapping";
}


@PostMapping("/get")
public String doPsost(){
    return"hello iam ur post mapping";
}
}
