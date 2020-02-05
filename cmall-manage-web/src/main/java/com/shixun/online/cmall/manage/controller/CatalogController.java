package com.shixun.online.cmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shixun.online.cmall.bean.PmsBaseCatalog1;
import com.shixun.online.cmall.bean.PmsBaseCatalog2;
import com.shixun.online.cmall.bean.PmsBaseCatalog3;
import com.shixun.online.cmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
    List<PmsBaseCatalog1>  pbc1 = catalogService.getCatalog1();
        return pbc1;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2>  pbc2 = catalogService.getCatalog2(catalog1Id);
        return pbc2;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3>  pbc3 = catalogService.getCatalog3(catalog2Id);
        return pbc3;
    }
}
