package com.easy.archiecture.controller;

import com.easy.archiecture.dao.CollegeDao;
import com.easy.archiecture.entity.College;
import com.easy.archiecture.service.CollegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CollegeController {
    @Autowired
    private CollegeServiceImpl collegeService;
    //insert学校
    @RequestMapping(value = "insert_college",method = RequestMethod.POST)
    @ResponseBody
    public String insertcollege(@RequestBody College college){
        int count=collegeService.insertCollege(college);
        if (count!=0){
            return "添加成功";
        }
        return "未添加成功";
    }
    //update学校信息
    //计算某学校今年的分数线

}
