package com.shixun.online.cmall.user.controller;

import com.shixun.online.cmall.bean.UmsMemberReceiveAddress;
import com.shixun.online.cmall.service.UserReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserReceiveController {
    @Autowired
    UserReceiveService userReceiveService;

    //获取所有地址
    @RequestMapping("getAllUserReceive")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAllUserReceive()
    {
        List<UmsMemberReceiveAddress> userReceive =userReceiveService.getAllUserReceive();
        return userReceive;
    }

    //查询单个用户地址
    @RequestMapping(value = "/getUserReceiveById/{id}")
    @ResponseBody
    public UmsMemberReceiveAddress getUserReceiveById(@PathVariable("id") String id)
    {
        UmsMemberReceiveAddress umsMemberReceiveAddress =userReceiveService.selectUserReceiveById(id);
        return umsMemberReceiveAddress;
    }

    //新增单个用户地址
    @RequestMapping(value ="/addUserReceive/{umrs}")
    @ResponseBody
    public String addUserReceiveById(@PathVariable("umrs") UmsMemberReceiveAddress umrs)
    {
        int num =userReceiveService.addUserReceiveById(umrs);
        if(num>0){
            return "新增成功！";
        }
        return "新增失败！";
    }

    //删除单个用户地址
    @RequestMapping("/deleteUserReceiveById/{id}")
    @ResponseBody
    public String deleteUserReceiveById(@PathVariable("id") String id)
    {
        int num =userReceiveService.deleteUserReceiveById(id);
        if(num>0){
            return "删除成功！";
        }
        return "删除失败！";
    }

    //修改单个用户地址
    @RequestMapping("/updateReceiveUser/{umrs}")
    @ResponseBody
    public String updateReceiveUser(@PathVariable("umrs") UmsMemberReceiveAddress umrs)
    {
        int num =userReceiveService.updateReceiveUser(umrs);
        if(num>0){
            return "修改成功！";
        }
        return "修改失败！";
    }
}
