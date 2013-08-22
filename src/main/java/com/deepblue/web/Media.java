package com.deepblue.web;

public class Media {

	 public String id;
		/**  Entry name (Min 1 chars)     */
	    public String name;
		/**  Entry description     */
	    public String description;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}