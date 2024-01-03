package com.load.xml.config;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.load.xml.domain.Concept;
import com.load.xml.domain.Concepts;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Configuration
@Slf4j
public class XmlConfiguration {

    public static final Map<String, Concept> CONCEPT_MAP = new HashMap<>();

    @PostConstruct
    public void loadXmlData(){
        try{
            File xmlFile = Paths.get(System.getProperty("user.dir"), "src/main/resources/config.xml").toFile();
            XmlMapper xmlMapper = new XmlMapper();

            Concepts concepts = xmlMapper.readValue(xmlFile, Concepts.class);

            for(Concept concept: concepts.getConcept()){
                log.info("load data code: " + concept.getCode());
                CONCEPT_MAP.put(concept.getCode(), concept);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
