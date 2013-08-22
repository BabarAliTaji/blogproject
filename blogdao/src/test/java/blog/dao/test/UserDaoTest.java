package blog.dao.test;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import blog.domain.model.BlogUser;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/app-test.xml" })
public class UserDaoTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Before
	public void before(){
		
		
	}
	
	@Test
	@Transactional
	public void createUser() {
	
		BlogUser blogUser = new  BlogUser();
		blogUser.setPassword("password");
		blogUser.setUsername("ali");
		entityManager.merge(blogUser);
	}

}

