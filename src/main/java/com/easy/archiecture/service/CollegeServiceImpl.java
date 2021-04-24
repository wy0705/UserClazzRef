package com.easy.archiecture.service;

import com.easy.archiecture.dao.CollegeDao;
import com.easy.archiecture.entity.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class CollegeServiceImpl {
    @Autowired
    private CollegeDao collegeDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public College findByCollege(int cid){
        return collegeDao.findByCollege(cid);
    }

    public College findByName(String name){
        return collegeDao.findByName(name);
    }

    public int insertCollege(College college){
        return collegeDao.insertCollege(college);
    }

    public int updateCollege(College college){
        return collegeDao.updateCollege(college);
    }
}
