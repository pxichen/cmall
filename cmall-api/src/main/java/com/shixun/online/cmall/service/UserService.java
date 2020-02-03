package com.shixun.online.cmall.service;

import com.shixun.online.cmall.bean.UmsMember;
import com.shixun.online.cmall.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<UmsMember> getAllUser();

    UmsMember selectUserById(String id);

    int addUser(UmsMember ums);

    int deleteUserById(String id);

    int updateUserById(UmsMember ums);

    List<UmsMemberReceiveAddress> selectUserAndReceiveById(String memberId);
}
