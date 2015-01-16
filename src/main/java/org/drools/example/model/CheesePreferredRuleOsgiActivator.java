package org.drools.example.model;

import org.drools.example.access.Access;
import org.drools.example.access.Chrome;
import org.drools.example.rule.EntityHelper;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CheesePreferredRuleOsgiActivator implements BundleActivator {

    private KieSession ksession;

    public void start(final BundleContext bc) throws Exception {

        KieServices ks = KieServices.Factory.get();
        KieContainer kcont = ks.newKieClasspathContainer(getClass().getClassLoader());
        KieBase kbase = kcont.getKieBase("sampleDecisionKBase");
        Alias alias ;

        this.ksession = kbase.newKieSession();
        System.out.println("KieSession created.");

        for (int i = 0; i < 10; i++) {
            // Create a Cheese
        	alias = new Alias();
            Cheese aCheese = EntityHelper.createCheese();
            aCheese.setType("stilton");
            ksession.insert(aCheese);
            ksession.insert(alias);
            // Fire the rules
            ksession.fireAllRules();

            // Check Cheese Price
            EntityHelper.cheesePrice(aCheese);
        }

        System.out.println("Cheese added and rules fired.");
    }
    
    public void start1(final BundleContext bc) throws Exception {

        KieServices ks = KieServices.Factory.get();
        KieContainer kcont = ks.newKieClasspathContainer(getClass().getClassLoader());
        KieBase kbase = kcont.getKieBase("sample1DecisionKBase");
        Chrome chrome ;

        this.ksession = kbase.newKieSession();
        System.out.println("KieSession created.");

        for (int i = 0; i < 10; i++) {
            // Create a Cheese
        	chrome = new Chrome();
            Access access = new Access();
            chrome.setAliasName("stilton");
            access.setType("stilton");
          
            ksession.insert(access);
            
            ksession.insert(chrome);
            //ksession.insert(alias);
            // Fire the rules
            ksession.fireAllRules();

            // Check Cheese Price
            //EntityHelper.cheesePrice(aCheese);
            System.out.println("Access added and rules fired.");
        }

        System.out.println("Access added and rules fired.");
    }

    public void stop(final BundleContext bc) throws Exception {
        if (this.ksession != null) {
            this.ksession.dispose();
            System.out.println("KieSession disposed.");
        }
    }

}
