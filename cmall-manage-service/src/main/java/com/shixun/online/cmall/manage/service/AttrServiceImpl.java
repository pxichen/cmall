package com.shixun.online.cmall.manage.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.shixun.online.cmall.bean.PmsBaseAttrInfo;
import com.shixun.online.cmall.bean.PmsBaseAttrValue;
import com.shixun.online.cmall.manage.mapper.AttrInfoMapper;
import com.shixun.online.cmall.manage.mapper.AttrValueMapper;
import com.shixun.online.cmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    AttrInfoMapper attrInfoMapper;

    @Autowired
    AttrValueMapper attrValueMapper;
    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id) {
        PmsBaseAttrInfo pbai = new PmsBaseAttrInfo();
        pbai.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pbais = attrInfoMapper.select(pbai);
        return pbais;
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {

        PmsBaseAttrValue pbav = new PmsBaseAttrValue();
        pbav.setAttrId(attrId);
        List<PmsBaseAttrValue> pbavs = attrValueMapper.select(pbav);
        return pbavs;
    }


}
