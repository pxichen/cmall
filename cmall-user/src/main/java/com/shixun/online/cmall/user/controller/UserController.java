package com.shixun.online.cmall.user.controller;

import com.shixun.online.cmall.bean.UmsMember;
import com.shixun.online.cmall.bean.UmsMemberReceiveAddress;
import com.shixun.online.cmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index()
    {
        return "hello user";
    }

    //获取所有用户
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
        List<UmsMember> umsUserMember =userService.getAllUser();
        return umsUserMember;
    }

    //查询单个用户
    @RequestMapping(value = "/getUserById/{id}")
    @ResponseBody
    public UmsMember getUserById(@PathVariable("id") String id)
    {
        UmsMember umsUserMember =userService.selectUserById(id);
        return umsUserMember;
    }

    //添加单个用户
    @RequestMapping(value ="/addUser/{ums}")
    @ResponseBody
    public String addUserById(@PathVariable("ums") UmsMember ums)
    {
        int num =userService.addUser(ums);
        if(num>0){
            return "新增成功！";
        }
        return "新增失败！";
    }

    //删除单个用户
    @RequestMapping("/deleteUserById/{id}")
    @ResponseBody
    public String deleteUserById(@PathVariable("id") String id)
    {
        int num =userService.deleteUserById(id);
        if(num>0){
            return "删除成功！";
        }
        return "删除失败！";
    }

    //删除单个用户
    @RequestMapping("/updateUser/{ums}")
    @ResponseBody
    public String updateUserById(@PathVariable("ums") UmsMember ums)
    {
        int num =userService.updateUserById(ums);
        if(num>0){
            return "修改成功！";
        }
        return "修改失败！";
    }

    //查询单个用户的收货地址
    @RequestMapping(value = "/getUserAndReceiveByMemberId/{MemberId}")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUserAndReceiveByMemberId(@PathVariable("MemberId") String MemberId)
    {
        List<UmsMemberReceiveAddress> umsUserMember =userService.selectUserAndReceiveById(MemberId);
        return umsUserMember;
    }

}
