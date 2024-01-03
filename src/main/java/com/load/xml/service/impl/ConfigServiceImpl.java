package com.load.xml.service.impl;

import com.load.xml.service.ConfigService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static com.load.xml.config.XmlConfiguration.CONCEPT_MAP;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Cacheable(value = "descriptionCache", key = "#code")
    @Override
    public String getDescription(String code) {
        return CONCEPT_MAP.get(code).getDescription();
    }
}
