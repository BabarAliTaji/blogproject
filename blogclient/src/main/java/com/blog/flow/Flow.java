package com.blog.flow;

import java.io.Serializable;

import javax.faces.event.AjaxBehaviorEvent;

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

	public void getRegister( ) {
			
			content = "register.xhtml";
		
		System.out.println(content);
	}
	
	public void getLogin() {
		
		content = "login.xhtml";
	
	System.out.println(content);
}


}
