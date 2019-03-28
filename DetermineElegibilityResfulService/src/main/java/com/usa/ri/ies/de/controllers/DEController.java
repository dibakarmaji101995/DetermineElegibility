package com.usa.ri.ies.de.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usa.ri.ies.de.binding.IndivPersonDetails;
import com.usa.ri.ies.de.binding.PlanInfo;
import com.usa.ri.ies.de.service.DEService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Swagger2DEController",description="This rest api is for determine plan eligibility")
public class DEController {
    
	@Autowired
	private DEService service;
	
	@ApiOperation(value = "determineElegibility",consumes="application/xml,application/json",
			produces="application/xml,application/json",response=PlanInfo.class,tags="getPlaneEligibilityDetails")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@RequestMapping(value="/determineElegibility",method=RequestMethod.POST,consumes= {"application/xml","application/json"},produces= {"application/json","application/xml"})
	public PlanInfo getPlanEligibilityDetails(@RequestBody IndivPersonDetails ipDetails) {
		PlanInfo planInfo=null;
		//invoke serice class method
		planInfo=service.determineEligibility(ipDetails);
		//return response as object
		return planInfo;
	}
}
