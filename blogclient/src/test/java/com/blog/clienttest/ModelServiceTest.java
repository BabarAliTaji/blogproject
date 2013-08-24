package com.blog.clienttest;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.blog.clientinterface.IModelService;
import com.blog.widgets.Widgets;

public class ModelServiceTest {

	@Autowired
	private IModelService<Widgets> modelService;
	
	@Test
	public void startService() throws IOException{
		
		modelService.startModel();
		
	}
	
}

