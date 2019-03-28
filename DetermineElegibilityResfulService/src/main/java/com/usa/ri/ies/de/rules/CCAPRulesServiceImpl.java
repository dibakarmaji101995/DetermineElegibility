package com.usa.ri.ies.de.rules;

import com.usa.ri.ies.de.binding.IndivPersonDetails;
import com.usa.ri.ies.de.binding.PlanInfo;

public class CCAPRulesServiceImpl implements RulesService {

	@Override
	public PlanInfo executeRules(IndivPersonDetails ipDetails) {
		PlanInfo planInfo=null;
		// logic for rules
		//create PlanInfo class object
		planInfo=new PlanInfo();
		planInfo.setPlanName(ipDetails.getPlanName());
		planInfo.setPlanStatus("Deactivated");
		planInfo.setPerMonthAlotedMoney(0.0f);
		planInfo.setElegStatus("you are not eligible for this plan because your child age is >18");
		//return planInfo
		return planInfo;
	}

}
