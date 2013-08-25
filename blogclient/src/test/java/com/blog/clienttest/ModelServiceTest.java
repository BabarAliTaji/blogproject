package com.blog.clienttest;

import java.io.IOException;

import junit.framework.Assert;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.clientinterface.IModelService;
import com.blog.domainmodel.Widgets;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring-test.xml" })
public class ModelServiceTest {

	@Autowired
	private IModelService modelService;


	@org.junit.Before
	public void startService() throws IOException {

		modelService.startModel(Widgets.class);

	}

	@Test
	public void jsonResult() {

		modelService.getModels();

		org.junit.Assert.assertNotNull(modelService.getModels());

	}

}
