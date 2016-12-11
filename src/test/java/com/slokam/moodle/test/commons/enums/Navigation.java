package com.slokam.moodle.test.commons.enums;

public enum Navigation {

	REGISTRATION("Registration"),
	NOTIFICATIONS("Notifications"),
	MANAGE_AUTHENTICATION("Plugins","Authentication","Manage authentication"),
	INSTALL_PLUGIN("Plugins","Install plugins"),
	COMMENTS("Reports","Comments");
	
	
	
	private String item;
	private String category; 
	private String subCat;
	
	
	Navigation(String category, String subCat, String item){
		this.category= category;
		this.subCat = subCat;
		this.item = item;
	}
	Navigation(String category,  String item){
		this.category= category;
		this.item = item;
	}
	Navigation(String item){
		this.item = item;
	}
	public String getCategory() {
		return category;
	}
	public String getSubCat() {
		return subCat;
	}
	public String getValue(){
		return item;
	}
}
