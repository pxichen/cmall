package com.shixun.online.cmall.manage.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.shixun.online.cmall.bean.PmsBaseCatalog1;
import com.shixun.online.cmall.bean.PmsBaseCatalog2;
import com.shixun.online.cmall.bean.PmsBaseCatalog3;
import com.shixun.online.cmall.manage.mapper.Catalog1Mapper;
import com.shixun.online.cmall.manage.mapper.Catalog2Mapper;
import com.shixun.online.cmall.manage.mapper.Catalog3Mapper;
import com.shixun.online.cmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    Catalog1Mapper catalog1Mapper;
    @Autowired
    Catalog2Mapper catalog2Mapper;
    @Autowired
    Catalog3Mapper catalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pbs1 = catalog1Mapper.selectAll();
        return pbs1;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pbc2 = new PmsBaseCatalog2();
        pbc2.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> pbs2 = catalog2Mapper.select(pbc2);
        return pbs2;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pbc3 = new PmsBaseCatalog3();
        pbc3.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> pbs3 = catalog3Mapper.select(pbc3);
        return pbs3;
    }


}
