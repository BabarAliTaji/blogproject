package com.blog.clientImpl;

import java.io.IOException;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import com.blog.widgets.Widgets;

public class UIComponent {

	private FacesContext context;

	private Widgets widgets;

	private UIViewRoot root;

	public UIComponent() {
	 	
	 	context = FacesContext.getCurrentInstance();
		
	}
	
	
	public void getComponet() throws IOException{
		
		WidgetMapper.getInstance().startWidgets();
		
	}

}
