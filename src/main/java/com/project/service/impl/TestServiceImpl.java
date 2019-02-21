package com.project.service.impl;


import com.project.dao.mapper.UserMapper;
import com.project.entity.User;
import com.project.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.service.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    UserMapper userMapper;

    public User getUserForTest(){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        List<User> users=userMapper.selectByExample(userExample);
        if(users.size()>0){
            return users.get(0);
        }else
            return null;
     }

}
