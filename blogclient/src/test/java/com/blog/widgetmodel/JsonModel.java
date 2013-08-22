package com.blog.widgetmodel;

import java.io.IOException;

import org.springframework.util.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.inf.IJsonModelMapper;
import com.blog.widgets.Widget;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring-test.xml" })
public class JsonModel {

	@Autowired
	IJsonModelMapper jsonMapper;

	@Test
	public void jsonMap() throws IOException {

		Widget widget = (Widget) jsonMapper.getJsonFromFile(Widget.class);
		Assert.notNull(widget);
	}
}

