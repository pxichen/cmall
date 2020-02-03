package com.shixun.online.cmall.user.service.impl;

import com.shixun.online.cmall.bean.UmsMemberReceiveAddress;
import com.shixun.online.cmall.service.UserReceiveService;
import com.shixun.online.cmall.user.mapper.UserReceiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceReceiveImpl implements UserReceiveService {
    @Autowired
    UserReceiveMapper userReceiveMapper;

    @Override
    public List<UmsMemberReceiveAddress> getAllUserReceive() {

        return userReceiveMapper.selectAll();
    }

    @Override
    public UmsMemberReceiveAddress selectUserReceiveById(String id) {

        return userReceiveMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUserReceiveById(UmsMemberReceiveAddress umrs) {

        return userReceiveMapper.insert(umrs);
    }

    @Override
    public int deleteUserReceiveById(String id) {

        return userReceiveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateReceiveUser(UmsMemberReceiveAddress umrs) {
        return userReceiveMapper.updateByPrimaryKey(umrs);
    }
}
