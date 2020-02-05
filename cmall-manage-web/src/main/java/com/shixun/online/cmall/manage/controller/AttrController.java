package com.shixun.online.cmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shixun.online.cmall.bean.PmsBaseAttrInfo;
import com.shixun.online.cmall.bean.PmsBaseAttrValue;
import com.shixun.online.cmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;


    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> getAttr(String catalog3Id){
        List<PmsBaseAttrInfo> pbai =attrService.getAttrInfo(catalog3Id);
        return pbai;
    }


    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> pbav =attrService.getAttrValueList(attrId);
        return pbav;
    }

}
