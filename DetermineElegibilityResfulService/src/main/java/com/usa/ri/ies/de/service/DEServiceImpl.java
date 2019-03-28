package com.usa.ri.ies.de.service;

import java.lang.reflect.InvocationTargetException;

import org.springframework.stereotype.Service;

import com.usa.ri.ies.de.binding.IndivPersonDetails;
import com.usa.ri.ies.de.binding.PlanInfo;

@Service("dmService")
public class DEServiceImpl implements DEService {

	@Override
	public PlanInfo determineEligibility(IndivPersonDetails ipDetails) {
	    	Class<?> cla=null;
	    	PlanInfo planInfo=null;
			try {
				cla = Class.forName("com.usa.ri.ies.de.rules."+ipDetails.getPlanName()+"RulesServiceImpl");
				Object obj=cla.getMethod("executeRules",IndivPersonDetails.class).invoke(cla.newInstance(),ipDetails);
		    	planInfo=(PlanInfo) obj;
			}
			catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}
			catch(NoSuchMethodException nsme) {
				nsme.printStackTrace();
			} catch (IllegalAccessException ilae) {
				// TODO Auto-generated catch block
				ilae.printStackTrace();
			} catch (IllegalArgumentException iae) {
				// TODO Auto-generated catch block
				iae.printStackTrace();
			} catch (InvocationTargetException ite) {
				// TODO Auto-generated catch block
				ite.printStackTrace();
			} catch (SecurityException se) {
				// TODO Auto-generated catch block
				se.printStackTrace();
			} catch (InstantiationException ie) {
				// TODO Auto-generated catch block
				ie.printStackTrace();
			}
	    	//return object
	    	return planInfo;
	}

}
