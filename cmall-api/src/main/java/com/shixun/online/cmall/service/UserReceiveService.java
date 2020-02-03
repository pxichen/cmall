package com.shixun.online.cmall.service;

import com.shixun.online.cmall.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserReceiveService {

    List<UmsMemberReceiveAddress> getAllUserReceive();

    UmsMemberReceiveAddress selectUserReceiveById(String id);

    int addUserReceiveById(UmsMemberReceiveAddress umrs);

    int deleteUserReceiveById(String id);

    int updateReceiveUser(UmsMemberReceiveAddress umrs);
}
