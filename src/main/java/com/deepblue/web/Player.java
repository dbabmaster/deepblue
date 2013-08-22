package com.deepblue.web;

public class Player {

	 public String id;
		/**  Entry name (Min 1 chars)     */
	    public String name;
		/**  Entry description     */
	    public String description;
    private String watermarkPath;
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
	
	
	public void setWatermarkPath(String watermarkPath) {
		this.watermarkPath = watermarkPath;
	}
	
	public String getWatermarkPath() {
		return watermarkPath;
	}
	
	
	public Integer width;
	public Integer height;

	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
}