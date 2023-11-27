package lk.ijse.micro.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/save")
    public String saveUser(){
        return restTemplate.getForObject("http://localhost:8082/api/v1/order/get",String.class);
    }

    @GetMapping("/test")
    public String test(){
        return "I'm completed";
    }
}