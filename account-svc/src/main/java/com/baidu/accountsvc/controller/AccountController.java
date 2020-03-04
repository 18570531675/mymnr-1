package com.baidu.accountsvc.controller;

import com.baidu.accountsvc.model.Account;
import com.baidu.accountsvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/findById")
    public String findById(Integer id){
        List<Account> list = this.accountService.findById(id);
        System.out.println(list);
        return "success";
    }


}
