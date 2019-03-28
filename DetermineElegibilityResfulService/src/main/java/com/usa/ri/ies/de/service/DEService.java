package com.usa.ri.ies.de.service;

import com.usa.ri.ies.de.binding.IndivPersonDetails;
import com.usa.ri.ies.de.binding.PlanInfo;

public interface DEService {
    public PlanInfo determineEligibility(IndivPersonDetails ipDetails);
}     
