package com.blog.clienttest;

import java.io.IOException;

import org.springframework.util.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.blog.clientinterface.IJsonModelMapper;
import com.blog.domainmodel.Widgets;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring-test.xml" })
public class JsonModelMapperTest {

	@Autowired
	IJsonModelMapper jsonModelMapper;

	@Test
	public void modelMapping() throws IOException {

		Widgets widgets = (Widgets) jsonModelMapper
				.getJsonFromFile(Widgets.class);

		Assert.notNull(widgets);
		Assert.notNull(widgets.getModels());
	    Assert.notNull(widgets.getModels()==widgets);
	    Assert.notNull(widgets.getModels().size()>0);

	}
}
