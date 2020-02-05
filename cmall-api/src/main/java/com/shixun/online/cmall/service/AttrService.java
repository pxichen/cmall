package com.shixun.online.cmall.service;

import com.shixun.online.cmall.bean.PmsBaseAttrInfo;
import com.shixun.online.cmall.bean.PmsBaseAttrValue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttrService {
    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
