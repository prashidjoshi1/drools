package org.drools.example.model;

import java.io.Serializable;

public class Alias implements Serializable{

    public static String aliasName;
    private String aliasType;
 //private String aliasType;
   
    public Alias() {

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
