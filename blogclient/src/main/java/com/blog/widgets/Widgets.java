package com.blog.widgets;

import java.util.List;

import com.blog.clientinterface.IModels;

public class Widgets implements IModels{

	private List<Widget> widgets;

	public List<Widget> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<Widget> widgets) {
		this.widgets = widgets;
	}
	
}
