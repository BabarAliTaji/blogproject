package com.blog.widgetmodel;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.blog.clientImpl.UIComponent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring-test.xml" })
public class UIComponentTest {

	@Autowired
	UIComponent  uiComponent;
	
	@Test
	public void getComponent() throws IOException{
		
		 uiComponent.getComponet();
		
	}
}
