package com.usa.ri.ies.de.rules;

import com.usa.ri.ies.de.binding.IndivPersonDetails;
import com.usa.ri.ies.de.binding.PlanInfo;

public interface RulesService {
    public PlanInfo executeRules(IndivPersonDetails ipDetails);
}
