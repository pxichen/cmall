package com.shixun.online.cmall.service;

import com.shixun.online.cmall.bean.PmsBaseCatalog1;
import com.shixun.online.cmall.bean.PmsBaseCatalog2;
import com.shixun.online.cmall.bean.PmsBaseCatalog3;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);


}
