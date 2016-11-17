package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import sakilaTables.Language;

public class LanguageTest {
	
	EntityManagerFactory emf;
	
	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("sakila");

	}

	@Test
	public void test() {
		EntityManager em = emf.createEntityManager();
		Language l = em.find(Language.class, 10);
		assertNotNull(1);
		
		assertEquals(l.getFilmInLanguage().size(), 2);
		
		l = em.find(Language.class, 999);
		assertNull(l);
	}

}
