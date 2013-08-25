package com.blog.domainmodel;

import com.blog.clientinterface.IModel;

public class Widget implements IModel {

	private String name;
	
	private String title;
	
	private String id;
	

	public String getName() {
	
		return name;

	}
	
	public void setName(String name) {
	
		this.name = name;
	
	}
	
	public String getTitle() {
	
		return title;
	
	}
	
	public void setTitle(String title) {
	
		this.title = title;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
