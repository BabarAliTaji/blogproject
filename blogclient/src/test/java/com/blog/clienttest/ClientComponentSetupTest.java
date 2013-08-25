package com.blog.clienttest;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.flow.ClientComponentSetup;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring-test.xml" })
public class ClientComponentSetupTest {

	@Autowired
	public ClientComponentSetup clientComponentSetup;
	
	@Test
	public void clientSetup() throws IOException{
		
		clientComponentSetup.getComponent("2");
	}
	
}
