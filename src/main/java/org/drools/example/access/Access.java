package org.drools.example.access;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Access implements Serializable {

    public String type;
 	//public String type;
    private String newName;
    private int price;
    
    public static List aliasList;

    public Access() {
    	aliasList = new ArrayList();
    }
    public Access(final String type,
                  final int price) {
        super();
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public List getAliasList() {
		return aliasList;
	}
	public void setAliasList(List aliasList) {
		this.aliasList = aliasList;
	}
	
	
    
    

}
