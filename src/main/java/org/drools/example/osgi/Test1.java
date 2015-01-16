package org.drools.example.osgi;

import org.drools.example.model.CheesePreferredRuleOsgiActivator;
import org.osgi.framework.BundleContext;

public class Test1 {

	
	public static void main(String args[]){
		
		BundleContext b = null;
		
		CheesePreferredRuleOsgiActivator cheesePreferredRuleOsgiActivator = new CheesePreferredRuleOsgiActivator();
		try {
			cheesePreferredRuleOsgiActivator.start1(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
