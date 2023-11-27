package lk.ijse.micro.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @GetMapping("/get")
    public String GetOrder(){
        return "getOrder";
    }
}
