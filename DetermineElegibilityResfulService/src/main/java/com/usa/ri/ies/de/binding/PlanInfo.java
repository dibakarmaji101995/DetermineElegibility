package com.usa.ri.ies.de.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanInfo {
	 @ApiModelProperty(notes = "This is a plan name")
     private String planName;
     
	 @ApiModelProperty(notes = "This is a plan status")
	 private String planStatus;
	 
	 @ApiModelProperty(notes = "This is a plan start date")
     private String startDate;
	 
	 @ApiModelProperty(notes = "This is a plan end date")
     private String endDate;
	 
	 @ApiModelProperty(notes = "This is a plan elegibility status")
     private String elegStatus;
	 
	 @ApiModelProperty(notes = "This is a per month aloted money")
     private Float perMonthAlotedMoney;
}
