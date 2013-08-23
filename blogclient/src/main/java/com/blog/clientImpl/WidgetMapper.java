package com.blog.clientImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import com.blog.clientinterface.IJsonModelMapper;
import com.blog.clientinterface.IWidgetMapper;
import com.blog.widgets.Widgets;

public class WidgetMapper implements IWidgetMapper {


	/**
	 * 
	 */
	
	//@Autowired
    public IJsonModelMapper jsonModelMapper;
	
	
	public static WidgetMapper instance;

	private Widgets widgets;
	
	
	public static WidgetMapper getInstance() {
	
		return new WidgetMapper();
	}

	
	public Widgets getWidgets() {
		return widgets;
	}

	private void setWidgets(Widgets widgets) {
		this.widgets = widgets;
	}
	

	@Override
	public void startWidgets() throws IOException {
 
		System.out.println(jsonModelMapper);
  
	}
}
