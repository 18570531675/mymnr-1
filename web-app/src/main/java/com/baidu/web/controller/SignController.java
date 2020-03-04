package com.baidu.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SignController {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @RequestMapping("/signUp")
    @ApiOperation(value = "账户详情",httpMethod = "POST")
    public @ResponseBody
    String signUp(@RequestParam(value = "id") Integer id) {
        System.out.println("查询");
        RestTemplate restTemplate = restTemplateBuilder.build();
        Map<String,Integer> map=new HashMap<String, Integer>();
        //HttpEntity<Accoun> body=new HttpEntity<>(account);
        map.put("id",id);
        String url = "http://localhost:9000/accountsvc/v1/account/findById";
        String result = restTemplate.postForObject(url,map,String.class);
        if ("success".equalsIgnoreCase(result)) {
            return "ok";
        }
        return "err";
    }
}
