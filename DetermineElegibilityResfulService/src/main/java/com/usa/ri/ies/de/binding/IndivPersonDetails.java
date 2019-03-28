package com.usa.ri.ies.de.binding;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType
public class IndivPersonDetails {
	@ApiModelProperty(notes = "This is a individual person name")
     private String indivPerName;
	
	@ApiModelProperty(notes = "This is a plan name")
     private String planName;
	
	@ApiModelProperty(notes = "This is a case name")
     private String caseNum;
}
