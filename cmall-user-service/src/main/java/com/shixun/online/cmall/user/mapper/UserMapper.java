package com.shixun.online.cmall.user.mapper;

import com.shixun.online.cmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<UmsMember> {
    //List<UmsMember> selectAllUser();
}
