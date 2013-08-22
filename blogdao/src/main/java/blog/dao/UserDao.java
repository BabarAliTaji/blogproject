package blog.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import blog.domain.model.BlogUser;

public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void createUser(String password, String username) 
	{
		BlogUser blogUser = new BlogUser();
		blogUser.setPassword(password);
		blogUser.setUsername(username);
		entityManager.persist(blogUser);
		
	}
}
