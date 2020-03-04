package com.baidu.accountsvc.dao;

import com.baidu.accountsvc.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountDao {
    public List<Account> findById(Integer id);
}
