package com.easy.archiecture.service;

import com.easy.archiecture.dao.UserAndCDao;
import com.easy.archiecture.entity.UserAndC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class UserAndCServiceImpl {
    @Autowired
    private UserAndCDao userAndCDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public List<Integer> findCollegeByuid(int uid){
        return userAndCDao.findCollegeByuid(uid);
    }

    public int insertUandC(UserAndC userAndC){
        return userAndCDao.insertUandC(userAndC);
    }
}
