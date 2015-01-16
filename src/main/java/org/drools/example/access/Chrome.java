package org.drools.example.access;

import java.io.Serializable;

public class Chrome implements Serializable{

    public static String aliasName;
    private String aliasType;
   
    public Chrome() {

    }

	public String getAliasName() {
		return aliasName;
	}

	public static void setAliasName(String aliasName1) {
		aliasName = aliasName1;
	}

	public String getAliasType() {
		return aliasType;
	}

	public void setAliasType(String aliasType) {
		this.aliasType = aliasType;
	}
   
    
    

}
