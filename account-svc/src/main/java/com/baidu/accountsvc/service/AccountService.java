package com.baidu.accountsvc.service;


import com.baidu.accountsvc.dao.AccountDao;
import com.baidu.accountsvc.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService{

    @Autowired
    AccountDao accountDao;

    public List<Account> findById(Integer id) {
        System.out.println(id);
        return accountDao.findById(id);
    }
}
