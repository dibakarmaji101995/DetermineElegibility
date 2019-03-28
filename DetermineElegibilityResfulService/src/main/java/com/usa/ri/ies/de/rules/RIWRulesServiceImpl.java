package com.usa.ri.ies.de.rules;

import com.usa.ri.ies.de.binding.IndivPersonDetails;
import com.usa.ri.ies.de.binding.PlanInfo;

public class RIWRulesServiceImpl implements RulesService {

	@Override
	public PlanInfo executeRules(IndivPersonDetails ipDetails) {
		PlanInfo planInfo=null;
		// logic for rules
		//create PlanInfo class object
		planInfo=new PlanInfo();
		planInfo.setPlanName(ipDetails.getPlanName());
		planInfo.setPlanStatus("Active");
		planInfo.setPerMonthAlotedMoney(50000.0f);
		planInfo.setStartDate("10/21/2019");
		planInfo.setEndDate("1/1/2020");
		planInfo.setElegStatus("you are eligible for this plan");
		//return planInfo
		return planInfo;
	}

}
