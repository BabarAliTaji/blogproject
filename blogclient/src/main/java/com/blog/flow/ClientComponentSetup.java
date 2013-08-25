package com.blog.flow;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.clientservice.ModelService;
import com.blog.domainmodel.Widgets;

public class ClientComponentSetup {

	@Autowired
	private ModelService service;

	private Widgets widgets;

	FacesContext context = FacesContext.getCurrentInstance();

	UIViewRoot root = context.getViewRoot();

	private void startModel() throws IOException {

		service.startModel(Widgets.class);

	}

	public void getComponent(String id) throws IOException {

		startModel();

		widgets = (Widgets) service.getModels();

		root.getId();

		System.out.println(widgets);

	}
}
