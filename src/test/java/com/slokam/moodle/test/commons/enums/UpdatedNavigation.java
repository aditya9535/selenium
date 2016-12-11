package com.slokam.moodle.test.commons.enums;

public enum UpdatedNavigation {

	MANAGE_AUTHENTICATION("Plugins","Authentication","Manage authentication"),
	INSTALL_PLUGIN("Plugins","Install plugins",null),
	REGISTRATION("Registration",null,null),
	COMMENTS("Reports","Comments","");
	UpdatedNavigation(String category, String subCat, String item){
		this.category= category;
		this.subCat = subCat;
		this.item = item;
	}
	private String item;
	private String category; 
	private String subCat;
	
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
