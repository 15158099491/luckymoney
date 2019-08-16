package com.imooc.luckymoney;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(){

        return "hello,imooc";
    }


}
