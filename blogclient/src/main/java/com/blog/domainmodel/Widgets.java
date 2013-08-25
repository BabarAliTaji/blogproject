package com.blog.domainmodel;

import java.util.List;
import com.blog.clientinterface.IModels;

public class Widgets implements IModels {

	private List<Widget> widgets;

	public List<Widget> getModels() {

		return widgets;
	}

	public void setModels(List<Widget> widgets) {
		this.widgets = widgets;
	}

}
