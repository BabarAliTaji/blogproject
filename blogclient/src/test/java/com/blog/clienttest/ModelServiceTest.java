package com.blog.clienttest;

import java.io.IOException;
import org.junit.Test;
import org.junit.Assert;
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

		Assert.assertNotNull(modelService.getModels());

	}

	@Test
	public void setModel() {

		Widgets widgets = (Widgets) modelService.getModels();
		Assert.assertTrue("setModel test", widgets.getModels().get(0) != null);
	}
}
