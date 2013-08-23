package com.blog.flow;

import java.io.Serializable;

import org.springframework.webflow.scope.RequestScope;

/**
 * @author babarsaleem
 * 
 */
public class Flow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String content = "login.xhtml";

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public void getRegister() {
			
			content = "register.xhtml";
	
	}
	
	public void getLogin() {
		
		content = "login.xhtml";
	
	System.out.println(content);
}
public void show(String form){
	
	System.out.println(form);
}

}
