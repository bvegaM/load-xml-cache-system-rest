package com.load.xml.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "concepts")
public class Concepts {

    @JacksonXmlElementWrapper(localName = "movementType")
    private List<Concept> concept;
}
