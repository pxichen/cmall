package com.shixun.online.cmall.user.service.impl;

import com.shixun.online.cmall.bean.UmsMember;
import com.shixun.online.cmall.bean.UmsMemberReceiveAddress;
import com.shixun.online.cmall.service.UserService;
import com.shixun.online.cmall.user.mapper.UserMapper;
import com.shixun.online.cmall.user.mapper.UserReceiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserReceiveMapper userReceiveMapper;


    @Override
    public List<UmsMember> getAllUser() {

        return userMapper.selectAll();
    }

    @Override
    public UmsMember selectUserById(String id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(UmsMember ums) {
        int num =userMapper.insert(ums);
        return num;
    }

    @Override
    public int deleteUserById(String id) {
        int num =userMapper.deleteByPrimaryKey(id);
        return num;
    }

    @Override
    public int updateUserById(UmsMember ums) {
        int num =userMapper.updateByPrimaryKey(ums);
        return num;
    }

    @Override
    public List<UmsMemberReceiveAddress> selectUserAndReceiveById(String memberId) {
       UmsMemberReceiveAddress umra= new UmsMemberReceiveAddress();
       umra.setMemberId(memberId);
       List<UmsMemberReceiveAddress> umras = userReceiveMapper.select(umra);


       /* Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umras = userReceiveMapper.selectByExample(example);*/
        return umras;
    }
}
