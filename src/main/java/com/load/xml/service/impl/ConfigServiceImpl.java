package com.load.xml.service.impl;

import com.load.xml.constants.Constant;
import com.load.xml.service.ConfigService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class ConfigServiceImpl implements ConfigService {

    @Cacheable(value = "descriptionCache", key = "#code")
    @Override
    public String getDescription(String code) {
        return Constant.CONCEPT_MAP.get(code).getDescription();
    }
}
