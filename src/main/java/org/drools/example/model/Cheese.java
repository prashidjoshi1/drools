package org.drools.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cheese implements Serializable {

    private String type;
    private String newName;
    private int price;
    
    public static List aliasList;

    public Cheese() {
    	aliasList = new ArrayList();
    }
    public Cheese(final String type,
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
	
	public static void setAliasList(Alias alias) {
		aliasList.add(alias);
	}
    
    

}
